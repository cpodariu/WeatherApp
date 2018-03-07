package com.example.cpodariu.weatherapp.Domain.mappers

import com.example.cpodariu.weatherapp.Data.Forecast
import com.example.cpodariu.weatherapp.Data.ForecastResult
import com.example.cpodariu.weatherapp.Domain.model.ForecastList
import com.example.cpodariu.weatherapp.Domain.model.Forecast as ModelForecast
import java.text.DateFormat
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Created by cpodariu on 28-Feb-18.
 * For any questions please contact me at podariucatalin97@gmail.com
 */

class ForecastDataMapper {
    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(forecast.city.name, forecast.city.country, convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<Forecast>): List<ModelForecast> {
        return list.mapIndexed { i, forecast ->
            val dt = Calendar.getInstance().timeInMillis + TimeUnit.DAYS.toMillis(i.toLong())
            convertForecastItemToDomain(forecast.copy(dt = dt))
        }
    }

    private fun convertForecastItemToDomain(forecast: Forecast): ModelForecast {
        return ModelForecast(convertDate(forecast.dt), forecast.weather[0].description,
                forecast.temp.max.toInt(), forecast.temp.min.toInt())
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date);
    }
}