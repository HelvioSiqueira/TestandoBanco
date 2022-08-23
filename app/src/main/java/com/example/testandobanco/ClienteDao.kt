package com.example.testandobanco

import androidx.room.Insert
import androidx.room.*

@Dao
interface ClienteDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(cliente: Cliente)
}