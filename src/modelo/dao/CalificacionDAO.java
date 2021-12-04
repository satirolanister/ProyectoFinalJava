/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.vo.CalificacionVo;

/**
 *
 * @author Dev
 */
public interface CalificacionDAO 
{
    public int insertar (CalificacionVo calificacionVo);
    
    public int actualizar (CalificacionVo calificacionVo);
    
    public int borrar(long id);
    
    public ArrayList<CalificacionVo> listar();
}
