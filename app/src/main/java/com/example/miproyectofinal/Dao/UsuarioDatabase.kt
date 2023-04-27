package com.example.miproyectofinal.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.miproyectofinal.Modelo.Usuario

@Database(entities = [Usuario::class], version = 1)
abstract class EstudiantesDatabase : RoomDatabase() {
    //Creamos un método abstracto para obtener un objeto Dao de la entidad de Estudiante
    abstract fun usuarioDao(): UsuarioDao
}