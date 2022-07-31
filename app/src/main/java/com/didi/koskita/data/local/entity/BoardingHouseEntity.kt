package com.didi.koskita.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "boarding_houses"
)
data class BoardingHouseEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "owner_name")
    val ownerName: String,
    @ColumnInfo(name = "owner_no_telp")
    val ownerNoTelp: String,
    @ColumnInfo(name = "address")
    val address: String
)