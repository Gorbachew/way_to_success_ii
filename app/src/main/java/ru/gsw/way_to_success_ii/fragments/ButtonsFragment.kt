package ru.gsw.way_to_success_ii.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_buttons.*
import kotlinx.android.synthetic.main.fragment_buttons.view.*
import kotlinx.android.synthetic.main.fragment_buttons.view.buttons_fragment_main_layout
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonsActions
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.main.MainVars


class ButtonsFragment (private val gameActivity: GameActivity, private val name: String, private val background: Int): Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buttons, container, false)
        MainVars.currentWindow = name
        view.textView.text = name
        view.background_image.setImageResource(background)

        return view
    }

    override fun onStart() {
        super.onStart()
        MainActions(gameActivity).updateButton()
    }
}