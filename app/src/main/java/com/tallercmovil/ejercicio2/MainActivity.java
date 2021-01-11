package com.tallercmovil.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


import com.tallercmovil.ejercicio2.model.Deporte;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{

     /*PEQUEÑA APP PARA COPETENCIAS INTERNACIONALES DONDE:
        Seleccion es el pais del equipo
        Genero si es Masculino o Femenino (Ingles: MALE or FEMALE)
        Categoria: Infantil, Juvenil o como se quiera dividir
        Partcipantes es el numero total de participantes por equipo que se inscriben
    */


    Deporte deporte;
    EditText etSeleccion, etGenero, etCategoria, etParticipantes;
    Spinner spDeporte;
    ArrayList<Deporte> elementos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSeleccion = findViewById(R.id.etSeleccion);
        etGenero = findViewById(R.id.etGenero);
        etCategoria = findViewById(R.id.etCategoria);
        etParticipantes = findViewById(R.id.etParticipantes);
        spDeporte = findViewById(R.id.spDeporte);

        String[] deportes = {getString(R.string.basquet),
                getString(R.string.box),
                getString(R.string.bmx),
                getString(R.string.americano),
                getString(R.string.fut),
                getString(R.string.natacion),
                getString(R.string.rugby),
                getString(R.string.skate),
                getString(R.string.tenis),
                getString(R.string.volei)};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, deportes);

        spDeporte.setAdapter(adapter);

    }

    public void clic(View view)
    {
        if (datos())
        {

            elementos.add(new Deporte(etSeleccion.getText().toString(), etGenero.getText().toString(),
                    etCategoria.getText().toString(), spDeporte.getSelectedItem().toString(), etParticipantes.getText().toString()));

            Toast.makeText(MainActivity.this, "Se agrego 1 elemento de: "+etSeleccion.getText().toString(), Toast.LENGTH_SHORT).show();

            etSeleccion.setText("");
            etGenero.setText("");
            etCategoria.setText("");
            etParticipantes.setText("");

        }

    }


    public boolean datos() {
        if (etSeleccion.getText().toString().equals("")) {
            etSeleccion.setError(getString(R.string.campo));
            return false;
        }

        if (etGenero.getText().toString().equals("")) {
            etGenero.setError(getString(R.string.campo));
            return false;
        }

        //VALIDACION PARA QUE SOLO SEAN M/F en genero
/*
        if (!etGenero.toString().equals("M") && !etGenero.toString().equals("F"))
        {
            etGenero.setError(getString(R.string.campo));
            return false;
        }
*/
        if (etCategoria.getText().toString().equals("")) {
            etCategoria.setError(getString(R.string.campo));
            return false;
        }

        if (etParticipantes.getText().toString().equals("")) {
            etParticipantes.setError(getString(R.string.campo));
            return false;
        } else {
            return true;
        }
    }

    public void clic2(View view)
    {
        Intent intent = new Intent(MainActivity.this, Valida.class);

        Bundle bundle  = new Bundle();

        bundle.putSerializable("elementos",elementos);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}