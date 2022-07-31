package com.didi.koskita.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.didi.koskita.data.local.entity.RoomTenantEntity
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface RoomTenantDao {
    @Insert
    suspend fun insert(item: RoomTenantEntity)

    @Query("SELECT * FROM rooms_tenant WHERE id IN (:tenantId)")
    fun getByTenantId(tenantId: UUID): Flow<List<RoomTenantEntity>>

    @Query("SELECT * FROM rooms_tenant WHERE boarding_house_id IN (:boardingHouseId)")
    fun getByBoardingHouseId(boardingHouseId: UUID): Flow<List<RoomTenantEntity>>

    @Delete
    suspend fun delete(item: RoomTenantEntity)
}