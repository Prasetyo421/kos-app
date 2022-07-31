package com.didi.koskita.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "rules"
)
data class RuleEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "boarding_house_id")
    val boardingHouseId: UUID,
    @ColumnInfo(name = "rule")
    val rule: String
)