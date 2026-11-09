package com.pmdm.fitepad.models

//Esto es una interface para tanto Usuario como Entrenador compartan los mismos atributos
interface IUsuario
{
    val id : Int
    val nombre : String
    val email : String
}