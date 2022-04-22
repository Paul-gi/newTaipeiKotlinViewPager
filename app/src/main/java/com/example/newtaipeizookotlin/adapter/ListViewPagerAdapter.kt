package com.example.newtaipeizookotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.newtaipeizookotlin.datalist.ListData
import com.example.newtaipeizookotlin.fragments.ListPageFragment
import java.util.ArrayList

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
        val iApiIndex = position + 1
        return if (iApiIndex <= 5) {
            //return ListPageFragment("動物簡介", position * 20)
            ListPageFragment()
        } else {
            //return ListPageFragment("植物簡介", (position - 5) * 20)
            ListPageFragment()
        }
    }
}

