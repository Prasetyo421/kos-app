package com.didi.koskita.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.didi.koskita.data.local.dao.*
import com.didi.koskita.data.local.entity.*

@Database(
    entities = [
        BoardingHouseEntity::class,
        UserEntity::class,
        RoomTenantEntity::class,
        RuleEntity::class,
        ReminderEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun boardingHouseDao(): BoardingHouseDao
    abstract fun reminderDao(): ReminderDao
    abstract fun roomTenantDao(): RoomTenantDao
    abstract fun ruleDao(): RuleDao
    abstract fun userDao(): UserDao
}