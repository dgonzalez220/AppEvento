package com.example.eventoapp.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notificacion")
data class NotificacionEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val mensaje: String,
    val leido: Boolean
)

