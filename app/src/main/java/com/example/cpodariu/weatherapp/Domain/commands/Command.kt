package com.example.cpodariu.weatherapp.Domain.commands

/**
 * Created by cpodariu on 28-Feb-18.
 * For any questions please contact me at podariucatalin97@gmail.com
 */

public interface Command<out T> {
    fun execute(): T
}