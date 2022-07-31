package com.didi.koskita.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "rooms_tenant"
)
data class RoomTenantEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "tenant_id")
    val tenantId: UUID,
    @ColumnInfo(name = "boarding_house_id")
    val boardingHouseId: UUID,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "date_entry")
    val dateEntry: Long,
    @ColumnInfo(name = "date_out")
    val dateOut: Long
)
