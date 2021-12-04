/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.conexion.ConexionMysql;
import modelo.vo.EstudianteVo;

/**
 *
 * @author Dev
 */
public class EstudianteMySqlDao extends ConexionMysql implements EstudianteDAO
{
    private String insert= "INSERT INTO estudiante(id, nombre, telefono, direccion, correo, edad, curso) VALUES " +
    "(?, ?, ?, ?, ?, ?, ?)";
    private String update ="update estudiantes set nombre = ?, telefono = ?, direccion = ?, correo = ?, edad = ?, curso = ? "
            +"where id=?";
    private String delete ="delete from estudiantes where id = ?";
    
    private String select = "select¨* from estudiantes";
    
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
           pstt.setString(4, estudianteVo.getDireccion());
           pstt.setString(5, estudianteVo.getCorreo());
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
       
       resultado = -1;
       con = null;
       pstt = null;
       
       try 
       {
            con = this.conectar();
            pstt = con.prepareStatement(update);
            
           pstt.setString(1, estudianteVo.getNombre());
           pstt.setString(2, estudianteVo.getTelefono());
           pstt.setString(3, estudianteVo.getDireccion());
           pstt.setString(4, estudianteVo.getCorreo());
           pstt.setByte(5, estudianteVo.getEdad());
           pstt.setString(6, estudianteVo.getCurso());
           pstt.setLong(7, estudianteVo.getId());
           
           resultado = pstt.executeUpdate();
            
       } 
       catch (Exception e) 
       {
           System.out.println("Error al intentar actualizar el registro del id "+ estudianteVo.getId()+" en la base de datos "+e.getMessage());
       }
       finally
       {
           this.desconectar(con);
       }
       
       return resultado;
   }
   
   @Override
   public int borrar(long id)
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
            pstt = con.prepareStatement(delete);
            
            pstt.setLong(1, id);
            
            resultado = pstt.executeUpdate();
       } 
       catch (Exception e) 
       {
           System.out.println("Error al intentar eliminar el registro "+id+" De la base de datos");
       }
       finally
       {
           this.desconectar(con);
       }
       
      return resultado;
   }
   
   @Override
   public ArrayList<EstudianteVo> listar()
   {
       ArrayList lista;
       Connection con;
       PreparedStatement pstt;
       ResultSet rss;
       
       lista = null;
       con = null;
       pstt = null;
       rss = null;
       
       try 
       {
           con = this.conectar();
           pstt =  con.prepareStatement(select);
           rss = pstt.executeQuery();
           lista =  new ArrayList();
           
           while(rss.next())
           {
               EstudianteVo estudianteVo;
               estudianteVo = new EstudianteVo();
               
               estudianteVo.setId(rss.getLong(1));
               estudianteVo.setNombre(rss.getString("nombre"));
               estudianteVo.setCorreo(rss.getString("correo"));
               estudianteVo.setDireccion(rss.getString("direccion"));
               estudianteVo.setTelefono(rss.getString("telefono"));
               estudianteVo.setEdad(rss.getByte("edad"));
               estudianteVo.setCurso(rss.getString("Curso"));
               lista.add(estudianteVo);
           }
           
       } 
       catch (Exception e) 
       {
           System.out.println("No es posible realizar la consulta a la base de datos "+e.getMessage());
       }
       finally
       {
           this.desconectar(con);
       }
       
       return lista;
   }
   
   @Override
   public EstudianteVo consultarPorId(long id)
   {
       Connection con;
       EstudianteVo estudianteVo;
       PreparedStatement pstt;
       ResultSet rss;
       String query;
       
       con = null;
       pstt = null;
       rss = null;
       estudianteVo = null;
       
       try 
       {
           con = this.conectar();
           query = select;
           
           query += " where id = ?";
           
           pstt = con.prepareStatement(query);
           pstt.setLong(1, id);
           
           rss = pstt.executeQuery();
           
           while(rss.next())
           {
               estudianteVo = new EstudianteVo();
               
               estudianteVo.setId(rss.getLong(1));
               estudianteVo.setNombre(rss.getString("nombre"));
               estudianteVo.setCorreo(rss.getString("correo"));
               estudianteVo.setDireccion(rss.getString("direccion"));
               estudianteVo.setTelefono(rss.getString("telefono"));
               estudianteVo.setEdad(rss.getByte("edad"));
               estudianteVo.setCurso(rss.getString("Curso"));
           }
           
       } 
       catch (Exception e) 
       {
           System.out.println("Error al encontrar información "+e.getMessage());
       }
       finally
       {
           this.desconectar(con);
       }
       
       return estudianteVo;
   }
}
