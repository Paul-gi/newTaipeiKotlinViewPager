package com.example.newtaipeizookotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newtaipeizookotlin.datalist.ListData
import com.example.newtaipeizookotlin.fragments.ListPageFragment
import com.example.newtaipeizookotlin.tools.UtilCommonStr
import java.util.ArrayList

class ListViewPagerAdapter(
    mFragmentManager: FragmentManager,
    mLifecycle: Lifecycle,
    mCount: Int
) : FragmentStateAdapter(mFragmentManager, mLifecycle) {

    private val pCount = mCount
    private var mListFragment = ListPageFragment()

    override fun getItemCount(): Int {
        return pCount
    }


    override fun createFragment(position: Int): Fragment {
        val iApiIndex = position + 1
        return if (iApiIndex <= 5) {
            setCallAnimal()
            mListFragment.mApiPosition = iApiIndex
            mListFragment
        } else {
            setCallPlant()
            mListFragment.mApiPosition = iApiIndex - 5
            mListFragment
        }
    }


    private fun setCallAnimal() {
        mListFragment.mPageTitle = UtilCommonStr.getInstance().mAnimal
    }

    private fun setCallPlant() {
        mListFragment.mPageTitle = UtilCommonStr.getInstance().mPlant
    }
}

