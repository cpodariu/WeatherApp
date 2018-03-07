package com.example.cpodariu.weatherapp.Domain.model

/**
 * Created by cpodariu on 28-Feb-18.
 * For any questions please contact me at podariucatalin97@gmail.com
 */

data class ForecastList(val city: String, val country: String, val dailyForecast:List<Forecast>)
{
    val size: Int
        get() = dailyForecast.size

    operator fun get(position: Int): Forecast = dailyForecast[position]

}