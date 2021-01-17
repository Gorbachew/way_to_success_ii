package ru.gsw.way_to_success_ii.saveSystem

import ru.gsw.way_to_success_ii.main.MainVars

class MainSaveSystem {

    fun loadMain(user: User){
        MainVars.idCharacter = user.id

        MainVars.max_health = user.max_health
        MainVars.health = user.health
        MainVars.max_mood = user.max_mood
        MainVars.mood = user.mood
        MainVars.max_satiety = user.max_satiety
        MainVars.satiety = user.satiety

        MainVars.first_name = user.firstName
        MainVars.last_name = user.lastName
        MainVars.sex = user.sex
        MainVars.gender = user.gender

        MainVars.respect = user.respect
        MainVars.rubles = user.rubles
        MainVars.dollars = user.dollars

        MainVars.age = user.age
        MainVars.days = user.days
        MainVars.year_days = user.year_days

        MainVars.force = user.force
        MainVars.intelligence = user.intelligence
        MainVars.attractiveness = user.attractiveness
        MainVars.adaptability = user.adaptability
        MainVars.creativity = user.creativity
        MainVars.cheating = user.cheating
        MainVars.luck = user.luck
        MainVars.hard_work = user.hard_work
        MainVars.enterprise = user.enterprise
    }
}