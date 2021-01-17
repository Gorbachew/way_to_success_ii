package ru.gsw.way_to_success_ii.saveSystem

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?,
    @ColumnInfo(name = "luck") val luck: Int?
){
    constructor(firstName: String, lastName: String, luck: Int) : this(0, firstName, lastName, luck)
}