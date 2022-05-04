package com.example.newtaipeizookotlin.room;

import java.lang.System;

@androidx.room.Entity(tableName = "user")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/example/newtaipeizookotlin/room/User;", "", "()V", "ChineseName", "", "getChineseName", "()Ljava/lang/String;", "setChineseName", "(Ljava/lang/String;)V", "EnglishName", "getEnglishName", "setEnglishName", "clickPosition", "", "getClickPosition", "()I", "setClickPosition", "(I)V", "pageName", "getPageName", "setPageName", "uid", "getUid", "setUid", "app_debug"})
public final class User {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int uid = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "PageNameTitle")
    private java.lang.String pageName;
    @androidx.room.ColumnInfo(name = "click_position")
    private int clickPosition = 0;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "EnglishName")
    private java.lang.String EnglishName;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "ChineseName")
    private java.lang.String ChineseName;
    
    public User() {
        super();
    }
    
    public final int getUid() {
        return 0;
    }
    
    public final void setUid(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPageName() {
        return null;
    }
    
    public final void setPageName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getClickPosition() {
        return 0;
    }
    
    public final void setClickPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEnglishName() {
        return null;
    }
    
    public final void setEnglishName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChineseName() {
        return null;
    }
    
    public final void setChineseName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}