package com.example.albasites.Adapters

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.albasites.Models.Monumento
import com.example.albasites.R

class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {


    val nombre = view.findViewById<TextView>(R.id.t1)
    val descripcion = view.findViewById<TextView>(R.id.t2)
    val imagen = view.findViewById<ImageView>(R.id.img1)

    fun render(monu: Monumento) {

        nombre.text = monu.nombre
        descripcion.text = monu.descriCorta
        //Objeto que carga la imagen
        Glide.with(imagen.context).load(monu.imagen).into(imagen)
    }


}