package com.example.cpodariu.weatherapp.Domain.commands

import com.example.cpodariu.weatherapp.Data.ForecastRequest
import com.example.cpodariu.weatherapp.Domain.mappers.ForecastDataMapper
import com.example.cpodariu.weatherapp.Domain.model.Forecast
import com.example.cpodariu.weatherapp.Domain.model.ForecastList

/**
 * Created by cpodariu on 28-Feb-18.
 * For any questions please contact me at podariucatalin97@gmail.com
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}