package com.tallercmovil.ejercicio2.model;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.Serializable;

public class Deporte implements Serializable
{
    private long id;
    private String seleccion, genero, categoria, deporte, participantes;
    private int ivLogo;

    public Deporte(String seleccion, String genero, String categoria, String deporte, String participantes)
    {
        this.seleccion = seleccion;
        this.genero = genero;
        this.categoria = categoria;
        this.deporte = deporte;
        this.participantes = participantes;
    }

    public Deporte(long id, String seleccion, String genero, String categoria, String deporte, String participantes, int ivLogo)
    {
        this.id = id;
        this.seleccion = seleccion;
        this.genero = genero;
        this.categoria = categoria;
        this.deporte = deporte;
        this.participantes = participantes;
        this.ivLogo = ivLogo;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getSeleccion()
    {
        return seleccion;
    }

    public void setSeleccion(String seleccion)
    {
        this.seleccion = seleccion;
    }

    public String getGenero()
    {
        return genero;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getCategoria()
    {
        return categoria;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public String getDeporte()
    {
        return deporte;
    }

    public void setDeporte(String deporte)
    {
        this.deporte = deporte;
    }

    public String getParticipantes()
    {
        return participantes;
    }

    public void setParticipantes(String participantes)
    {
        this.participantes = participantes;
    }

    public int getIvLogo()
    {
        return ivLogo;
    }

    public void setIvLogo(int ivLogo)
    {
        this.ivLogo = ivLogo;
    }
}
