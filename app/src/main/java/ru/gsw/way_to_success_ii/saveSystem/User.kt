package ru.gsw.way_to_success_ii.saveSystem

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "act") val act: String,
    @ColumnInfo(name = "max_health") val max_health: Int,
    @ColumnInfo(name = "health") val health: Int,
    @ColumnInfo(name = "max_mood") val max_mood: Int,
    @ColumnInfo(name = "mood") val mood: Int,
    @ColumnInfo(name = "max_satiety") val max_satiety: Int,
    @ColumnInfo(name = "satiety") val satiety: Int,
    @ColumnInfo(name = "first_name") val firstName: String,
    @ColumnInfo(name = "last_name") val lastName: String,
    @ColumnInfo(name = "move") val move: Int,
    @ColumnInfo(name = "age") val age: Int,
    @ColumnInfo(name = "days") val days: Int,
    @ColumnInfo(name = "year_days") val year_days: Int,
    @ColumnInfo(name = "rubles") val rubles: Long,
    @ColumnInfo(name = "dollars") val dollars: Long,
    @ColumnInfo(name = "respect") val respect: Long,
    @ColumnInfo(name = "sex") val sex: Int,
    @ColumnInfo(name = "gender") val gender: String,
    @ColumnInfo(name = "force") val force: Int,
    @ColumnInfo(name = "intelligence") val intelligence: Int,
    @ColumnInfo(name = "attractiveness") val attractiveness: Int,
    @ColumnInfo(name = "adaptability") val adaptability: Int,
    @ColumnInfo(name = "creativity") val creativity: Int,
    @ColumnInfo(name = "cheating") val cheating: Int,
    @ColumnInfo(name = "luck") val luck: Int,
    @ColumnInfo(name = "hard_work") val hard_work: Int,
    @ColumnInfo(name = "enterprise") val enterprise: Int
)