package com.didi.koskita.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.didi.koskita.data.local.entity.UserEntity
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface UserDao {
    @Insert
    suspend fun insert(item: UserEntity)

    @Query("SELECT * FROM users_tenant WHERE id IN (:id)")
    fun getById(id: UUID): Flow<UserEntity>

    @Query("SELECT * FROM users_tenant WHERE email IN (:email)")
    fun getByEmail(email: String): Flow<UserEntity>

    @Delete
    suspend fun delete(item: UserEntity)
}