/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import modelo.conexion.ConexionMysql;
import modelo.vo.EstudianteVo;

/**
 *
 * @author Dev
 */
public class EstudianteMySqlDao extends ConexionMysql implements EstudianteDAO
{
    private String insert= "INSERT INTO estudiante(id, nombre, telefono, direccion, correo, edad, curso) VALUES" +
    "(?, ?, ?, ?, ?, ?, ?)";
    private String update = "";
    
    
   @Override
   public int insertar (EstudianteVo estudianteVo)
   {
       int resultado;
       Connection con;
       PreparedStatement pstt;
       
       resultado = -1;
       con = null;
       pstt = null;
       
       try 
       {
           con = this.conectar();
           pstt = con.prepareStatement(insert);
           
           pstt.setLong(1, estudianteVo.getId());
           pstt.setString(2, estudianteVo.getNombre());
           pstt.setString(3, estudianteVo.getTelefono());
           pstt.setString(4, estudianteVo.getCorreo());
           pstt.setString(5, estudianteVo.getDireccion());
           pstt.setByte(6, estudianteVo.getEdad());
           pstt.setString(7, estudianteVo.getCurso());
           
           resultado = pstt.executeUpdate();

       } 
       catch (Exception e) 
       {
           System.out.println("Error al intentar insertar registros en la base de datos "+e.getMessage());
       }
       finally
       {
           this.desconectar(con);
       }
       
       return resultado;
   }
   
   @Override
   public int actualizar (EstudianteVo estudianteVo)
   {
       int resultado;
       Connection con;
       PreparedStatement pstt;
       String query;
       
       resultado = -1;
       con = null;
       pstt = null;
       
       try 
       {
            con = this.conectar();
            query = update;
            
       } 
       catch (Exception e) 
       {
           
       }
       finally
       {
           
       }
       
       return resultado;
   }
   
   @Override
   public int borrar(long id)
   {
      int resultado;
       
      resultado = -1;
       
      return resultado;
   }
   
   @Override
   public ArrayList<EstudianteVo> listar()
   {
       return null;
   }
   
   @Override
   public EstudianteVo consultarPorId(long id)
   {
       return null;
   }
}
