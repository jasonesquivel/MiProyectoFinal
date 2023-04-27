package com.example.miproyectofinal.Modelo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Usuario")
data class Usuario (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val apellido: String,
    val edad: Int,
    val peso: Int,
    val correo: String
)