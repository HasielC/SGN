package com.proyecto.sgn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.proyecto.sgn.databinding.ActivityNuevoDocumentoBinding

class NuevoDocumentoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNuevoDocumentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityNuevoDocumentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.spinner

        val lista = listOf("PHP","C++","SQL","Java")

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        binding.spinner.adapter=adaptador
    }



}