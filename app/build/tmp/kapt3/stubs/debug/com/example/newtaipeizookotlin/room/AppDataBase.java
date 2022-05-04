package com.example.newtaipeizookotlin.room;

import java.lang.System;

@androidx.room.Database(entities = {com.example.newtaipeizookotlin.room.User.class, com.example.newtaipeizookotlin.room.ViewPagerListData.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\b"}, d2 = {"Lcom/example/newtaipeizookotlin/room/AppDataBase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/example/newtaipeizookotlin/room/UserDao;", "viewPagerListDataDao", "Lcom/example/newtaipeizookotlin/room/ViewPagerListDataDao;", "Companion", "app_debug"})
public abstract class AppDataBase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.newtaipeizookotlin.room.AppDataBase.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static com.example.newtaipeizookotlin.room.AppDataBase instance;
    
    public AppDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.newtaipeizookotlin.room.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.newtaipeizookotlin.room.ViewPagerListDataDao viewPagerListDataDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/newtaipeizookotlin/room/AppDataBase$Companion;", "", "()V", "instance", "Lcom/example/newtaipeizookotlin/room/AppDataBase;", "getInstance", "()Lcom/example/newtaipeizookotlin/room/AppDataBase;", "setInstance", "(Lcom/example/newtaipeizookotlin/room/AppDataBase;)V", "context", "Landroid/content/Context;", "pDBName", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.newtaipeizookotlin.room.AppDataBase getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.Nullable()
        com.example.newtaipeizookotlin.room.AppDataBase p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.Synchronized()
        public final synchronized com.example.newtaipeizookotlin.room.AppDataBase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String pDBName) {
            return null;
        }
    }
}