package com.example.miproyectofinal.Modelo
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.miproyectofinal.Dao.AppDatabase
import com.example.miproyectofinal.Dao.ComidaDao
import com.example.miproyectofinal.Dao.UsuarioDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
class comidaViewModel(application: Application): AndroidViewModel(application) {
    private val comidaDao: ComidaDao

    init {
        val database = AppDatabase.getInstance(application.applicationContext)
        comidaDao = database.comidaDao()
    }
    suspend fun insertar(comida:Comida) = withContext(Dispatchers.IO) {
        comidaDao.insertar(comida)
    }

    suspend fun actualizar(comida:Comida) = withContext(Dispatchers.IO) {
        comidaDao.actualizar(comida)
    }

    suspend fun eliminar(comida:Comida) = withContext(Dispatchers.IO) {
        comidaDao.eliminar(comida)
    }

    //Acá se define un objeto LiveData llamado todos el cual es obtenido medinate la funcion obtenerTodos
    //de estudianteDao, utilizado para observar y obtener la lista de todos los estudiantes almacenados
    //en la base de datos en tiempo real

    val todos: Unit = ComidaDao.obtenerTodos()
}