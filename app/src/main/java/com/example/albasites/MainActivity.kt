package com.example.albasites

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.webkit.ConsoleMessage
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.albasites.Adapters.AdaptadorMonumento
import com.example.albasites.Models.Monumento
import com.example.albasites.Models.listaMonumentos

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val TextView = findViewById<R.id.a>()

        initReclycerViwe()

        //hola esto es una modificacion
        texto()

    }

    private fun initReclycerViwe() {

        val reclycerView = findViewById<RecyclerView>(R.id.recyclerView)
        reclycerView.layoutManager = LinearLayoutManager(this)
        reclycerView.adapter = AdaptadorMonumento(this,MonumentosProvider.listaMonu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        menuInflater.inflate(R.menu.menu_principal, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var itemId: Int = item.itemId

        when (itemId) {
            R.id.itemPerfil -> {

                Toast.makeText(
                    applicationContext,
                    "Hola sergio como estas,has pulsado el perfil",
                    Toast.LENGTH_LONG
                )

                //Nos vamos a los mapas
                startActivity(Intent(applicationContext, MonumentoActivity::class.java))

            }
            R.id.itemMapa -> {

                Toast.makeText(
                    this, "Hola sergio como estas,has pulsado el Mapa guapeton",
                    Toast.LENGTH_LONG
                )
            }
            else -> {

                Toast.makeText(this, "Ha ocurrido un error!", Toast.LENGTH_LONG)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun texto() {

        val monu1 = Monumento(

            "Pasaje Lodares",
            "En el emblemático monumento tuvo su sede hacia 1930 la primera radio que existió en Albacete (EAJ 44).También fue la sede de la Asociación de Amigos de la Unión Soviética en la capital.",
            R.drawable.lodares,

            )

        listaMonumentos.add(monu1)

        val monu2 = Monumento(

            "Gran Hotel",
            "El Gran Hotel posee una fachada modernista con adornos florales, de niños, jarrones, gárgolas y de diablos, muy presentes éstos en todos los edificios modernistas de la ciudad, ya que se ponían para ahuyentar a los malos espíritus",
            R.drawable.hotel_inicio,

            )
        listaMonumentos.add(monu2)

        val monu3 = Monumento(

            "Plaza de Toros",
            "La Plaza de Toros es otro edificio emblemático, neomudéjar y sede de una de las más importantes ferias taurinas de España.Sirvió de ejemplo para Las Ventas de Madrid ya que ambas fueron realizadas por el arquitecto albaceteño Julio Carrilero",
            R.drawable.ptoros,

            )

        listaMonumentos.add(monu3)

        val monu4 = Monumento(

            "Catedral",
            "La Catedral está construida sobre la antigua iglesia de San Juan. Fue comenzada a principios del siglo XVI y,  más tarde, parte de ella reformada por Diego de Siloé, al gusto del estilo renacentista.",
            R.drawable.catedral_inico,

            )
        listaMonumentos.add(monu4)

        val monu5 = Monumento(

            "Museo Aqueológico de Albacete",
            "Podremos conocer restos de las antiguas civilizaciones que poblaron estas tierras; especialmente destacable es la colección arqueológica íbera, de la que hay parte en el MAN de Madrid.",
            R.drawable.museo_inico,

            )
        listaMonumentos.add(monu5)


    }
}