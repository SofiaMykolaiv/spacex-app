package com.example.spacex_app.utiles

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

private const val YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd'T'HH:mm:ss"
private const val MM_YYYY = "dd/MM/yyyy"

private const val EMPTY = ""

object DateUtils {

    @JvmStatic
    fun formatToLocaleDate(stringDate: String?): String {
        return try {
            val outputFormat: DateFormat = SimpleDateFormat(MM_YYYY, Locale.US)
            val inputFormat: DateFormat = SimpleDateFormat(YYYY_MM_DD_HH_MM_SS, Locale.US)
            val date: Date = inputFormat.parse(stringDate)
            outputFormat.format(date)
        } catch (e: Exception) {
            EMPTY
        }
    }
}