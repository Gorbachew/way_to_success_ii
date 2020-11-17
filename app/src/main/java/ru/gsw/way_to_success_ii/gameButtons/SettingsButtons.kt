package ru.gsw.way_to_success_ii.gameButtons

import android.content.Intent
import android.util.Log
import kotlinx.android.synthetic.main.sections_buttons.*
import kotlinx.android.synthetic.main.windows_buttons.*
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.MainActivity

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
        _gameActivity.button_game_windows_two.setOnClickListener { hearth() }
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
        Log.e("TEST", "1")
    }

    fun environment(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        Log.e("TEST", "2")
    }

    fun achievements(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        Log.e("TEST", "3")
    }

    fun tree(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        Log.e("TEST", "4")
    }

    fun exit(){
        ButtonActions(_gameActivity).hidingWindowsButton()
        Log.e("TEST", "5")
        val intent = Intent(_gameActivity, MainActivity::class.java)
        _gameActivity.startActivity(intent)
    }

    fun food(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun hearth(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun mood(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun hobbies(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }
    fun freelance(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun legalwork(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun unlegalwork(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun business(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun education(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun property(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun immovables(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun corruption(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun child(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun bank(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }

    fun exchange(){
        ButtonActions(_gameActivity).hidingWindowsButton()
    }


}