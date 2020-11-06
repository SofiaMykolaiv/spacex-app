package com.example.spacex_app.data.database.dao

import androidx.room.*
import com.example.spacex_app.data.database.entity.ShipEntity

@Dao
interface ShipDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: ShipEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: List<ShipEntity>)

    @Delete
    suspend fun delete(obj: ShipEntity)

    @Query("DELETE FROM TABLE_SHIP")
    suspend fun deleteAll()

    @Query("SELECT * FROM TABLE_SHIP")
    suspend fun getShipList(): List<ShipEntity>
}