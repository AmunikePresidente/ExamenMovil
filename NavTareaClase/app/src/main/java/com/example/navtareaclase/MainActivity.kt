package com.example.navtareaclase

import Bombilla.BombillaActivity
import Semaforo.SemaforoActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navtareaclase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBombilla.setOnClickListener(){

            val intent= Intent(this, BombillaActivity::class.java)
            startActivity(intent)

        }

        binding.btnSemaforo.setOnClickListener(){

            val intent= Intent(this, SemaforoActivity::class.java)
            startActivity(intent)

        }
    }
}