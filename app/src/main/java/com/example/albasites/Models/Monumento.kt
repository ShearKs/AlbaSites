package com.example.albasites.Models

var listaMonumentos = mutableListOf<Monumento>()


class Monumento (

    var nombre: String,
    var descriCorta: String,
    var imagen: Int,
    var id : Int?= listaMonumentos.size


  /*  constructor(id:Int,nombre:String,descriCorta:String,descriLarga:String,numVisi:Int,imagen:String){

        this.id = id;
        this.nombre = nombre;
        this.descriCorta = descriCorta;
        this.descriLarga = descriLarga;
        this.numVisi = numVisi;
        this.imagen = imagen;

    }*/

)