/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg.servicio;

import gt.umg.demoumg.Profesion;
import gt.umg.demoumg.dao.IProfesionDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class ProfesionServiceImpl implements ProfesionService{
    @Autowired
    private IProfesionDao IprofesionDao;

    @Override
    @Transactional(readOnly=true)
    public List<Profesion> listaProfesion() {
        return (List<Profesion>) IprofesionDao.findAll();
    }

    @Override
    @Transactional
    public void guardarprof(Profesion profesion) {
        IprofesionDao.save(profesion);
    }

    @Override
    @Transactional
    public void eliminarprof(Profesion profesion) {
        IprofesionDao.delete(profesion);
    }

    @Override
    @Transactional(readOnly=true)
    public Profesion encontrarProfesion(Profesion profesion) {
        return IprofesionDao.findById(profesion.getId_profesion()).orElse(null);
    }
    
}
