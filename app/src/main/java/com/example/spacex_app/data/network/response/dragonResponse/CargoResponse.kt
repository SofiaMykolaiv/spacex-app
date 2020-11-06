package com.example.spacex_app.data.network.response.dragonResponse

import com.google.gson.annotations.SerializedName

data class CargoResponse(
    @SerializedName(value = "solar_array")  var solar_array: Int? = 0,
    @SerializedName(value = "unpressurized_cargo")var unpressurized_cargo: Boolean? = false
)