package com.example.cpodariu.weatherapp

import android.util.Log
import java.net.URL

/**
 * Created by cpodariu on 25-Feb-18.
 * For any questions please contact me at podariucatalin97@gmail.com
 */
class Request(val url: String) {
    fun run() {
        val forecastJsonUrl = URL(url).readText();
        Log.d(javaClass.simpleName, forecastJsonUrl);
    }

}