package com.example.spacex_app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.spacex_app.data.database.dao.DragonDao
import com.example.spacex_app.data.database.dao.RocketDao
import com.example.spacex_app.data.database.dao.ShipDao
import com.example.spacex_app.data.database.entity.DragonEntity
import com.example.spacex_app.data.database.entity.RocketEntity
import com.example.spacex_app.data.database.entity.ShipEntity

@Database(
    entities = [
        (ShipEntity::class),
        (RocketEntity::class),
        (DragonEntity::class)
    ], version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun shipDao(): ShipDao
    abstract fun dragonDao(): DragonDao
    abstract fun rocketDao(): RocketDao
}