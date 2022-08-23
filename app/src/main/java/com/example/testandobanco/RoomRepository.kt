package com.example.testandobanco

class RoomRepository(database: ClienteDatabase): ClienteRepository {

    private val clienteDao = database.clienteDao()

    override fun save(cliente: Cliente){
        clienteDao.insert(cliente)
    }
}