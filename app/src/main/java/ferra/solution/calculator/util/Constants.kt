package ferra.solution.calculator.util

import android.content.Context
import ferra.solution.calculator.R
import ferra.solution.calculator.di.getSharedPrefs

class Constants {

    fun getCurrentLanguage(context: Context): String? {
        return getSharedPrefs(context).getString(context.getString(R.string.pref_language), "en")
    }

    fun setCurrentLanguage(context: Context, lang: String?){
        getSharedPrefs(context).edit().putString(context.getString(R.string.pref_language), lang).apply()
    }

    fun setIsFirstUse(context: Context, isFirstUse: Boolean?){
        getSharedPrefs(context).edit().putBoolean(context.getString(R.string.pref_first_user), isFirstUse?: true).apply()
    }

    fun isFirstUser(context: Context): Boolean{
        return getSharedPrefs(context).getBoolean(context.getString(R.string.pref_first_user), true)
    }


}

