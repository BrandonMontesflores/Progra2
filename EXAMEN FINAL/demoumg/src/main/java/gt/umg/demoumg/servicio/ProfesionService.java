/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg.servicio;

import gt.umg.demoumg.Profesion;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ProfesionService {
    public List<Profesion> listaProfesion();
    public void guardarprof(Profesion profesion);
    public void eliminarprof(Profesion profesion);
    public Profesion encontrarProfesion(Profesion profesion);
    
}
