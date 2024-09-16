package br.edu.up.myapplication.fragmentos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.edu.up.myapplication.R

class outroFragmento : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(R.layout.fragment_outrofra, container, savedInstanceState)
        return inflater.inflate(
            R.layout.fragment_outrofra,
            container,
            false
        )
    }

}