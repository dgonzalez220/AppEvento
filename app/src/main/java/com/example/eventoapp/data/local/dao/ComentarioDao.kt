package com.example.eventoapp.data.local.dao

import androidx.room.*
import com.example.eventoapp.data.local.entities.ComentarioEntity as Comentario

@Dao
interface ComentarioDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarComentario(comentario: Comentario)

    @Query("SELECT * FROM comentarios WHERE eventoID = :eventoId")
    suspend fun obtenerComentariosPorEvento(eventoId: Int): List<Comentario>

    @Update
    suspend fun actualizarComentario(comentario: Comentario)

    @Delete
    suspend fun eliminarComentario(comentario: Comentario)
}
