package com.example.estudiantes.programacool;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

@Dao
public interface UbicacionDAO {
    @Insert
    public void Insertubication (ubicacion miubicacion);activities
}
