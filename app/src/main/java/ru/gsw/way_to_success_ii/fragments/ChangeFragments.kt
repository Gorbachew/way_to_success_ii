package ru.gsw.way_to_success_ii.fragments

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.fragments.character.*
import ru.gsw.way_to_success_ii.fragments.establishments.*
import ru.gsw.way_to_success_ii.fragments.needs.*
import ru.gsw.way_to_success_ii.fragments.quality.*
import ru.gsw.way_to_success_ii.fragments.work.*

class ChangeFragments (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun connectFragments() {
        val fragmentManager = _gameActivity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_place_main,
            СharacteristicsFragment()
        )
        fragmentTransaction.commit()
    }

    fun change(nameFragments: String){

        val fragmentManager = _gameActivity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        when(nameFragments){
            "characteristics" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                СharacteristicsFragment()
            ) }
            "environment" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                EnvironmentFragment()
            ) }
            "achievements" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                AchievementsFragment()
            ) }
            "tree" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                TreeFragment()
            ) }

            "food" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                FoodFragment(_gameActivity)
            ) }
            "health" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                HealthFragment(_gameActivity)
            ) }
            "mood" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                MoodFragment(_gameActivity)
            ) }

            "hobbies" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                HobbiesFragment()
            ) }
            "freelance" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                FreelanceFragment()
            ) }
            "legalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                LegalworkFragment()
            ) }
            "unlegalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                UnlegalworkFragment()
            ) }
            "business" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                BusinessFragment()
            ) }

            "education" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                EducationFragment()
            ) }
            "property" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                PropertyFragment()
            ) }
            "immovables" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ImmovablesFragment()
            ) }
            "corruption" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                CorruptionFragment()
            ) }
            "child" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ChildFragment()
            ) }

            "exchange" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ExchangeFragment()
            ) }
            "bank" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                BankFragment()
            ) }
        }

        fragmentTransaction.commit()
    }
}