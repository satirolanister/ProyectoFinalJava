package modelo.dao;

import java.util.ArrayList;
import modelo.vo.EstudianteVo;

/**
 *
 * @author Dev
 */
public interface EstudianteDAO 
{
    public int insertar (EstudianteVo estudianteVo);
    
    public int actualizar (EstudianteVo estudianteVo);
    
    public int borrar(long id);
    
    public ArrayList<EstudianteVo> listar();
    
    public EstudianteVo consultarPorId(long id);
    
}
