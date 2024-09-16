package br.edu.up.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val tvBook = findViewById<TextView>(R.id.tv_book)
        val book = intent.getStringExtra("book")
        tvBook.text = "Você escolheu o livro $book"
    }
}