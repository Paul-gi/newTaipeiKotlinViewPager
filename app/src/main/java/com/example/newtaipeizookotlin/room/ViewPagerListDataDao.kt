package com.example.newtaipeizookotlin.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface ViewPagerListDataDao {

    @Query("SELECT * from ViewPagerDataList")
    fun getViewPagerRawDataList(): List<ViewPagerListData>?


    @Query("SELECT * FROM ViewPagerDataList WHERE FragmentPageCode in(:FragmentPageCode)")
    fun findListDataStr(
        FragmentPageCode: Int?
    ): ViewPagerListData?


    @Insert
    fun insertUser(viewPagerListData: ViewPagerListData?)

}