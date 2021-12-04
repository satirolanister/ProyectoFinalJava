/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dev
 */
public class ConexionMysql extends Conexion
{
    @Override
    public Connection conectar()
    {
        Connection con = null;
        try 
        {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pf_cursojavaintecap","root","1234");
        } 
        catch (Exception e) 
        {
            System.out.println("Error en la conexión "+ e.getMessage());
        }
        finally
        {
            return con;
        }
    }
    
    @Override
    public void desconectar(Connection con)
    {
        try 
        {
            if(con != null && !con.isClosed())
            {
                con.close();
            }
        }
        catch (Exception e) 
        {
            System.out.println("Error al desconectar la DB "+e.getMessage());
        }
    }
}
