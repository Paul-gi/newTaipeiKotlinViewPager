package com.example.newtaipeizookotlin.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\'J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\'\u00a8\u0006\f"}, d2 = {"Lcom/example/newtaipeizookotlin/room/ViewPagerListDataDao;", "", "findListDataStr", "Lcom/example/newtaipeizookotlin/room/ViewPagerListData;", "FragmentPageCode", "", "(Ljava/lang/Integer;)Lcom/example/newtaipeizookotlin/room/ViewPagerListData;", "getViewPagerRawDataList", "", "insertUser", "", "viewPagerListData", "app_debug"})
public abstract interface ViewPagerListDataDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from ViewPagerDataList")
    public abstract java.util.List<com.example.newtaipeizookotlin.room.ViewPagerListData> getViewPagerRawDataList();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ViewPagerDataList WHERE FragmentPageCode in(:FragmentPageCode)")
    public abstract com.example.newtaipeizookotlin.room.ViewPagerListData findListDataStr(@org.jetbrains.annotations.Nullable()
    java.lang.Integer FragmentPageCode);
    
    @androidx.room.Insert()
    public abstract void insertUser(@org.jetbrains.annotations.Nullable()
    com.example.newtaipeizookotlin.room.ViewPagerListData viewPagerListData);
}