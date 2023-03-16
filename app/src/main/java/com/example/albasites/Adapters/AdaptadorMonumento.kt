package com.example.albasites.Adapters


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.albasites.Models.Monumento
import com.example.albasites.MonumentoActivity
import com.example.albasites.R
import com.example.albasites.controladores.controladorMonu

class AdaptadorMonumento(private val contexto: Context, private var listaMonumentos:List<Monumento>):
    RecyclerView.Adapter<CardViewHolder>() {

    private val monumentos: ArrayList<Monumento> = controladorMonu.getMonumentos()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        return CardViewHolder(layoutInflater.inflate(R.layout.cardview_monu,parent,false))
    }

    override fun getItemCount(): Int = listaMonumentos.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        val item = listaMonumentos[position]
        holder.render(item)


        holder.itemView.setOnClickListener(View.OnClickListener {

            //No terminado pero es una muestra
            //val monumento = Monumento("Titulo","descri corta" , 0, 1);
            //monumentos.add(monumento)

            val intento = Intent(contexto,MonumentoActivity::class.java);

            contexto.startActivity(intento);


        })



    }






}