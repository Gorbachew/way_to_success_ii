package ru.gsw.way_to_success_ii.fragments

import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R

class ChangeFragments (private val gameActivity: GameActivity) {



    fun connectFragments() {
        val fragmentManager = gameActivity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragment_place_main,
            CharacteristicsFragment(gameActivity)
        )
        fragmentTransaction.commit()
    }

    fun change(nameFragments: String){

        val fragmentManager = gameActivity.supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        when(nameFragments){
            "characteristics" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                CharacteristicsFragment(gameActivity)
            ) }
            "environment" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "environment", R.drawable.background_mood)
            ) }
            "achievements" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "achievements", R.drawable.background_mood)
            ) }
            "tree" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "tree", R.drawable.background_mood)
            ) }

            "food" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "food", R.drawable.background_food)
            ) }
            "health" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "health", R.drawable.background_health)
            ) }
            "mood" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "mood", R.drawable.background_mood)
            ) }

            "hobbies" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "hobbies", R.drawable.background_hobbies)
            ) }
            "freelance" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "freelance", R.drawable.background_freelance)
            ) }
            "legalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "legalwork", R.drawable.background_mood)
            ) }
            "unlegalwork" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "unlegalwork", R.drawable.background_unlegalwork)
            ) }
            "business" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "business", R.drawable.background_business)
            ) }

            "education" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "education", R.drawable.background_education)
            ) }
            "property" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "property", R.drawable.background_mood)
            ) }
            "immovables" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "immovables", R.drawable.background_mood)
            ) }
            "corruption" -> { fragmentTransaction.replace(R.id.fragment_place_main,
                ButtonsFragment(gameActivity, "corruption", R.drawable.background_mood)
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