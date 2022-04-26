package com.example.newtaipeizookotlin

import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.newtaipeizookotlin.adapter.ListViewPagerAdapter
import com.example.newtaipeizookotlin.databinding.ListviewpagerBinding
import com.example.newtaipeizookotlin.fragments.BaseFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class ListViewPager : BaseFragment<ListviewpagerBinding>() {
    override val mLayout: Int
        get() = R.layout.listviewpager

    private var mViewPagerCount = 5


    override fun initView() {

        for (i in 0 until mViewPagerCount) {
            mDataBinding.tabLayout.addTab(
                mDataBinding.tabLayout.newTab().setText("動物" + (i + 1).toString())
            )
        }
        for (i in 0 until mViewPagerCount) {
            mDataBinding.tabLayout.addTab(
                mDataBinding.tabLayout.newTab().setText("植物" + (i + 1).toString())
            )
        }

        val pListViewPagerAdapter =
            ListViewPagerAdapter(
                myApplication.mParentFragmentManager,
                lifecycle,
                mViewPagerCount * 2
            )

        //禁止滑動
        mDataBinding.viewPager2.isUserInputEnabled = false
        mDataBinding.viewPager2.adapter = pListViewPagerAdapter



        mDataBinding.tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                mDataBinding.viewPager2.currentItem = tab.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {

            }

            override fun onTabReselected(tab: TabLayout.Tab) {

            }
        })

        mDataBinding.viewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                mDataBinding.tabLayout.selectTab(mDataBinding.tabLayout.getTabAt(position))
            }
        })
    }
}