package com.example.newtaipeizookotlin.fragments

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newtaipeizookotlin.R
import com.example.newtaipeizookotlin.adapter.ListDataAdapter
import com.example.newtaipeizookotlin.databinding.ListPageFragmentBinding
import com.example.newtaipeizookotlin.datalist.ListData
import com.example.newtaipeizookotlin.viewmodel.ListPageCallViewModel
import java.util.concurrent.locks.ReentrantLock

class ListPageFragment :
    BaseFragment<ListPageFragmentBinding>() {
    override val mLayout: Int
        get() = R.layout.list_page_fragment

    private var mLinearLayoutManager: LinearLayoutManager? = null
    private var mGridLayoutManager: GridLayoutManager? = null
    private var mIsNoData = false
    private var mPageState = true
    private var mLock = ReentrantLock()
    private val mHandler = Handler(Looper.getMainLooper())

    var mOriginPosition = -1
    var mApiPosition = -1
    var mPageTitle = ""

    private val mCallViewModel: ListPageCallViewModel by lazy {
        ViewModelProvider(this).get(ListPageCallViewModel::class.java)
    }

    private val mListDataAdapter: ListDataAdapter by lazy {
        ListDataAdapter(object : ListDataAdapter.ListDataItf {
            override fun getData(pListData: ListData?) {

            }

        }, requireContext(), mPageTitle, mPageState, myApplication)
    }


    override fun initView() {
        super.initView()
        mLinearLayoutManager = LinearLayoutManager(this.activity)
        mGridLayoutManager = GridLayoutManager(activity, 2)
        mDataBinding.mRecycleView.layoutManager = mLinearLayoutManager

        mDataBinding.mRecycleView.adapter = mListDataAdapter


        //================================RecycleView 到底刷新的部分＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝
        mDataBinding.mRecycleView.setOnScrollChangeListener { _, _, _, _, _ ->
            if (!mDataBinding.mRecycleView.canScrollVertically(1)) {
                if (!mIsNoData) {
                    //  mProgressDialogCustom?.show(parentFragmentManager, "")
                } else {
                    Toast.makeText(activity, "到底了", Toast.LENGTH_SHORT).show()
                }
            }
        }

        mCallViewModel.getDataFinishState().observe(viewLifecycleOwner) { aBoolean ->
            mIsNoData = aBoolean
        }


        mCallViewModel.getDataListObserver().observe(viewLifecycleOwner) { pDataList ->
            if (pDataList != null) {
                mListDataAdapter.setData(pDataList)
                mProgressDialogCustom?.dismiss()
            } else {
//                if (mLock.tryLock()) {
//                    try {
//                        //處理任務
//                        mLock.lock()
//                        callApiThread()
//                    } catch (e: Exception) {
//
//                    } finally {
//                        //釋放鎖
//                        mLock.unlock()
//                        setRoom(mApiPosition, this.requireContext())
//                    }
//                } else {
//                    //如果不能獲取鎖，則直接做其他事情
//                }
                mHandler.postDelayed({ callApiThread() }, 200)
                mHandler.postDelayed({ setRoom(mOriginPosition, this.requireContext()) }, 2000)
            }
        }
        getRoom(mOriginPosition, this.requireContext())

        //callApiThread()
    }

    private fun callApiThread() {
        Thread { mCallViewModel.mCallApi(mPageTitle, (mApiPosition * 20) - 20) }.start()
    }

    private fun getRoom(pPosition: Int, pContext: Context) {
        Thread { mCallViewModel.getViewPagerListDataRoom(pPosition, pContext, mPageTitle) }.start()
    }

    private fun setRoom(pPosition: Int, pContext: Context) {
        Thread { mCallViewModel.setViewPagerListDataRoom(pPosition, pContext) }.start()
    }
}