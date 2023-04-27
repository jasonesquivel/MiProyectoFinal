package com.example.miproyectofinal.Dao
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.miproyectofinal.Modelo.Comida
import com.example.miproyectofinal.Modelo.Usuario

interface ComidaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertar(comida: Comida): Long

    @Update
    fun actualizar(comida: Comida): Int

    @Delete
    fun eliminar(comida: Comida): Int

    //Acá especificamos una consulta personalizada para obtener los registros de la tabla
    //y devuelve un LiveData
    @Query("SELECT * FROM Comida")
    fun obtenerTodos(): LiveData<List<Comida>>

    companion object {
        fun obtenerTodos() {

        }
    }
}