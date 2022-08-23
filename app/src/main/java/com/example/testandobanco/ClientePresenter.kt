package com.example.testandobanco

class ClientePresenter(val view: MainActivity, val repository: ClienteRepository) {
    fun save(cliente: Cliente){
        repository.save(cliente)
    }
}