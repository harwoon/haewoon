package com.example.secondproject

import PocketData
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondproject.databinding.ActivityMyPocketBoardBinding
import com.example.secondproject.databinding.ActivityPocketBoardBinding

class MyPocketBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMyPocketBoardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val items = mutableListOf<PocketData>() //input data
        for(i in 1..5){
            items.add(PocketData("제목","내용",R.drawable.ic_launcher_background))
        }
        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        binding.recyclerView.adapter = PocketAdapter(items)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL)
        )

        binding.fbtn1.setOnClickListener(){
            if(binding.fbtn1.text == "+"){
                binding.fbtn2.visibility = View.VISIBLE
                binding.fbtn3.visibility = View.VISIBLE
                binding.fbtn4.visibility = View.VISIBLE
                binding.fbtn1.text = "x"
            }

            else{
                binding.fbtn2.visibility = View.GONE
                binding.fbtn3.visibility = View.GONE
                binding.fbtn4.visibility = View.GONE
                binding.fbtn1.text = "+"
            }
        }

        binding.fbtn2.setOnClickListener(){
            val intent: Intent = Intent(this,WritePocketBoardActivity::class.java)
            startActivity(intent)
        }

    }
}