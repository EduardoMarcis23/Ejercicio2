package com.tallercmovil.ejercicio2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tallercmovil.ejercicio2.R;

import com.tallercmovil.ejercicio2.model.Deporte;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter
{

    Context contexto;
    ArrayList<Deporte> datos;
    private static LayoutInflater inflater = null;

    public Adaptador(Context contexto, ArrayList<Deporte> datos)
    {
        this.contexto = contexto;
        this.datos = datos;

        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount()
    {
        return datos.size();
    }

    @Override
    public Object getItem(int position)
    {
        return datos.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return datos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final View vista = inflater.inflate(R.layout.elemento_lista, null);

        TextView tvSeleccion = vista.findViewById(R.id.tvSeleccion);
        TextView tvCategoria = vista.findViewById(R.id.tvCategoria);
        TextView tvDeporte = vista.findViewById(R.id.tvDeporte);
        TextView tvParticipantes = vista.findViewById(R.id.tvParticipantes);
        TextView tvGenero = vista.findViewById(R.id.tvGenero);
        ImageView ivLogo = vista.findViewById(R.id.ivLogo);


        tvSeleccion.setText(datos.get(position).getSeleccion());
        tvCategoria.setText(datos.get(position).getCategoria());
        tvDeporte.setText(datos.get(position).getDeporte());
        tvParticipantes.setText(datos.get(position).getParticipantes());
        tvGenero.setText(datos.get(position).getGenero());
        ivLogo.setImageResource(datos.get(position).getIvLogo());

        return vista;
    }
}
