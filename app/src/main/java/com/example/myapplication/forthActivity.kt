package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityForthBinding
import com.example.myapplication.databinding.ActivitySecondBinding
import com.squareup.picasso.Picasso

class forthActivity : AppCompatActivity() {
    lateinit var binding: ActivityForthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForthBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView8.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1638025877018-b0a0ede79082?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTV8fGJpcmQlMjBwaG90b3N8ZW58MHx8MHx8fDA%3D")
            .into(binding.image7)
    }
}

