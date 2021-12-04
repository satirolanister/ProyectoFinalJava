/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.ArrayList;
import modelo.conexion.ConexionMysql;
import modelo.vo.CalificacionVo;

/**
 *
 * @author Dev
 */
public class CalificacionMySqlDao extends ConexionMysql implements CalificacionDAO
{
   @Override
   public int insertar (CalificacionVo calificacionVo)
   {
       return 0;
   }
   
   @Override
   public int actualizar (CalificacionVo calificacionVo)
   {
       return 0;
   }
   
   @Override
   public int borrar(long id)
   {
       return 0;
   }
   
   @Override
   public ArrayList<CalificacionVo> listar()
   {
       return null;
   }
}
