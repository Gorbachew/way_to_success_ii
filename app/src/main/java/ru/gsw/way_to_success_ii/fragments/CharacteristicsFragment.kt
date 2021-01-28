package ru.gsw.way_to_success_ii.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_characteristics.view.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.main.CheatActions
import ru.gsw.way_to_success_ii.main.MainVars


class CharacteristicsFragment(private val gameActivity: GameActivity) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_characteristics, container, false)
        MainVars.activeFragment = "characteristicsFragments"
        setParam(view)

        return view
    }

    @SuppressLint("SetTextI18n")
    fun setParam(view: View){
        view.characteristics_first_name.text = MainVars.first_name
        view.characteristics_last_name.text = MainVars.last_name
        view.characteristics_sex.text = MainVars.gender
        view.characteristics_age.text = getString(R.string.characteristic_age) + ": " + MainVars.age.toString()
        view.characteristics_act.text = displayAct(MainVars.act)
        CheatActions().addedAge(gameActivity,this, view)
        CheatActions().cheatModOn(gameActivity,view)

        view.characteristics_respect.text = getString(R.string.characteristic_respect) + ": " + MainVars.respect
        view.characteristics_force.text = getString(R.string.characteristic_force) + ": " + MainVars.force
        view.characteristics_intelligence.text = getString(R.string.characteristic_intelligence) + ": " + MainVars.intelligence
        view.characteristics_attractiveness.text = getString(R.string.characteristic_attractiveness) + ": " + MainVars.attractiveness
        view.characteristics_creativity.text = getString(R.string.characteristic_creativity) + ": " + MainVars.creativity
        view.characteristics_adaptability.text = getString(R.string.characteristic_adaptability) + ": " + MainVars.adaptability
        view.characteristics_cheating.text = getString(R.string.characteristic_cheating) + ": " + MainVars.cheating
        view.characteristics_luck.text = getString(R.string.characteristic_luck) + ": " +  resources.getStringArray(R.array.create_character_luck_spinner)[MainVars.luck]
        view.characteristics_hard_work.text = getString(R.string.characteristic_hard_work) + ": " + MainVars.hard_work
        view.characteristics_enterprise.text = getString(R.string.characteristic_enterprise) + ": " + MainVars.enterprise
        view.characteristics_police.text = getString(R.string.characteristic_police) + ": " + MainVars.police
    }

    private fun displayAct(act: String): String{
        when(act){
            "old" -> return resources.getString(R.string.act_old)
            "adult" -> return resources.getString(R.string.act_adult)
            "youth" -> return resources.getString(R.string.act_youth)
            "child" -> return resources.getString(R.string.act_child)
            "baby" -> return resources.getString(R.string.act_baby)
        }
        return "Error display Act"
    }
}