package com.example.spacex_app.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TABLE_VEHICLE")
data class VehicleEntity(
    @PrimaryKey @ColumnInfo(name = "id") var id: String = "",
    @ColumnInfo(name = "name") var name: String? = "",
    @ColumnInfo(name = "imageUrl") var imageUrl: String? = "",
    @ColumnInfo(name = "buildDate") var buildDate: String? = ""
)