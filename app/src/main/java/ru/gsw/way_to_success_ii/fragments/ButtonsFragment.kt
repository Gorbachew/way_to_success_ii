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


class ButtonsFragment (gameActivity: GameActivity, name: String, background: Int): Fragment() {

    private val _gameActivity = gameActivity
    private val _name = name
    private val _background = background

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buttons, container, false)
        MainVars.currentWindow = _name
        view.textView.text = _name
        view.background_image.setImageResource(_background)

        return view
    }

    override fun onStart() {
        super.onStart()
        MainActions(_gameActivity).updateButton()
    }
}