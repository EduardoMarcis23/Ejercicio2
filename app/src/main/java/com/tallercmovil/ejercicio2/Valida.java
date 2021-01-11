package com.tallercmovil.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tallercmovil.ejercicio2.model.Deporte;

import java.util.ArrayList;

public class Valida extends AppCompatActivity
{
    long id = 823;
    ListView lv;
    ArrayList<Deporte> datos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valida);
        Deporte deporte;
        ArrayList<Deporte> elementos;

        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
            elementos = (ArrayList<Deporte>) bundle.getSerializable("elementos");


            lv = findViewById(R.id.lv);


            for (int j = 0; j < elementos.size(); j++)
            {
                deporte = elementos.get(j);

                if (deporte.getDeporte().equals(getString(R.string.americano)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.americano);
                    datos.add(deporteTmp);
                    id ++;
                }

                if (deporte.getDeporte().equals(getString(R.string.basquet)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.basquet);
                    datos.add(deporteTmp);
                    id ++;
                }


                if (deporte.getDeporte().equals(getString(R.string.box)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.boxeo);
                    datos.add(deporteTmp);
                    id ++;
                }


                if (deporte.getDeporte().equals(getString(R.string.bmx)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.bmx);
                    datos.add(deporteTmp);
                    id ++;
                }


                if (deporte.getDeporte().equals(getString(R.string.fut)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.fut);
                    datos.add(deporteTmp);
                    id ++;
                }

                if (deporte.getDeporte().equals(getString(R.string.natacion)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.natacion);
                    datos.add(deporteTmp);
                    id ++;
                }

                if (deporte.getDeporte().equals(getString(R.string.rugby)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.rugby);
                    datos.add(deporteTmp);
                    id ++;
                }

                if (deporte.getDeporte().equals(getString(R.string.skate)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.skate);
                    datos.add(deporteTmp);
                    id ++;
                }

                if (deporte.getDeporte().equals(getString(R.string.tenis)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.tenis);
                    datos.add(deporteTmp);
                    id ++;
                }

                if (deporte.getDeporte().equals(getString(R.string.volei)))
                {
                    Deporte deporteTmp = new Deporte(id, deporte.getSeleccion(), deporte.getGenero(), deporte.getCategoria(), deporte.getDeporte(),
                            "Participan: " + deporte.getParticipantes(), R.drawable.volei);
                    datos.add(deporteTmp);
                    id ++;
                }
            }

            Adaptador adaptador = new Adaptador( this, datos);

            lv.setAdapter(adaptador);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
                {
                    Deporte deporte = (Deporte) parent.getAdapter().getItem(position);
                    Toast.makeText(Valida.this, "Se dio clic en id "+deporte.getId(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}