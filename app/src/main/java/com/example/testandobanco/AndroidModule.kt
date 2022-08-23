package com.example.testandobanco

import org.koin.dsl.module

val androidModule = module {
    single { this }

    single { RoomRepository(ClienteDatabase.getDatabase(context = get())) as ClienteRepository }

    factory { (view: MainActivity) ->
        ClientePresenter(view, repository = get())
    }
}