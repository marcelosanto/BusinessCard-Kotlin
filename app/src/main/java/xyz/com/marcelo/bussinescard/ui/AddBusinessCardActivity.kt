package xyz.com.marcelo.bussinescard.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import xyz.com.marcelo.bussinescard.databinding.ActivityAddBusinessCardBinding
import xyz.com.marcelo.bussinescard.databinding.ActivityMainBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBusinessCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBusinessCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}