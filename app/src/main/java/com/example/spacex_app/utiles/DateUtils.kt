package com.example.spacex_app.utiles

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

private const val YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd'T'HH:mm:ss.SSSX"
private const val MM_YYYY = "MM/yyyy"

fun formatToLocaleDate(stringDate: String?): String {
    return stringDate?.let {
        val outputFormat: DateFormat = SimpleDateFormat(MM_YYYY, Locale.US)
        val inputFormat: DateFormat = SimpleDateFormat(YYYY_MM_DD_HH_MM_SS, Locale.US)
        val date: Date = inputFormat.parse(it)
        outputFormat.format(date)
    } ?: ""
}