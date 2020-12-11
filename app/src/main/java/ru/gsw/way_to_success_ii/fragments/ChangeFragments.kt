package ru.gsw.way_to_success_ii.fragments

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R

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
                ButtonsFragment(_gameActivity, "environment")
            ) }
            "achievements" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "achievements")
            ) }
            "tree" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "tree")
            ) }

            "food" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "food")
            ) }
            "health" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "health")
            ) }
            "mood" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "mood")
            ) }

            "hobbies" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "hobbies")
            ) }
            "freelance" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "freelance")
            ) }
            "legalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "legalwork")
            ) }
            "unlegalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "unlegalwork")
            ) }
            "business" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "business")
            ) }

            "education" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "education")
            ) }
            "property" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "property")
            ) }
            "immovables" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "immovables")
            ) }
            "corruption" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "corruption")
            ) }

            "exchange" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "exchange")
            ) }
            "bank" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "bank")
            ) }
        }

        fragmentTransaction.commit()
    }
}