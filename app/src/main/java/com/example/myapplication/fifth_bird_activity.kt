package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.example.myapplication.databinding.ActivityForthBinding
import com.squareup.picasso.Picasso

class fifth_bird_activity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView10.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1615146101981-cf25d1a1e6a1?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTl8fGJpcmQlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView9)
    }
    }
