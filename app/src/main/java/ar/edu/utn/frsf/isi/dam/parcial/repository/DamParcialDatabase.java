package ar.edu.utn.frsf.isi.dam.parcial.repository;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import ar.edu.utn.frsf.isi.dam.parcial.model.Usuario;

@Database(entities = {Usuario.class}, version = 1)
public abstract class DamParcialDatabase extends RoomDatabase {
    public abstract UsuarioDao userDao();

}
