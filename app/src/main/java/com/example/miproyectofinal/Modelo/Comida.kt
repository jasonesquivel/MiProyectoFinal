package com.example.miproyectofinal.Modelo
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName = "Comida")
data class Comida (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nombre: String,
    val peso: Double,
    val calorias:Int
)