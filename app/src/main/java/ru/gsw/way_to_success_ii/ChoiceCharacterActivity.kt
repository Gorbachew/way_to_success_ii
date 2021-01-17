package ru.gsw.way_to_success_ii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choice_character.*
import ru.gsw.way_to_success_ii.saveSystem.DisplayAllCharacters

class ChoiceCharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_character)
        setButtonClick()

        DisplayAllCharacters(this, layout_character_list).execute()
    }

    fun openGameActivity(){
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }

    fun updateActivity(){
        val intent = Intent(this, ChoiceCharacterActivity::class.java)
        startActivity(intent)
    }

    private fun setButtonClick(){
        choice_user_button.setOnClickListener{
            val intent = Intent(this, CreateCharacterActivity::class.java)
            startActivity(intent)
        }
        choice_user_button_exit.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}