package com.example.testandobanco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.testandobanco.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val cliente = Cliente(
        0,
        "Helvio",
        "Siqueira",
        24,
        "Rua das Laranjeiras, Qdr 01, Bairro Qualquer, Casa 02"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = ClienteDatabase.getDatabase(this)
        val dbDao = db.clienteDao()

        binding.btn.setOnClickListener {
            for (i in 1..1000000) {
                dbDao.insert(cliente)

                Log.d("HSV", i.toString())
            }

            val quant = dbDao.all().size
            binding.quant.text = quant.toString()
        }
    }
}