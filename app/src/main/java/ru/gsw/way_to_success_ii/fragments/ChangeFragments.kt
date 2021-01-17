package ru.gsw.way_to_success_ii.fragments

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.main.MainVars

class ChangeFragments (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun connectFragments() {
        val fragmentManager = _gameActivity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_place_main,
            CharacteristicsFragment()
        )
        fragmentTransaction.commit()
    }

    fun change(nameFragments: String){

        val fragmentManager = _gameActivity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        when(nameFragments){
            "characteristics" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                CharacteristicsFragment()
            ) }
            "environment" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "environment", R.drawable.background_mood)
            ) }
            "achievements" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "achievements", R.drawable.background_mood)
            ) }
            "tree" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "tree", R.drawable.background_mood)
            ) }

            "food" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "food", R.drawable.background_mood)
            ) }
            "health" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "health", R.drawable.background_health)
            ) }
            "mood" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "mood", R.drawable.background_mood)
            ) }

            "hobbies" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "hobbies", R.drawable.background_hobbies)
            ) }
            "freelance" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "freelance", R.drawable.background_mood)
            ) }
            "legalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "legalwork", R.drawable.background_mood)
            ) }
            "unlegalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "unlegalwork", R.drawable.background_mood)
            ) }
            "business" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "business", R.drawable.background_business)
            ) }

            "education" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "education", R.drawable.background_mood)
            ) }
            "property" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "property", R.drawable.background_mood)
            ) }
            "immovables" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "immovables", R.drawable.background_mood)
            ) }
            "corruption" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "corruption", R.drawable.background_mood)
            ) }

            "exchange" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "exchange", R.drawable.background_mood)
            ) }
            "bank" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(_gameActivity, "bank", R.drawable.background_mood)
            ) }
        }

        fragmentTransaction.commit()
    }
}