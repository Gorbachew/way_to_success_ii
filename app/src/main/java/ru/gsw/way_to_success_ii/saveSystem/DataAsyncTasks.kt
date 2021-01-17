package ru.gsw.way_to_success_ii.saveSystem

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.AsyncTask
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.choice_character_button.view.*
import kotlinx.android.synthetic.main.game_button.view.*
import kotlinx.android.synthetic.main.game_button.view.game_button_price
import ru.gsw.way_to_success_ii.ChoiceCharacterActivity
import ru.gsw.way_to_success_ii.GameActivity
import ru.gsw.way_to_success_ii.R
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonParameters
import ru.gsw.way_to_success_ii.buttons.gameButtons.GameButtonsSettings
import ru.gsw.way_to_success_ii.main.MainActions
import ru.gsw.way_to_success_ii.main.MainVars

class DisplayAllCharacters(private val activity: ChoiceCharacterActivity, private val layout: LinearLayout) : AsyncTask<Void, Void, List<User>>() {

    override fun doInBackground(vararg params: Void?): List<User> {
        val userDao = MainVars.db.userDao()
        return userDao.getAll()
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onPostExecute(result: List<User>?) {
        super.onPostExecute(result)

        result?.forEach{
            val user = it
            val gameButton = activity.layoutInflater.inflate(R.layout.choice_character_button, layout, false)

            gameButton.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )

            gameButton.firstname.text = user.firstName
            gameButton.lastname.text = user.lastName
            gameButton.id = it.id
            gameButton.setOnTouchListener { _, event -> onTouch(event, gameButton, it.id) }
            gameButton.create_user_button_delete.setOnClickListener{
                displayAgreeAlert(user)
            }
            layout.addView(gameButton)
        }
    }

    private fun displayAgreeAlert(user: User){
        val builder = AlertDialog.Builder(activity)
        builder.setTitle(R.string.choice_character_alert_title)
        builder.setMessage(activity.getString(R.string.choice_character_alert_text_part_one) + " " + user.firstName + "?")
        builder.setPositiveButton(R.string.choice_character_alert_agree) { dialog, which ->
            DeleteCharacter(activity, user).execute()
        }
        builder.setNegativeButton(R.string.choice_character_alert_disagree) { dialog, which -> }
        builder.show()
    }


    private fun onTouch(event: MotionEvent, gameButton: View, id: Int): Boolean{
        if(event.action == 0){
            gameButton.isPressed = true
            activity.openGameActivity()
        }
        else if(event.action == 1) {
            gameButton.isPressed = false
        }
        return true
    }

}


class InsertAll(private val first_name: String, private val last_name: String, private val luck: Int) : AsyncTask<Void, Void, List<Long>>() {

    override fun doInBackground(vararg params: Void?): List<Long>? {
        val userDao = MainVars.db.userDao()
        return userDao.insertAll( User(first_name, last_name, luck))

    }

    override fun onPostExecute(result: List<Long>?) {
        super.onPostExecute(result)
        result?.forEach {
            Log.i("InsertUserId", it.toString())
        }

    }
}

class DeleteCharacter(private val activity: ChoiceCharacterActivity, private val user: User) : AsyncTask<Void, Void, Boolean>(){

    override fun doInBackground(vararg params: Void?): Boolean {
        val userDao = MainVars.db.userDao()
        userDao.delete(user)
        return true
    }

    override fun onPostExecute(result: Boolean) {
        super.onPostExecute(result)
        activity.updateActivity()
    }
}