package com.didi.koskita.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.didi.koskita.data.local.entity.BoardingHouseEntity
import com.didi.koskita.data.local.entity.ReminderEntity
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface ReminderDao {
    @Insert
    suspend fun insert(item: ReminderEntity)

    @Query("SELECT * FROM reminders WHERE boarding_house_id IN (:boardingHouseId)")
    fun getByBoardingHouseId(boardingHouseId: UUID): Flow<List<BoardingHouseEntity>>

    @Delete
    suspend fun delete(item: ReminderEntity)
}