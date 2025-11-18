package com.jimmy.lab_week_11

import android.app.Application
import android.content.Context

class PreferenceApplication : Application() {
    lateinit var preferenceWrapper: PreferenceWrapper
    override fun onCreate() {
        super.onCreate()
        preferenceWrapper = PreferenceWrapper(
            getSharedPreferences(
                    "prefs",
                    Context.MODE_PRIVATE
            )
        )
    }
}