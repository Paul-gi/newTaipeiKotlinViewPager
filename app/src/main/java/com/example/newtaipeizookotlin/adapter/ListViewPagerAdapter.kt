package com.example.newtaipeizookotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newtaipeizookotlin.fragments.ListPageFragment
import com.example.newtaipeizookotlin.tools.UtilCommonStr

class ListViewPagerAdapter(
    mFragmentManager: FragmentManager,
    mLifecycle: Lifecycle,
    mCount: Int
) : FragmentStateAdapter(mFragmentManager, mLifecycle) {

    private val pCount = mCount

    override fun getItemCount(): Int {
        return pCount
    }


    override fun createFragment(position: Int): Fragment {
        val pListFragment = ListPageFragment()
        val iApiIndex = position + 1
        pListFragment.mOriginPosition = iApiIndex
        return if (iApiIndex <= 5) {
            setCallAnimal(pListFragment)
            pListFragment.mApiPosition = iApiIndex
            pListFragment
        } else {
            setCallPlant(pListFragment)
            pListFragment.mApiPosition = iApiIndex - 5
            pListFragment
        }
    }


    private fun setCallAnimal(pListFragment: ListPageFragment) {
        pListFragment.mPageTitle = UtilCommonStr.getInstance().mAnimal
    }

    private fun setCallPlant(pListFragment: ListPageFragment) {
        pListFragment.mPageTitle = UtilCommonStr.getInstance().mPlant
    }
}

