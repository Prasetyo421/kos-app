package com.didi.koskita.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(
    tableName = "users_tenant"
)
data class UserEntity(
    @PrimaryKey
    val id: UUID,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "email")
    val email: String,
    @ColumnInfo(name = "no_telp")
    val noTelp: String,
    @ColumnInfo(name = "image_url")
    val imageUrl: String
)
