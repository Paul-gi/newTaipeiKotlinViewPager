@file:Suppress("PackageName")

package com.example.newtaipeizookotlin.viewmodel

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.newtaipeizookotlin.datalist.ListData
import com.example.newtaipeizookotlin.room.AppDataBase
import com.example.newtaipeizookotlin.room.ViewPagerListData
import com.example.newtaipeizookotlin.service.RetrofitManager
import com.example.newtaipeizookotlin.service.ZooApiService
import com.example.newtaipeizookotlin.tools.UtilCommonStr
import com.google.gson.JsonObject
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ListPageCallViewModel : ViewModel() {
    private val mDataList: MutableLiveData<ArrayList<ListData>?> =
        MutableLiveData<ArrayList<ListData>?>()
    private val mIsNoData = MutableLiveData<Boolean>()
    private var mNeedCallApi: MutableLiveData<Boolean> =
        MutableLiveData<Boolean>()

    private var mIndex = 0
    private var mNotMoreData = false
    private var mGettingData = false
    private var mCall: Call<JsonObject>? = null
    private var mPageTitle = ""

    private var mRawDataStr = ""


    fun getDataListObserver(): MutableLiveData<ArrayList<ListData>?> {
        return mDataList
    }


    fun getDataFinishState(): MutableLiveData<Boolean> {
        return mIsNoData
    }

    fun getNeedCallApi(): MutableLiveData<Boolean> {
        return mNeedCallApi
    }

    fun mCallApi(pTitleName: String, pPosition: Int, pContext: Context, pOriginPosition: Int) {
        val iDataMax = 20
        mPageTitle = pTitleName
        if (mNotMoreData) {
            return
        }
        if (mGettingData) {
            return
        }
        synchronized(this) { mGettingData = true }
        val mZooApiService: ZooApiService =
            RetrofitManager().getInstance().createService(ZooApiService::class.java)


        mCall = when (pTitleName) {
            UtilCommonStr.getInstance().mAnimal -> {
                mZooApiService.getAnimalData(iDataMax, pPosition)
            }
            UtilCommonStr.getInstance().mPlant -> {
                mZooApiService.getPlantData(iDataMax, pPosition)
            }
            else -> {
                mZooApiService.getPavilionData(pTitleName, iDataMax, pPosition)
            }
        }



        mCall?.enqueue(object : Callback<JsonObject?> {
            override fun onResponse(call: Call<JsonObject?>, response: Response<JsonObject?>) {
                try {
                    assert(response.body() != null)
                    val iRawData = response.body().toString()
                    mRawDataStr = iRawData
                    val iListData = setRawDataToArrayList(mRawDataStr, pTitleName)
                    if (iListData.size == iDataMax) {
                        mIndex += iDataMax
                    } else {
                        mNotMoreData = true
                        mIsNoData.postValue(true)
                    }
                    mGettingData = false
                    Thread { setViewPagerListDataRoom(pOriginPosition, pContext) }.start()
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }

            override fun onFailure(call: Call<JsonObject?>, t: Throwable) {
                mDataList.postValue(null)
            }
        })
    }


    fun setRawDataToArrayList(iRawData: String, pTitleName: String): ArrayList<ListData> {
        val iListData: ArrayList<ListData> = ArrayList()
        val ix = JSONObject(iRawData)
        val iz = ix.getJSONObject("result").getJSONArray("results")
        for (i in 0 until iz.length()) {
            val iData = ListData()
            iData.setData(iz.getJSONObject(i))
            iData.selectType(pTitleName, false)
            iListData.add(iData)
        }
        mDataList.postValue(iListData)
        return iListData
    }


    fun setViewPagerListDataRoom(pPosition: Int, pContext: Context) {
        //查詢
        val mApDataBase: AppDataBase? =
            pContext.let { AppDataBase.getInstance(it, "ViewPagerDataList") }
        //插入
        mApDataBase?.viewPagerListDataDao()?.insertUser(
            ViewPagerListData().apply {
                FragmentPageCode = pPosition
                RawListDataStr = mRawDataStr
            }
        )
    }


    fun getViewPagerListDataRoom(pPosition: Int, pContext: Context, pTitleName: String) {
        val iFindDataInRoom = AppDataBase.getInstance(pContext, "ViewPagerDataList")
            ?.viewPagerListDataDao()?.findListDataStr(pPosition)
        if (iFindDataInRoom != null) {
            iFindDataInRoom.RawListDataStr?.let {
                if (it == "") {
                    mNeedCallApi.postValue(true)
                } else {
                    setRawDataToArrayList(it, pTitleName)
                }
            }
        } else {
            mDataList.postValue(null)
        }
    }


}