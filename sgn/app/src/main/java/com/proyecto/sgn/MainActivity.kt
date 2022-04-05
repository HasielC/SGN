package com.proyecto.sgn

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.proyecto.sgn.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnlogin.setOnClickListener {
            val intent = Intent(MainActivity@this,MenuActivity::class.java)
            startActivity(intent)


    }
        val lista = listOf("El Salvador","Guatemala","Honduras","Nicaragua")

        val adaptador = ArrayAdapter(this, R.layout.simple_spinner_item,lista)
        binding.spinner.adapter=adaptador
    }
}