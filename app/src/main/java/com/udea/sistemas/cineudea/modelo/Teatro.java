package com.udea.sistemas.cineudea.modelo;

import com.udea.sistemas.cineudea.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 03/12/2015.
 */
public class Teatro {
    private String nombre;
    private String ciudad;
    private int idDrawable;

    public Teatro(String nombre, String ciudad, int idDrawable) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.idDrawable = idDrawable;
    }

    public static final List<Teatro> TEATROS = new ArrayList<Teatro>();

    static {
        TEATROS.add(new Teatro("CC SantaFé", "Medellín", R.drawable.cc_santafe));
        TEATROS.add(new Teatro("CC Puerta del norte", "Bello", R.drawable.cc_puerta_del_norte));
        TEATROS.add(new Teatro("CC Florida", "Medellín", R.drawable.cc_florida));
        TEATROS.add(new Teatro("CC San Diego", "Medellín", R.drawable.cc_san_diego));
        TEATROS.add(new Teatro("CC Los Molinos", "Medellín", R.drawable.cc_los_molinos));
    }

    //Getters

    public String getCiudad() {
        return ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }
}

