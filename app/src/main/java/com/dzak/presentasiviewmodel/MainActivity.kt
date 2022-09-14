package com.dzak.presentasiviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.dzak.presentasiviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: IniViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(IniViewModel::class.java)

        menampilkanHasil()

        binding.btnHasil.setOnClickListener {
            val ruas = binding.edtRuas.text.toString()

            when{
                ruas.isEmpty() -> {binding.edtRuas.error = "isi dong radius nya kawan...."}
                else -> {
                    viewModel.hitung(ruas)
                    menampilkanHasil()
                }
            }
        }
    }
    fun menampilkanHasil(){
        binding.txtHasil.text = viewModel.result.toString()
    }
}