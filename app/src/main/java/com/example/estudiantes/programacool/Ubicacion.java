package com.example.estudiantes.programacool;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Ubicacion {
    @PrimaryKey

    private class int id;
    private int salon;
    private  String ubiicacion ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }

    public String getUbiicacion() {
        return ubiicacion;
    }

    public void setUbiicacion(String ubiicacion) {
        this.ubiicacion = ubiicacion;
    }
}
