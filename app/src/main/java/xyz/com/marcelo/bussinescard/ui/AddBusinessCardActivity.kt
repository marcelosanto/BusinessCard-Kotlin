package xyz.com.marcelo.bussinescard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xyz.com.marcelo.bussinescard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddBusinessCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddBusinessCardBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        insertListeners()
    }

    private fun insertListeners() {
        binding.btnClose.setOnClickListener {
            finish()
        }

        binding.btnConfirmar.setOnClickListener {
            finish()
        }
    }
}