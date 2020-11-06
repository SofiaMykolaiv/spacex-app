package com.example.spacex_app.data.database.dao

import androidx.room.*
import com.example.spacex_app.data.database.entity.RocketEntity

@Dao
interface RocketDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: RocketEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: List<RocketEntity>)

    @Delete
    suspend fun delete(obj: RocketEntity)

    @Query("DELETE FROM TABLE_ROCKET")
    suspend fun deleteAll()

    @Query("SELECT * FROM TABLE_ROCKET")
    suspend fun getRocketList(): List<RocketEntity>
}