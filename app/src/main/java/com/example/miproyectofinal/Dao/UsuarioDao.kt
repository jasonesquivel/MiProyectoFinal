package com.example.miproyectofinal.Dao
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.Modelo.Usuario

interface UsuarioDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(usuario: Usuario): Long

    @Update
    fun actualizar(usuario: Usuario): Int

    @Delete
    fun eliminar(usuario: Usuario): Int

    //Acá especificamos una consulta personalizada para obtener los registros de la tabla
    //y devuelve un LiveData
    @Query("SELECT * FROM Usuario")
    fun obtenerTodos(): LiveData<List<Usuario>>
}