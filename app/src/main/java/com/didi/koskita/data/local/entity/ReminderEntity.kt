package com.didi.koskita.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "reminders"
)
data class ReminderEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "boarding_house_id")
    val boardingHouseId: String,
    @ColumnInfo(name = "reminder")
    val reminder: String,
    @ColumnInfo(name = "image_url")
    val imageUrl: String
)
