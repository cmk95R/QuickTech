package com.example.myapplication.data.models

import java.sql.Date

data class UsuarioModel(

    var id : String = "",
    var nombre : String = "",
    var apellido : String = "",
    var email : String = "",
    var password : String = "",
    var passwordTwo : String = "",
    var FNacimiento : Date = "21-09-1998",
    var Foto : String = "",

)
