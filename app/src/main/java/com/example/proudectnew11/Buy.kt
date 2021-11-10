package com.example.proudectnew11

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proudectnew11.databinding.ActivityMainBinding
import com.example.proudectnew11.databinding.BuyBinding

class buy : AppCompatActivity() {
    lateinit var binding: BuyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = BuyBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val  intentNameKey = intent.extras!!.getString("name")
        binding.tvBuy.text= intentNameKey

    }
}

