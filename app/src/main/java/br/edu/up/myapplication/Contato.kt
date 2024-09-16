package br.edu.up.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter

class Contato(val lista : List<String>) : Adapter<Contato.ContatoViewHolder>() {

    inner class ContatoViewHolder(val intemView: View) : RecyclerView.ViewHolder(intemView) {
        val txtNome = intemView.findViewById<TextView>(R.id.Nome_user)
        val txtMensagem = intemView.findViewById<TextView>(R.id.mensagem_user)
        val txtHorario = intemView.findViewById<TextView>(R.id.horario_mensagem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(0, parent, false)

        return ContatoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(ContatoHolder: ContatoViewHolder, position: Int) {

        val nome = lista[position]
        ContatoHolder.txtNome.text = nome


    }


}