package com.example.eventoapp.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "comentario")
data class ComentarioEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val mensaje: String,
    val fecha: Date,
    val autorId: Int,
    val eventoId: Int
)

