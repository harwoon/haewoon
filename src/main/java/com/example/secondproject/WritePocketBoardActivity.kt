package com.example.secondproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.secondproject.databinding.ActivityPocketBoardBinding
import com.example.secondproject.databinding.ActivityWritePocketBoardBinding

class WritePocketBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityWritePocketBoardBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbarWritePocketBoard)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}