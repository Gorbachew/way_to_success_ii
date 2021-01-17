package ru.gsw.way_to_success_ii

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_choice_character.*
import kotlinx.android.synthetic.main.choice_character_button.view.*
import ru.gsw.way_to_success_ii.saveSystem.DeleteCharacter
import ru.gsw.way_to_success_ii.saveSystem.DisplayAllCharacters
import ru.gsw.way_to_success_ii.saveSystem.GetCharacter
import ru.gsw.way_to_success_ii.saveSystem.User

class ChoiceCharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice_character)
        setButtonClick()

        DisplayAllCharacters(this).execute()
    }

    @SuppressLint("ClickableViewAccessibility")
    fun displayCharacters(result: List<User>){
        result.forEach{
            val user = it
            val gameButton = layoutInflater.inflate(R.layout.choice_character_button, layout_character_list, false)

            gameButton.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            gameButton.firstname.text = user.firstName
            gameButton.lastname.text = user.lastName
            gameButton.age.text = user.age.toString()
            gameButton.days.text = user.days.toString()
            gameButton.money_rubles.text = user.rubles.toString()
            gameButton.money_dollars.text = user.dollars.toString()
            gameButton.id = it.id
            gameButton.setOnTouchListener { _, event -> onTouch(event, gameButton, it.id) }
            gameButton.create_user_button_delete.setOnClickListener{
                displayAgreeAlert(user)
            }
            layout_character_list.addView(gameButton)
        }
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

    private fun displayAgreeAlert(user: User){
        val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.choice_character_alert_title)
        builder.setMessage(getString(R.string.choice_character_alert_text_part_one) + " " + user.firstName + "?")
        builder.setPositiveButton(R.string.choice_character_alert_agree) { _, _ ->
            DeleteCharacter(this, user).execute()
        }
        builder.setNegativeButton(R.string.choice_character_alert_disagree) { _, _ -> }
        builder.show()
    }


    private fun onTouch(event: MotionEvent, gameButton: View, id: Int): Boolean{
        if(event.action == 0){
            gameButton.isPressed = true
            GetCharacter(this, id).execute()
        }
        else if(event.action == 1) {
            gameButton.isPressed = false
        }
        return true
    }


}