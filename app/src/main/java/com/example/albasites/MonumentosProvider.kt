package com.example.albasites

import com.example.albasites.Models.Monumento

class MonumentosProvider {
    companion object {

        val listaMonu = listOf<Monumento>(

            Monumento(

                "Pasaje Lodares",
                "En el emblemático monumento tuvo su sede hacia 1930 la primera radio que existió en Albacete (EAJ 44).También fue la sede de la Asociación de Amigos de la Unión Soviética en la capital.",
                R.drawable.lodares,

                ),
            Monumento(

                "Gran Hotel",
                "El Gran Hotel posee una fachada modernista con adornos florales, de niños, jarrones, gárgolas y de diablos, muy presentes éstos en todos los edificios modernistas de la ciudad, ya que se ponían para ahuyentar a los malos espíritus",
                R.drawable.hotel_inicio,

                ),
            Monumento(

                "Plaza de Toros",
                "La Plaza de Toros es otro edificio emblemático, neomudéjar y sede de una de las más importantes ferias taurinas de España.Sirvió de ejemplo para Las Ventas de Madrid ya que ambas fueron realizadas por el arquitecto albaceteño Julio Carrilero",
                R.drawable.ptoros,

                ),
            Monumento(

                "Catedral",
                "La Catedral está construida sobre la antigua iglesia de San Juan. Fue comenzada a principios del siglo XVI y,  más tarde, parte de ella reformada por Diego de Siloé, al gusto del estilo renacentista.",
                R.drawable.catedral_inico,

                ),
            Monumento(

                "Museo Aqueológico de Albacete",
                "Podremos conocer restos de las antiguas civilizaciones que poblaron estas tierras; especialmente destacable es la colección arqueológica íbera, de la que hay parte en el MAN de Madrid.",
                R.drawable.museo_inico,

                )


        )


    }
}