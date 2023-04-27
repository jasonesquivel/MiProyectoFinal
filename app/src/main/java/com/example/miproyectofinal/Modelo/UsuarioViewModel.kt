package com.example.miproyectofinal.Modelo
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.miproyectofinal.Dao.AppDatabase
import com.example.miproyectofinal.Dao.UsuarioDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
class UsuarioViewModel(application: Application): AndroidViewModel(application) {
    private val usuarioDao: UsuarioDao

    init {
        val database = AppDatabase.getInstance(application.applicationContext)
        usuarioDao = database.usuarioDao()
    }
    suspend fun insertar(usuario: Usuario) = withContext(Dispatchers.IO) {
        usuarioDao.insertar(usuario)
    }

    suspend fun actualizar(usuario: Usuario) = withContext(Dispatchers.IO) {
        usuarioDao.actualizar(usuario)
    }

    suspend fun eliminar(usuario: Usuario) = withContext(Dispatchers.IO) {
        usuarioDao.eliminar(usuario)
    }

    //Acá se define un objeto LiveData llamado todos el cual es obtenido medinate la funcion obtenerTodos
    //de estudianteDao, utilizado para observar y obtener la lista de todos los estudiantes almacenados
    //en la base de datos en tiempo real

    val todos: LiveData<List<Usuario>> = usuarioDao.obtenerTodos()
}