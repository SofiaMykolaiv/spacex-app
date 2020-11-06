package com.example.spacex_app.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TABLE_SHIP")
data class ShipEntity(
    @PrimaryKey @ColumnInfo(name = "id") var id: String = "",
    @ColumnInfo(name = "name") var name: String? = "",
    @ColumnInfo(name = "image_url") var imageUrl: String? = "",
    @ColumnInfo(name = "build_date") var buildDate: String? = ""
)