/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg.servicio;

import gt.umg.demoumg.Persona;
import gt.umg.demoumg.dao.IPersonaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private IPersonaDao IPersonaDao;
    
    
    @Override
    @Transactional(readOnly=true)
    public List<Persona> listaPersonas() {
        return (List<Persona>) IPersonaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        IPersonaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        IPersonaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly=true)
    public Persona encontrarPersona(Persona persona) {
        return IPersonaDao.findById(persona.getId_usuario()).orElse(null);
    }
    
}
