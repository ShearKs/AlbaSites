package com.example.albasites.controladores

import com.example.albasites.Models.Monumento

class controladorMonu {

    companion object {
        private val monumentos = ArrayList<Monumento>()

        // Obtenemos todas las reseñas que tenemos
        fun getMonumentos(): ArrayList<Monumento> {
            return monumentos
        }

        // Añadir un monumento
        fun anadirMonumento(monumento: Monumento) {
            monumentos.add(monumento)
        }
    }
}