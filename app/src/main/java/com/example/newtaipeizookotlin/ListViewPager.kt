package com.example.newtaipeizookotlin

import android.animation.ObjectAnimator
import android.os.Looper
import android.util.Log
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.newtaipeizookotlin.adapter.ExpandAdapter
import com.example.newtaipeizookotlin.adapter.ListViewPagerAdapter
import com.example.newtaipeizookotlin.databinding.ListviewpagerBinding
import com.example.newtaipeizookotlin.fragments.BaseFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import androidx.viewpager2.widget.ViewPager2.OFFSCREEN_PAGE_LIMIT_DEFAULT


class ListViewPager : BaseFragment<ListviewpagerBinding>(),
    ExpandAdapter.ExpandRecycleViewClickListener {
    override val mLayout: Int
        get() = R.layout.listviewpager

    private var mViewPagerCount = 5
    private var mExpandArrayList = ArrayList<String>()

    private var mIsScrollEnable = false

    override fun initView() {


        mDataBinding.ExpandBtn.setOnClickListener {
            val toggle = mDataBinding.mExpandRecycleView.mExpandRecycleViewMain.toggle()
            mDataBinding.tvTip.text = if (toggle) {
                "收起"
            } else {
                "展开"
            }
            startImageRotate(mDataBinding.ivArrow, toggle)
        }

        //自動點擊一次按鈕
        //mDataBinding.ExpandBtn.performClick()

        for (i in 0 until mViewPagerCount) {
            mDataBinding.tabLayout.addTab(
                mDataBinding.tabLayout.newTab().setText("動物" + (i + 1).toString())
            )
            mExpandArrayList.add(i, "動物" + (i + 1).toString())
        }
        for (i in 0 until mViewPagerCount) {
            mDataBinding.tabLayout.addTab(
                mDataBinding.tabLayout.newTab().setText("植物" + (i + 1).toString())
            )
            mExpandArrayList.add(i + 5, "植物" + (i + 1).toString())
        }


        val pListViewPagerAdapter =
            ListViewPagerAdapter(
                myApplication.mParentFragmentManager,
                lifecycle,
                mViewPagerCount * 2
            )


        mDataBinding.viewPager2.offscreenPageLimit = OFFSCREEN_PAGE_LIMIT_DEFAULT
        //禁止滑動
        mDataBinding.viewPager2.isUserInputEnabled = mIsScrollEnable
        mDataBinding.viewPager2.adapter = pListViewPagerAdapter



        mDataBinding.tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.position?.let {
                    Log.v("aaa","onTab Selected = $it")
                    mDataBinding.viewPager2.currentItem = it
                    pListViewPagerAdapter.setApiFlag(it)
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Log.v("aaa","onTab Unselected = ${tab?.position}")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Log.v("aaa","onTab Reselected = ${tab?.position}")
                tab?.position?.let {
                    pListViewPagerAdapter.setApiFlag(it)
                }
            }

        })

        mDataBinding.viewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                Log.v("aaa","onPageSelected = $position")
                if( mIsScrollEnable) {
                    mDataBinding.tabLayout.selectTab(mDataBinding.tabLayout.getTabAt(position))
                }
            }
        })

        val pExpandAdapter = ExpandAdapter()
        val iGridLayoutManager = GridLayoutManager(this.requireContext(), 3)
        pExpandAdapter.setData(mExpandArrayList, this)


        mDataBinding.mExpandRecycleView.mExpandRecycleView.layoutManager = iGridLayoutManager
        mDataBinding.mExpandRecycleView.mExpandRecycleView.adapter = pExpandAdapter

        android.os.Handler(Looper.getMainLooper()).postDelayed({
            mDataBinding.tabLayout.selectTab(mDataBinding.tabLayout.getTabAt(0))
        }, 250)
    }



    /**
     * 旋转箭头图标
     */
    private fun startImageRotate(imageView: ImageView, toggle: Boolean) {
        val tarRotate: Float = if (toggle) {
            0f
        } else {
            180f
        }

        imageView.apply {
            ObjectAnimator.ofFloat(this, "rotation", rotation, tarRotate).let {
                it.duration = 500
                it.start()
            }
        }
    }

    override fun onViewClicked(position: Int): Int {
        mDataBinding.viewPager2.currentItem = position
        mDataBinding.tabLayout.selectTab(mDataBinding.tabLayout.getTabAt(position))
        return position
    }
}