package ru.gsw.way_to_success_ii.saveSystem

import android.annotation.SuppressLint
import android.os.AsyncTask
import android.util.Log
import ru.gsw.way_to_success_ii.ChoiceCharacterActivity
import ru.gsw.way_to_success_ii.main.MainVars

class DisplayAllCharacters(private val activity: ChoiceCharacterActivity) : AsyncTask<Void, Void, List<User>>() {

    override fun doInBackground(vararg params: Void?): List<User> {
        val userDao = MainVars.db.userDao()
        return userDao.getAll()
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onPostExecute(result: List<User>?) {
        super.onPostExecute(result)

        if (result != null) {
            activity.displayCharacters(result)
        }
    }

}


class InsertAll(val user: User) : AsyncTask<Void, Void, List<Long>>() {

    override fun doInBackground(vararg params: Void?): List<Long>? {
        val userDao = MainVars.db.userDao()
        return userDao.insertAll( user)
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

class GetCharacter(private val activity: ChoiceCharacterActivity, private val id: Int): AsyncTask<Void, Void, User>() {

    override fun doInBackground(vararg params: Void?): User {
        val userDao = MainVars.db.userDao()
        return userDao.loadAllByIds(id)
    }

    override fun onPostExecute(result: User?) {
        super.onPostExecute(result)
        if (result != null) {
            MainSaveSystem().loadMain(result)
            activity.openGameActivity()
        }
    }

}