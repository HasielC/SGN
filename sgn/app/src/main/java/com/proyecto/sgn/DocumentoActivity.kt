package com.proyecto.sgn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proyecto.sgn.databinding.ActivityDocumentoBinding
import com.proyecto.sgn.databinding.ActivityMenuBinding

class DocumentoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDocumentoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDocumentoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNuevoDocumento.setOnClickListener {
        val intent = Intent(DocumentoActivity@this,NuevoDocumentoActivity::class.java)
            startActivity(intent)
        }
    }
}