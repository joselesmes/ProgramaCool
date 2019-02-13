package com.example.estudiantes.programacool;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.estudiantes.programacool.Ubicacion;

@Database(entities=(Ubicacion.class),version=1)

public abstract class DBUbication extends RoomDatabase {
}
public abstract UbicacionDAO ubicacionDAO();