package com.example.myapplication.data.models

import java.sql.Date

data class UsuarioModel(

    var id : Int = 0,
    var nombre : String = "",
    var apellido : String = "",
    var email : String = "",
    var password : String = "",
    var passwordTwo : String = "",
    var FNacimiento : String = "",
    var Foto : String = "",

)
