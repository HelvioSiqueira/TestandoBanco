package com.example.testandobanco

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin

class ClienteApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@ClienteApp)
            modules(androidModule)
        }
    }

    override fun onTerminate() {
        super.onTerminate()
        stopKoin()
    }
}