package com.example.newtaipeizookotlin.fragments

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

    private val mListData = ArrayList<ListData>()

    var mOriginPosition = -1
    var mApiPosition = -1
    var mPageTitle = ""
    var mCanCallApiFlag = false

    fun setApiFlag() {
        Log.d("aaa","ListPageFragment setApiFlag $mOriginPosition.")
        mCanCallApiFlag = true
    }

    fun callApiFromAdapter() {
        callApiThread()
    }


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
        Log.d("aaa","ListPageFragment initView = $mOriginPosition")
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


        mCallViewModel.getNeedCallApi().observe(viewLifecycleOwner) {
            callApiThread()
        }


        mCallViewModel.getDataListObserver().observe(viewLifecycleOwner) { pDataList ->
            pDataList?.let {
                mListData.addAll(it)
            }

            callApiThread()
        }


        //first action
        getRoom()
    }


    private fun callApiThread() {
        Log.d("aaa","ListPageFragment callApiThread = $mCanCallApiFlag, mListData=${mListData.isNotEmpty()}, position=$mOriginPosition")
        if (mListData.isNotEmpty()) {
            Log.d("aaa","ListPageFragment callApiThread uses old data, position=$mOriginPosition")
            mListDataAdapter.setData(mListData)
            mProgressDialogCustom?.dismiss()
            return
        }


        if( mCanCallApiFlag) {
            Log.d("aaa","ListPageFragment callApiThread call api now, position=$mOriginPosition")
            showProgress()
            mCallViewModel.mCallApi(
                mPageTitle,
                (mApiPosition * 20) - 20,
                this.requireContext(),
                mOriginPosition
            )
        }
    }

    private fun getRoom() {
        Thread {
            mCallViewModel.getViewPagerListDataRoom(
                mOriginPosition,
                this.requireContext(),
                mPageTitle
            )
        }.start()
    }
}