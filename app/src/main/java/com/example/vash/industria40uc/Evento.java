package com.example.vash.industria40uc;

import java.sql.Date;
import java.sql.Time;

public class Evento {
    private Integer idEvento;
    private String nombre;
    private String ponente;
    private Date fecha;
    private Time hora;
    private String lugar;

    public Evento() {
    }

    public Evento(Integer idEvento, String nombre, String ponente, Date fecha, Time hora, String lugar) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.ponente = ponente;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public Integer getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPonente() {
        return ponente;
    }

    public void setPonente(String ponente) {
        this.ponente = ponente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
