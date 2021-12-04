package ar.edu.utn.frsf.isi.dam.parcial.repository;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.parcial.model.Usuario;

@Dao
public interface UsuarioDao {
    @Insert()
    public void insertUsers(Usuario usuario);

    @Query("SELECT * FROM USUARIO")
    public List<Usuario> obtenerUsuarios();
}
