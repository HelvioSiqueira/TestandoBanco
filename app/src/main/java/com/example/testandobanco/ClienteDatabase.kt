package com.example.testandobanco

import  android.content.Context
import androidx.room.RoomDatabase
import androidx.room.Database
import androidx.room.Room

@Database(entities = [Cliente::class], version = DATABASE_VERSION, exportSchema = false)
abstract class ClienteDatabase : RoomDatabase() {

    abstract fun clienteDao(): ClienteDao

    companion object {
        private var instance: ClienteDatabase? = null

        fun getDatabase(context: Context): ClienteDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    ClienteDatabase::class.java,
                    DATABASE_NAME
                )
                    .allowMainThreadQueries()
                    .build()

            }

            return instance as ClienteDatabase
        }
    }
}