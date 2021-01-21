package ru.gsw.way_to_success_ii.saveSystem

import ru.gsw.way_to_success_ii.main.MainVars

class MainSaveSystem {

    fun loadMain(user: User){
        MainVars.idCharacter = user.id
        MainVars.act = user.act

        MainVars.max_health = user.max_health
        MainVars.health = user.health
        MainVars.max_mood = user.max_mood
        MainVars.mood = user.mood
        MainVars.max_satiety = user.max_satiety
        MainVars.satiety = user.satiety

        MainVars.first_name = user.firstName
        MainVars.last_name = user.lastName
        MainVars.move = user.move
        MainVars.age = user.age
        MainVars.days = user.days
        MainVars.year_days = user.year_days
        MainVars.rubles = user.rubles
        MainVars.dollars = user.dollars
        MainVars.respect = user.respect

        MainVars.sex = user.sex
        MainVars.gender = user.gender

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

    fun createMain(){
        InsertAll(enrichmentUser()).execute()
    }

    fun saveMain(){
        UpdateCharacter(enrichmentUser()).execute()
    }


    private fun enrichmentUser(): User{
        return User(
            MainVars.idCharacter,
            MainVars.act,

            MainVars.max_health,
            MainVars.health,
            MainVars.max_mood,
            MainVars.mood,
            MainVars.max_satiety,
            MainVars.satiety,

            MainVars.first_name,
            MainVars.last_name,
            MainVars.move,
            MainVars.age,
            MainVars.days,
            MainVars.year_days,
            MainVars.rubles,
            MainVars.dollars,
            MainVars.respect,

            MainVars.sex,
            MainVars.gender,

            MainVars.force,
            MainVars.intelligence,
            MainVars.attractiveness,
            MainVars.adaptability,
            MainVars.creativity,
            MainVars.cheating,
            MainVars.luck,
            MainVars.hard_work,
            MainVars.enterprise,
        )
    }
}