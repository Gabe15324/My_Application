package br.edu.up.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.up.myapplication.fragmentos.outroFragmento

class InitialActivity : AppCompatActivity() {

    lateinit var btBook1: Button
    lateinit var btBook2: Button
    lateinit var btBook3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_initial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBar = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBar.left, systemBar.top, systemBar.right, systemBar.bottom)
            insets
        }
        btBook1 = findViewById(R.id.bn_frag1)
        btBook2 = findViewById(R.id.bn_frag2)
        btBook3 = findViewById(R.id.bn_frag3)
        
        btBook1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainerView2, outroFragmento())
                .commit()
        }
        
        btBook2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView2, blankFragment())
                .commit()
        
        val fragmentManager = supportFragmentManager.beginTransaction()

        fragmentManager.add(R.id.fragmentContainerView2, outroFragmento())

        fragmentManager.commit()
    }
}

    private fun blankFragment(): Fragment {

    }
