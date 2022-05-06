package com.example.newtaipeizookotlin.adapter

import android.util.Log
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
    private val mFragment = hashMapOf<Int, ListPageFragment>()
    private var mSelected = -1


    override fun getItemCount(): Int {
        return pCount
    }


    override fun createFragment(position: Int): Fragment {
        val iListFragment = ListPageFragment()
        mFragment[position] = iListFragment
        val iApiIndex = position + 1
        Log.v("aaa","createFragment position = $position, mSelected = $mSelected")
        Log.v("aaa","createFragment fragment is ${mFragment[position]}")
        Log.v("aaa","createFragment fragment parent is ${mFragment[position]?.activity}.")

        iListFragment.mOriginPosition = position

        if( mSelected == position) {
            iListFragment.setApiFlag()
        }

        return if (iApiIndex <= 5) {
            setCallAnimal(iListFragment)
            iListFragment.mApiPosition = iApiIndex
            iListFragment
        } else {
            setCallPlant(iListFragment)
            iListFragment.mApiPosition = iApiIndex - 5
            iListFragment
        }


    }


    private fun setCallAnimal(pListFragment: ListPageFragment) {
        pListFragment.mPageTitle = UtilCommonStr.getInstance().mAnimal
    }

    private fun setCallPlant(pListFragment: ListPageFragment) {
        pListFragment.mPageTitle = UtilCommonStr.getInstance().mPlant
    }

    fun setApiFlag(pPosition: Int) {
        Log.v("aaa","setApiFlag = $pPosition")
        Log.v("aaa","setApiFlag fragment is ${mFragment[pPosition]}.")
        Log.v("aaa","setApiFlag fragment parent is ${mFragment[pPosition]?.activity}.")
        mSelected = pPosition
        mFragment[pPosition]?.let {
            mFragment[pPosition]?.setApiFlag()
            if( it.activity != null) {
                mFragment[pPosition]?.callApiFromAdapter()
            }
        }
    }
}

