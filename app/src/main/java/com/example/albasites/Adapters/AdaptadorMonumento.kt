package com.example.albasites.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.albasites.Models.Monumento
import com.example.albasites.R

class AdaptadorMonumento(private var listaMonumentos:List<Monumento>):
    RecyclerView.Adapter<CardViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return CardViewHolder(layoutInflater.inflate(R.layout.cardview_monu,parent,false))
    }

    override fun getItemCount(): Int = listaMonumentos.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        val item = listaMonumentos[position]
        holder.render(item)

    }






}