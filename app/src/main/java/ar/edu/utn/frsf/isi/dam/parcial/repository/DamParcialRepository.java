package ar.edu.utn.frsf.isi.dam.parcial.repository;

import android.arch.persistence.room.Room;
import android.content.Context;

import java.util.List;

import ar.edu.utn.frsf.isi.dam.parcial.model.Usuario;

public class DamParcialRepository {
    private DamParcialDatabase damParcialDatabase;

    private static DamParcialRepository damParcialRepository = null;

    public static DamParcialRepository getInstance(Context context) {
        if (damParcialRepository == null)
            damParcialRepository = new DamParcialRepository(context);

        return damParcialRepository;
    }

    private DamParcialRepository(Context context) {
        damParcialDatabase = Room.databaseBuilder(context, DamParcialDatabase.class, "dam-parcial-database").build();
    }

    public void guardarUsuario(Usuario usuario) {
        damParcialDatabase.userDao().insertUsers(usuario);
    }

    public List<Usuario> obtenerUsuarios(){
        return damParcialDatabase.userDao().obtenerUsuarios();
    }
}
