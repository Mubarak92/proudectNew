package com.example.proudectnew11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.proudectnew11.adabter.itemAdabter
import com.example.proudectnew11.data.datasource
import com.example.proudectnew11.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
      setContentView(binding.root)


        val myDataset = datasource().loadProduct()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = itemAdabter(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}