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
public class CalificacionVo 
{
    private EstudianteVo estudianteVo;
    private ActividadesVo actividadVo;
    private float puntajeCalificacion;
    private Date fechaEntrega;
    private String observacionesCalificacion;

    public EstudianteVo getEstudianteVo() {
        return estudianteVo;
    }

    public void setEstudianteVo(EstudianteVo estudianteVo) {
        this.estudianteVo = estudianteVo;
    }

    public ActividadesVo getActividadVo() {
        return actividadVo;
    }

    public void setActividadVo(ActividadesVo actividadVo) {
        this.actividadVo = actividadVo;
    }

    public float getPuntajeCalificacion() {
        return puntajeCalificacion;
    }

    public void setPuntajeCalificacion(float puntajeCalificacion) {
        this.puntajeCalificacion = puntajeCalificacion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getObservacionesCalificacion() {
        return observacionesCalificacion;
    }

    public void setObservacionesCalificacion(String observacionesCalificacion) {
        this.observacionesCalificacion = observacionesCalificacion;
    }
    
    
    
}
