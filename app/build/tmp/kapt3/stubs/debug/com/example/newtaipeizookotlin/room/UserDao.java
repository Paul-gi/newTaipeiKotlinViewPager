package com.example.newtaipeizookotlin.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\'J\u0012\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000bH\'J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/example/newtaipeizookotlin/room/UserDao;", "", "findByName", "Lcom/example/newtaipeizookotlin/room/User;", "type", "", "positionID", "", "EnglishName", "ChineseName", "getUserList", "", "insertUser", "", "users", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * from user")
    public abstract java.util.List<com.example.newtaipeizookotlin.room.User> getUserList();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM user WHERE PageNameTitle in(:type) AND click_position in(:positionID) AND EnglishName in(:EnglishName) AND ChineseName in(:ChineseName) ")
    public abstract com.example.newtaipeizookotlin.room.User findByName(@org.jetbrains.annotations.Nullable()
    java.lang.String type, int positionID, @org.jetbrains.annotations.Nullable()
    java.lang.String EnglishName, @org.jetbrains.annotations.Nullable()
    java.lang.String ChineseName);
    
    @androidx.room.Insert()
    public abstract void insertUser(@org.jetbrains.annotations.Nullable()
    com.example.newtaipeizookotlin.room.User users);
}