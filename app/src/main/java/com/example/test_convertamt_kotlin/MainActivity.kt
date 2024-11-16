package com.example.test_convertamt_kotlin
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.test_convertamt_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConvert.setOnClickListener {
            val amountStr = binding.edtAmount.text.toString()
            if (amountStr.isNotEmpty()) {
                val amount = amountStr.toInt()
                Toast.makeText(this, "Amount: $amount", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please enter an amount", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
