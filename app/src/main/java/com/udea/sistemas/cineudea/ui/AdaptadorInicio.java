package com.udea.sistemas.cineudea.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.udea.sistemas.cineudea.R;
import com.udea.sistemas.cineudea.modelo.Teatro;

/**
 * Created by usuario on 03/12/2015.
 */
public class AdaptadorInicio extends RecyclerView.Adapter<AdaptadorInicio.ViewHolder> {

        public static class ViewHolder extends RecyclerView.ViewHolder {

            // Campos respectivos de un item
            public TextView nombre;
            public TextView ciudad;
            public ImageView imagen;

            public ViewHolder(View v) {
                super(v);
                nombre = (TextView) v.findViewById(R.id.nombre_teatro);
                ciudad = (TextView) v.findViewById(R.id.ciudad_teatro);
                imagen = (ImageView) v.findViewById(R.id.miniatura_teatro);
            }
        }

        public AdaptadorInicio() {
        }

    @Override
        public int getItemCount() {
            return Teatro.TEATROS.size();
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_lista_inicio, viewGroup, false);
            return new ViewHolder(v);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            Teatro item = Teatro.TEATROS.get(i);

            Glide.with(viewHolder.itemView.getContext())
                    .load(item.getIdDrawable())
                    .centerCrop()
                    .into(viewHolder.imagen);
            viewHolder.ciudad.setText(item.getCiudad());
            viewHolder.nombre.setText(item.getNombre());

        }

    }
