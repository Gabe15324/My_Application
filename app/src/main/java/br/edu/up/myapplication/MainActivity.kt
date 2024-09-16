package br.edu.up.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.et_name)
        val btStart = findViewById<Button>(R.id.bt_start)

        btStart.setOnClickListener {
            val name = etName.text.toString()
            val intent = Intent(this, MainActivity23::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}