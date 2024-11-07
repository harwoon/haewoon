package com.example.secondproject

import PocketData
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.secondproject.databinding.ItemPocketBinding

class PocketViewHolder(val binding: ItemPocketBinding):
    RecyclerView.ViewHolder(binding.root){
        private val context = binding.root.context

        fun bind(item : PocketData){
            itemView.setOnClickListener{
                val intent : Intent = Intent(context,PocketActivity::class.java)
                intent.run{context.startActivity(this)}
            }
        }
    }

class PocketAdapter(val Items:MutableList<PocketData>):
    RecyclerView.Adapter<PocketViewHolder>(){
    override fun getItemCount(): Int = Items.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PocketViewHolder =
        PocketViewHolder(ItemPocketBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    override fun onBindViewHolder(holder: PocketViewHolder, position: Int) {
        val binding = (holder as PocketViewHolder).binding
        binding.title.text = Items[position].title
        binding.contetnt.text = Items[position].content
        binding.pocketImg.setImageResource(Items[position].img)
    }

}