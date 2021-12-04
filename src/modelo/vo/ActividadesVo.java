/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.vo;

import java.sql.Date;

/**
 *
 * @author Dev
 */
public class ActividadesVo 
{
    private int idActividad;
    private String nombreActividad;
    private String descripcionActividad;
    private float puntajeActividad;
    private Date fechaLimiteActividad; 

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public float getPuntajeActividad() {
        return puntajeActividad;
    }

    public void setPuntajeActividad(float puntajeActividad) {
        this.puntajeActividad = puntajeActividad;
    }

    public Date getFechaLimiteActividad() {
        return fechaLimiteActividad;
    }

    public void setFechaLimiteActividad(Date fechaLimiteActividad) {
        this.fechaLimiteActividad = fechaLimiteActividad;
    }
    
    
}
