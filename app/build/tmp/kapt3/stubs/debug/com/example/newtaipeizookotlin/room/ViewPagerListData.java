package com.example.newtaipeizookotlin.room;

import java.lang.System;

@androidx.room.Entity(tableName = "ViewPagerDataList")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/newtaipeizookotlin/room/ViewPagerListData;", "", "()V", "FragmentPageCode", "", "getFragmentPageCode", "()Ljava/lang/Integer;", "setFragmentPageCode", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "RawListDataStr", "", "getRawListDataStr", "()Ljava/lang/String;", "setRawListDataStr", "(Ljava/lang/String;)V", "app_debug"})
public final class ViewPagerListData {
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "FragmentPageCode")
    @androidx.room.PrimaryKey()
    private java.lang.Integer FragmentPageCode;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "RawListDataStr")
    private java.lang.String RawListDataStr;
    
    public ViewPagerListData() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFragmentPageCode() {
        return null;
    }
    
    public final void setFragmentPageCode(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRawListDataStr() {
        return null;
    }
    
    public final void setRawListDataStr(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}