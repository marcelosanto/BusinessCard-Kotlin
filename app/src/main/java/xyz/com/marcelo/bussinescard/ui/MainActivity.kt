package xyz.com.marcelo.bussinescard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.com.marcelo.bussinescard.R
import xyz.com.marcelo.bussinescard.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}