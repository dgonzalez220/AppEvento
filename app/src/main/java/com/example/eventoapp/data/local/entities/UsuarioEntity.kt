package com.example.eventoapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "usuario")
data class UsuarioEntity(
    @PrimaryKey(autoGenerate = true) val idUser: Int = 0,
    val nombre_user: String,
    val correo_user: String,
    val contrasena_user: String,
    val tipo_user: String, // "normal" o "admin"
    val fechaRegistro: Date
)

