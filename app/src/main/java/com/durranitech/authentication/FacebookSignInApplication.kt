package com.durranitech.authentication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FacebookSignInApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        FacebookSdk.sdkInitialize(applicationContext)
        AppEventsLogger.activateApp(this)
    }

}