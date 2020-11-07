package com.example.spacex_app.data.database.dao

import androidx.room.*
import com.example.spacex_app.data.database.entity.VehicleEntity

@Dao
interface VehicleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: VehicleEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: List<VehicleEntity>)

    @Delete
    suspend fun delete(obj: VehicleEntity)

    @Query("DELETE FROM TABLE_VEHICLE")
    suspend fun deleteAll()

    @Query("SELECT * FROM TABLE_VEHICLE ORDER BY buildDate DESC")
    suspend fun getVehicleList(): List<VehicleEntity>
}