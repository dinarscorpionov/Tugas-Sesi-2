package com.example.tugas_sesi_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns.*
import androidx.databinding.DataBindingUtil
import com.example.tugas_sesi_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        binding.submitBtn.setOnClickListener { view ->
            if(TextUtils.isEmpty(binding.textNama.text.toString())){
                binding.alertNama.text = "Kosong!"
            } else {
                binding.alertNama.text = ""
            }

            if(TextUtils.isEmpty(binding.textEmail.text.toString())){
                binding.alertEmail.text = "Kosong!"
            } else if (!EMAIL_ADDRESS.matcher(binding.textEmail.text.toString()).matches()) {
                binding.alertEmail.text = "Invalid!"
            } else {
                binding.alertEmail.text = ""
            }

            if(TextUtils.isEmpty(binding.textJurusan.text.toString())){
                binding.alertJurusan.text = "Kosong!"
            } else {
                binding.alertJurusan.text = ""
            }

            if(TextUtils.isEmpty(binding.textSemester.text.toString())){
                binding.alertSemester.text = "Kosong!"
            } else {
                binding.alertSemester.text = ""
            }
        }
    }
}