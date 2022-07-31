package com.didi.koskita.data.local.dao

import androidx.room.*
import com.didi.koskita.data.local.entity.BoardingHouseEntity
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface BoardingHouseDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: BoardingHouseEntity)

    @Query("SELECT * FROM boarding_houses WHERE id IN (:boardingHouseId)")
    fun getById(boardingHouseId: UUID): Flow<BoardingHouseEntity>

    @Delete
    suspend fun delete(item: BoardingHouseEntity)
}