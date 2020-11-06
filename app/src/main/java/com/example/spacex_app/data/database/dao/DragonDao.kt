package com.example.spacex_app.data.database.dao

import androidx.room.*
import com.example.spacex_app.data.database.entity.DragonEntity

@Dao
interface DragonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: DragonEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(obj: List<DragonEntity>)

    @Delete
    suspend fun delete(obj: DragonEntity)

    @Query("DELETE FROM TABLE_DRAGON")
    suspend fun deleteAll()

    @Query("SELECT * FROM TABLE_DRAGON")
    suspend fun getDragonList(): List<DragonEntity>
}