package com.example.proudectnew11.adabter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.proudectnew11.R
import com.example.proudectnew11.model.product


class itemAdabter(
    private val context: Context,
    private val dataset: List<product>
): RecyclerView.Adapter<itemAdabter
.ItemViewHolder>() {


    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val buybutoon: Button = view.findViewById(R.id.buybutoon)
        val priceview: TextView = view.findViewById(R.id.priceproduct)
        val name: TextView = view.findViewById(R.id.productName)
        val productimg: ImageView = view.findViewById(R.id.imgProduct)
        val Starfav: ImageView = view.findViewById(R.id.imageView2)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.productimg.setImageResource(item.imageProdct)
        holder.priceview.text= item.price
        holder.name.text = item.name
        holder.Starfav.isVisible = item.isVip
        holder.buybutoon.setOnClickListener {
            if (item.quantityNumber > 0)
                Toast.makeText(context, "item available", Toast.LENGTH_SHORT).show()
            val intent = Intent(context, itemAdabter ::class.java )
            intent.putExtra("name", item.name)
            it.context.startActivity(intent)

        }

    }


    override fun getItemCount() = dataset.size
}


