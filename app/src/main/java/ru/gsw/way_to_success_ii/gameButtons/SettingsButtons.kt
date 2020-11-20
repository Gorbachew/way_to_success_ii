package ru.gsw.way_to_success_ii.gameButtons

import android.content.Intent
import android.util.Log
import kotlinx.android.synthetic.main.windows_buttons.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.MainActivity
import ru.gsw.way_to_success_ii.fragments.ChangeFragments

class SettingsButtons (gameActivity: GameActivity) {

    private val _gameActivity = gameActivity

    fun character(){
        StateButtons.buttonPressed = "character"
        _gameActivity.button_game_windows_one.setOnClickListener { characteristics() }
        _gameActivity.button_game_windows_two.setOnClickListener { environment() }
        _gameActivity.button_game_windows_three.setOnClickListener { tree() }
        _gameActivity.button_game_windows_four.setOnClickListener { achievements() }
        _gameActivity.button_game_windows_five.setOnClickListener { exit() }
    }
    fun needs(){
        StateButtons.buttonPressed = "needs"
        _gameActivity.button_game_windows_one.setOnClickListener { food() }
        _gameActivity.button_game_windows_two.setOnClickListener { health() }
        _gameActivity.button_game_windows_three.setOnClickListener { mood() }
    }
    fun work(){
        StateButtons.buttonPressed = "work"
        _gameActivity.button_game_windows_one.setOnClickListener { hobbies() }
        _gameActivity.button_game_windows_two.setOnClickListener { freelance() }
        _gameActivity.button_game_windows_three.setOnClickListener { legalwork() }
        _gameActivity.button_game_windows_four.setOnClickListener { unlegalwork() }
        _gameActivity.button_game_windows_five.setOnClickListener { business() }
    }
    fun quality(){
        StateButtons.buttonPressed = "quality"
        _gameActivity.button_game_windows_one.setOnClickListener { education() }
        _gameActivity.button_game_windows_two.setOnClickListener { property() }
        _gameActivity.button_game_windows_three.setOnClickListener { immovables() }
        _gameActivity.button_game_windows_four.setOnClickListener { corruption() }
        _gameActivity.button_game_windows_five.setOnClickListener { child() }
    }
    fun establishments(){
        StateButtons.buttonPressed = "establishments"
        _gameActivity.button_game_windows_one.setOnClickListener { bank() }
        _gameActivity.button_game_windows_two.setOnClickListener { exchange() }
    }

    fun characteristics(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("characteristics")
    }

    fun environment(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("environment")
    }

    fun achievements(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("achievements")
    }

    fun tree(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("tree")
    }

    fun exit(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        val intent = Intent(_gameActivity, MainActivity::class.java)
        _gameActivity.startActivity(intent)
    }

    fun food(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("food")
    }

    fun health(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("health")
    }

    fun mood(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("mood")
    }

    fun hobbies(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("hobbies")
    }
    fun freelance(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("freelance")
    }

    fun legalwork(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("legalwork")
    }

    fun unlegalwork(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("unlegalwork")
    }

    fun business(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("business")
    }

    fun education(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("education")
    }

    fun property(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("property")
    }

    fun immovables(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("immovables")
    }

    fun corruption(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("corruption")
    }

    fun child(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("child")
    }

    fun bank(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("bank")
    }

    fun exchange(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        ChangeFragments(_gameActivity).change("exchange")
    }


}