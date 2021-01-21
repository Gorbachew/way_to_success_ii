package ru.gsw.way_to_success_ii.main

import ru.gsw.way_to_success_ii.saveSystem.UserDatabase

object MainVars {

    lateinit var db: UserDatabase
    var idCharacter: Int = 0

    var act: String = ""

    var currentWindow = ""

    var max_health: Int = 0
    var health: Int = 0
    var max_mood: Int = 0
    var mood: Int = 0
    var max_satiety: Int = 0
    var satiety: Int = 0

    var first_name: String = ""
    var last_name: String = ""

    var move: Int = 0
    var age: Int = 0
    var days: Int = 0
    var year_days = 0

    var respect: Long = 0
    var rubles: Long = 0
    var dollars: Long = 0

    var sex: Int = 0
    var gender: String = ""

    var force: Int = 0
    var intelligence: Int = 0
    var attractiveness: Int = 0
    var creativity: Int = 0
    var adaptability: Int = 0
    var cheating: Int = 0
    var luck: Int = 0
    var hard_work: Int = 0
    var enterprise: Int = 0

    var police: Int = 0

}