package br.edu.up.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class RecycleView : AppCompatActivity() {

    lateinit var rvContato : RecycleView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view)
        val viewCompat
        viewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)){ v, insets ->
            val SystemBar = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(SystemBar.left, SystemBar.top, SystemBar.right, SystemBar.bottom)
            insets
        }
        rvContato = findViewById(R.id.rv_contato)
        
        rvConatato = LinearLayoutManager(this)

        val contato = listOf(
            Contato("Nome do usuario", "Mensagem", "12:30"),
            Contato("Nome do usuario", "Mensagem", "12:30")
        )
    }
}