package com.proyecto.sgn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.proyecto.sgn.databinding.ActivityMainBinding
import com.proyecto.sgn.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

      binding.btnDocumento.setOnClickListener {
        val intent = Intent(MenuActivity@this,DocumentoActivity::class.java)
          startActivity(intent)
      }


    }
}