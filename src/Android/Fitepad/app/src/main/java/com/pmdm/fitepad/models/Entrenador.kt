package com.pmdm.fitepad.models

//Clase de datos de los Entrenadores
//Todos los entrenadores tendran los siguientes campos
data class Entrenador(
    override val  id : Int,
    override val nombre : String,
    override val email: String,
    val activo : Boolean
) : IUsuario
