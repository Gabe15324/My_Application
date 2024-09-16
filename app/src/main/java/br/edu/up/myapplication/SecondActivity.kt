package br.edu.up.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val tvName = findViewById<TextView>(R.id.tv_name)
        val btBook1 = findViewById<Button>(R.id.bt_book1)
        val btBook2 = findViewById<Button>(R.id.bt_book2)
        val btBook3 = findViewById<Button>(R.id.bt_book3)

        val name = intent.getStringExtra("name")
        tvName.text = "Olá, $name!"

        btBook1.setOnClickListener {
            // Lógica para lidar com o botão Livro 1
            val intent = Intent(this, BookActivity::class.java)
            intent.putExtra("book", "Livro 1")
            startActivity(intent)
        }

        btBook2.setOnClickListener {
            // Lógica para lidar com o botão Livro 2
            val intent = Intent(this, BookActivity::class.java)
            intent.putExtra("book", "Livro 2")
            startActivity(intent)
        }

        btBook3.setOnClickListener {
            // Lógica para lidar com o botão Livro 3
            val intent = Intent(this, BookActivity::class.java)
            intent.putExtra("book", "Livro 3")
            startActivity(intent)
        }
    }
}