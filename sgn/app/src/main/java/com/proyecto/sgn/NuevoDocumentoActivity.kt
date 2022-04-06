package com.proyecto.sgn

import android.content.Intent
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

        binding.btnReportado.setOnClickListener {
            val intent = Intent(NuevoDocumentoActivity@this,ReportadoActivity::class.java)
        startActivity(intent)
        }

        val lista = listOf("Formulario","Introduccion de trabajo","Procedimiento","Manual")

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)
        binding.spinner.adapter=adaptador
    }



}