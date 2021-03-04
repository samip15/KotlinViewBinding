package com.sam.viewbindingdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sam.viewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.click.setOnClickListener {
            Toast.makeText(applicationContext, "View Binding Enabled", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,MainActivity2::class.java))
        }
    }
}