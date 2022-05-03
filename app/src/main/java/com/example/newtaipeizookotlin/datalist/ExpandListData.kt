package com.example.newtaipeizookotlin.datalist

import java.io.Serializable

class ExpandListData : Serializable {
    private var mName: String? = null

    fun setName(pName: String) {
        mName = pName
    }

    fun getName(): String? {
        return mName
    }
}