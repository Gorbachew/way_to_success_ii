package ru.gsw.way_to_success_ii.saveSystem

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(User::class), version = 3)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}