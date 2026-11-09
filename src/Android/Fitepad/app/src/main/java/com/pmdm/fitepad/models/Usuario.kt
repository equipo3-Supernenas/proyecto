package com.pmdm.fitepad.models

//Clase de datos de los Usuarios
//Todos los usuarios tendran los siguientes campos
data class Usuario(
    override val id : Int,
    override val nombre : String,
    override val email : String,
    val telefono : Int,
    val edad : Int,
    val altura : Float,
    val peso : Float,

) : IUsuario
