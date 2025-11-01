package com.example.eventoapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "usuario")
data class UsuarioEntity(
    @PrimaryKey(autoGenerate = true) val idUser: Int = 0,
    val nombre: String,
    val correo: String,
    val contrasena: String,
    val tipo: String, // "normal" o "admin"
    val fechaRegistro: Date
)

