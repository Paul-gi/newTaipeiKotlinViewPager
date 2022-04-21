package com.example.newtaipeizookotlin

import android.app.Application
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.newtaipeizookotlin.datalist.ListData
import com.example.newtaipeizookotlin.fragments.DetailPageFragment
import com.example.newtaipeizookotlin.fragments.GoogleMapFragment
import com.example.newtaipeizookotlin.fragments.HomePageFragment
import com.example.newtaipeizookotlin.fragments.ListPageFragment
import com.example.newtaipeizookotlin.service.RetrofitManager
import com.example.newtaipeizookotlin.service.ZooApiService
import com.example.newtaipeizookotlin.tools.UtilCommonStr
import com.google.gson.JsonObject
import okhttp3.internal.wait
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MyApplication : Application() {

    var mOpenDepartmentSelectPage = false
    lateinit var mParentFragmentManager: FragmentManager
    var mCall: Call<JsonObject>? = null
    var mViewPagerDataList: ArrayList<ListData> = ArrayList<ListData>()
    private val mHandler = Handler(Looper.getMainLooper())


    fun setViewPagerApi() {
//        val pThread = Thread {  }
//        pThread.start()
//        synchronized(pThread) {
//            pThread.wait()
//        }
//        Log.d("GGGG","Plant")
        mCallApi(UtilCommonStr.getInstance().mAnimal)
        mCallApi(UtilCommonStr.getInstance().mPlant)
    }


    fun setMyFragmentManager(pParentFragmentManager: FragmentManager) {
        mParentFragmentManager = pParentFragmentManager
    }

    fun goToPage(pFragment: Fragment? = null, pBundle: Bundle? = null) {
        pFragment?.let {
            goToNextPage(it, pBundle)
        } ?: kotlin.run {
            onBackPage()
        }
    }

//    fun goToNextPage(pFragment: Fragment, pPageTitle: String) {
//        val iBundle = Bundle()
//        iBundle.putString("TitleName", pPageTitle)
//        goToNextPage(pFragment, iBundle)
//    }

    fun goToNextPage(pAddFragment: Fragment, pBundle: Bundle? = null) {

        Log.d("bbb", "GOTOpAddFragment = ${pAddFragment.tag}")
        var iNowFragment = pAddFragment

        for (iNowTag in mParentFragmentManager.fragments) {
            if (iNowTag.tag != null && iNowTag.tag.toString() == HomePageFragment::class.java.simpleName && !iNowTag.isHidden) {
                iNowFragment = iNowTag
                break
            }
            if (iNowTag.tag != null && iNowTag.tag.toString() == ListPageFragment::class.java.simpleName && !iNowTag.isHidden) {
                iNowFragment = iNowTag
                break
            }
            if (iNowTag.tag != null && iNowTag.tag.toString() == DetailPageFragment::class.java.simpleName && !iNowTag.isHidden) {
                iNowFragment = iNowTag
                break
            }
            if (iNowTag.tag != null && iNowTag.tag.toString() == GoogleMapFragment::class.java.simpleName && !iNowTag.isHidden) {
                iNowFragment = iNowTag
                break
            }
            if (iNowTag.tag != null && iNowTag.tag.toString() == com.example.newtaipeizookotlin.fragments.WebViewFragment::class.java.simpleName && !iNowTag.isHidden) {
                iNowFragment = iNowTag
                break
            }
        }
        Log.d("bbb", "GOTOiNowFragment = ${iNowFragment.tag}")

        mParentFragmentManager.beginTransaction()
            .add(
                R.id.mFragment,
                pAddFragment.javaClass,
                pBundle,
                pAddFragment.javaClass.simpleName
            )
            .hide(iNowFragment)
            .addToBackStack(null)
            .commit()
    }


    private fun onBackPage() {
        val iSizeFromFragments = mParentFragmentManager.fragments.size

        if (iSizeFromFragments > 0) {
            var iPreFragment: Fragment = mParentFragmentManager.fragments[0]
            var iNowFragment: Fragment = mParentFragmentManager.fragments[0]

            for (iIndex in 0 until iSizeFromFragments) {
                val iTampFragment = mParentFragmentManager.fragments[iIndex]
                if (!iTampFragment.isHidden && iTampFragment.tag != "com.bumptech.glide.manager") {
                    iNowFragment = iTampFragment
                }

                //因為遇到glide 神奇的問題需要用這種方式遇到跳過處理
                if (iTampFragment.tag == "com.bumptech.glide.manager") {
                    continue
                } else {
                    if (iTampFragment != iNowFragment) {
                        iPreFragment = iTampFragment
                    }
                }
            }
            Log.d("bbb", "BACKiNowFragment = ${iNowFragment.tag}")
            Log.d("bbb", "BACKiPreFragment = ${iPreFragment.tag}")

            if (iNowFragment.tag != null && iNowFragment.tag.toString() == HomePageFragment::class.java.simpleName) {
                if (mOpenDepartmentSelectPage) {
                    //goToNextPage(HomePageFragment())
                    goToNextPage(ListViewPager())
                } else {
                    return
                }
            } else if (mParentFragmentManager.fragments.size <= 2) {
                //goToNextPage(HomePageFragment())
                goToNextPage(ListViewPager())
            } else {
                mParentFragmentManager.beginTransaction()
                    .show(iPreFragment)
                    .remove(iNowFragment)
                    .commit()
            }
        }
    }


    private fun mCallApi(pTitleName: String) {
        val mZooApiService: ZooApiService =
            RetrofitManager().getInstance().createService(ZooApiService::class.java)

        mCall = when (pTitleName) {
            UtilCommonStr.getInstance().mAnimal -> {
                mZooApiService.getAnimalData(100, 0)
            }
            UtilCommonStr.getInstance().mPlant -> {
                mZooApiService.getPlantData(100, 0)
            }
            else -> {
                mZooApiService.getPavilionData(pTitleName, 20, 0)
            }
        }



        mCall?.enqueue(object : Callback<JsonObject?> {
            override fun onResponse(call: Call<JsonObject?>, response: Response<JsonObject?>) {
                try {
                    val iListData: ArrayList<ListData> = ArrayList<ListData>()
                    assert(response.body() != null)
                    val ix = JSONObject(response.body().toString())
                    val iz = ix.getJSONObject("result").getJSONArray("results")
                    for (i in 0 until iz.length()) {
                        val iData = ListData()
                        iData.setData(iz.getJSONObject(i))
                        iData.selectType(pTitleName, false)
                        iListData.add(iData)
                    }

                    mViewPagerDataList += iListData

                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }

            override fun onFailure(call: Call<JsonObject?>, t: Throwable) {
                Log.d("error", t.toString())
            }
        })
    }
}