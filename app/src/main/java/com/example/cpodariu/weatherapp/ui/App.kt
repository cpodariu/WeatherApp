package com.example.cpodariu.weatherapp.ui

import android.app.Application
import com.example.cpodariu.weatherapp.ui.utils.DelegatesExt

/**
 * Created by cpodariu on 13-Mar-18.
 * For any questions please contact me at podariucatalin97@gmail.com
 */

class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}