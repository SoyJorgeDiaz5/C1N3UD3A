package com.udea.sistemas.cineudea.modelo;

import com.udea.sistemas.cineudea.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by usuario on 03/12/2015.
 */
public class Pelicula {

    //Para fin práctico
    private String nombre;
    private int idDrawable;

    //Según el diseño
    public Pelicula(String nombre, int idDrawable){
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    //Persistencia
    public static final List<Pelicula> CARTELERA = new ArrayList<Pelicula>();
    public static final List<Pelicula> ESTRENOS = new ArrayList<Pelicula>();

    static {
        CARTELERA.add(new Pelicula("Taza de Café", R.drawable.cafe));
        CARTELERA.add(new Pelicula("Coctel Tronchatoro", R.drawable.coctel));
        CARTELERA.add(new Pelicula("Jugo Natural", R.drawable.jugo_natural));
        CARTELERA.add(new Pelicula("Coctel Jordano", R.drawable.coctel_jordano));
        CARTELERA.add(new Pelicula("Botella Vino Tinto Darius", R.drawable.vino_tinto));

        ESTRENOS.add(new Pelicula("Postre De Vainilla", R.drawable.postre_vainilla));
        ESTRENOS.add(new Pelicula("Flan Celestial", R.drawable.flan_celestial));
        ESTRENOS.add(new Pelicula("Cupcake Festival", R.drawable.cupcakes_festival));
        ESTRENOS.add(new Pelicula("Pastel De Fresa", R.drawable.pastel_fresa));
        ESTRENOS.add(new Pelicula("Muffin Amoroso", R.drawable.muffin_amoroso));
    }

    //Getters & Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }
}
