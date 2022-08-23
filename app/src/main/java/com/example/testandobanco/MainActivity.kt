package com.example.testandobanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.core.parameter.parametersOf
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(), MainView {

    private val presenter: ClientePresenter by inject{ parametersOf(this)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cliente = Cliente(0, "Helvio", "Siqueira", 24, "Rua das Laranjeiras, Qdr 01, Bairro Qualquer, Casa 02")

        for(i in 1..100){
            presenter.save(cliente)
        }
    }

    override fun salvar() {
        TODO("Not yet implemented")
    }
}