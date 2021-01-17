package ru.gsw.way_to_success_ii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_choice_character.*
import kotlinx.android.synthetic.main.activity_create_character.*
import ru.gsw.way_to_success_ii.saveSystem.InsertAll

class CreateCharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_character)
        setSpinner()
        setButtonClick()
    }

    fun setButtonClick(){
        create_user_button_ok.setOnClickListener{
            InsertAll(create_character_first_name.text.toString(), create_character_last_name.text.toString(), create_character_luck_spinner.selectedItemId.toInt()).execute()
            val intent = Intent(this, ChoiceCharacterActivity::class.java)
            startActivity(intent)
        }
        create_user_button_exit.setOnClickListener{
            val intent = Intent(this, ChoiceCharacterActivity::class.java)
            startActivity(intent)
        }
    }

    fun setSpinner(){
        val adapter = ArrayAdapter.createFromResource(this, R.array.create_character_luck_spinner, R.layout.support_simple_spinner_dropdown_item)
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        create_character_luck_spinner.adapter = adapter
    }
}