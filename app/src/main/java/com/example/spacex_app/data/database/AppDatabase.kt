package com.example.spacex_app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.spacex_app.data.database.dao.VehicleDao
import com.example.spacex_app.data.database.entity.VehicleEntity

@Database(
    entities = [
        (VehicleEntity::class)
    ], version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun vehicleDao(): VehicleDao
}