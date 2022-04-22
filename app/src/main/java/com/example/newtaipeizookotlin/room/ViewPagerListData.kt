package com.example.newtaipeizookotlin.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ViewPagerDataList")
class ViewPagerListData {
    @PrimaryKey
    @ColumnInfo(name = "FragmentPageCode")
    var FragmentPageCode: Int? = null

    @ColumnInfo(name = "RawListDataStr")
    var RawListDataStr: String? = null

}