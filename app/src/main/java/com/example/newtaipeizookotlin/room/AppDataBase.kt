package com.example.newtaipeizookotlin.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [User::class], version = 2, exportSchema = false)
abstract class AppDataBase : RoomDatabase() {


    companion object {
        var instance: AppDataBase? = null

        @Synchronized
        fun getInstance(context: Context, pDBName: String): AppDataBase? {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    pDBName
                )
                    .fallbackToDestructiveMigration()
                    .build()
            }
            return instance
        }
    }


    abstract fun userDao(): UserDao
    abstract fun viewPagerListDataDao(): ViewPagerListDataDao

}