package com.example.testandobanco

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo


@Entity(tableName = TABLE_CLIENTE)
data class Cliente(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = COLUMN_ID)
    val id:Int = 0,
    val nome: String,
    val sobrenome: String,
    val idade: Int,
    val endereco: String
)
