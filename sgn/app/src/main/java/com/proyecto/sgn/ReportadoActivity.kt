package com.proyecto.sgn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.proyecto.sgn.databinding.ActivityReportadoBinding

class ReportadoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReportadoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityReportadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}