package ru.gsw.way_to_success_ii.main

import android.view.View
import kotlinx.android.synthetic.main.fragment_characteristics.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.buttons.sectionsButtons.SectionsButtonActions
import ru.gsw.way_to_success_ii.buttons.sectionsButtons.SectionsButtonsState
import ru.gsw.way_to_success_ii.fragments.CharacteristicsFragment

class CheatActions {

    fun cheatModOn(gameActivity: GameActivity, characteristicsView: View){
        characteristicsView.characteristics_police.setOnClickListener {
            MainVars.countCheatMod += 1
            if(MainVars.countCheatMod == 10){
                MainVars.cheatMod = true
                MainActions(gameActivity).toast(gameActivity.resources.getString(R.string.cheat_mod_on))
            }
        }
    }

    fun addedAge(gameActivity: GameActivity, characteristicsFragment: CharacteristicsFragment, characteristicsView: View){
        if(MainVars.cheatMod){
            characteristicsView.characteristics_act.setOnClickListener {
                MainVars.age += 5
                MainActions(gameActivity).checkAct()
                characteristicsFragment.setParam(characteristicsView)
                SectionsButtonActions(gameActivity).enableButtons(SectionsButtonsState.buttonPressed)
            }
            characteristicsView.characteristics_act.setOnLongClickListener {
                MainVars.age -= 5
                MainActions(gameActivity).checkAct()
                characteristicsFragment.setParam(characteristicsView)
                SectionsButtonActions(gameActivity).enableButtons(SectionsButtonsState.buttonPressed)
                return@setOnLongClickListener true
            }
        }
    }

}