package ru.gsw.way_to_success_ii

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_create_character.*
import ru.gsw.way_to_success_ii.saveSystem.InsertAll
import ru.gsw.way_to_success_ii.saveSystem.User
import java.util.*
import kotlin.random.Random

class CreateCharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_character)
        setSpinners()
        setButtonClick()
    }

    private fun setButtonClick(){
        create_user_button_ok.setOnClickListener{
            InsertAll(enrichmentUser()).execute()
            val intent = Intent(this, ChoiceCharacterActivity::class.java)
            startActivity(intent)
        }
        create_user_button_exit.setOnClickListener{
            val intent = Intent(this, ChoiceCharacterActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setSpinners(){
        val adapterLuck = ArrayAdapter.createFromResource(this, R.array.create_character_luck_spinner, R.layout.support_simple_spinner_dropdown_item)
        adapterLuck.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        create_character_luck_spinner.adapter = adapterLuck
        create_character_luck_spinner.setSelection(2)

        val adapterGender = ArrayAdapter.createFromResource(this, R.array.create_character_gender_spinner, R.layout.support_simple_spinner_dropdown_item)
        adapterGender.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        create_character_gender_spinner.adapter = adapterGender
    }

    private fun enrichmentUser(): User{

        val gender = getGender()
        val luck = getLuck()
        return User(
            100,
            0,
            100,
            0,
            100,
            0,
            create_character_first_name.text.toString(),
            create_character_last_name.text.toString(),
            0,
            0,
            0,
            0,
            0,
            0,
            recognizeSex(gender),
            gender,
            0,
            0,
            0,
            0,
            0,
            0,
            luck,
            0,
            0
            )

    }

    private fun getGender(): String{
        val gender = create_character_gender_spinner.selectedItem as String
        if(gender == "Случайно"){
            val genderArray = resources.getStringArray(R.array.create_character_gender_spinner)
            return genderArray[Random.nextInt(0, genderArray.size)]
        }
        return gender
    }

    private fun getLuck(): Int{
        val luck = create_character_luck_spinner.selectedItemId.toInt()
        if(luck == 4){
            val luckArray = resources.getStringArray(R.array.create_character_luck_spinner)
            Log.e("TEST", luckArray.size.toString() + " " + Random.nextInt(0, luckArray.size))
            return Random.nextInt(0, luckArray.size)
        }
        return  luck
    }

    private fun recognizeSex(gender: String): Int{
        when(gender){
            "Мужчина" -> return 1
            "Женщина" -> return 2
            "Би" -> return 3
            "Асексуал" -> return 0
            "Трансгендер" -> return 3
            "Майонез" -> return 3
            "Боевой вертолет" -> return 3
            "Билли" -> return 2
            "Червик" -> return 1
        }
        return 0
    }
}