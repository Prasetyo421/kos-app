package com.didi.koskita.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.didi.koskita.data.local.entity.RuleEntity
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface RuleDao {
    @Insert
    suspend fun insert(item: RuleEntity)

    @Query("SELECT * FROM rules WHERE boarding_house_id IN (:boardingHouseId)")
    fun getByBoardingHouseId(boardingHouseId: UUID): Flow<List<RuleEntity>>

    @Delete
    suspend fun delete(item: RuleEntity)
}