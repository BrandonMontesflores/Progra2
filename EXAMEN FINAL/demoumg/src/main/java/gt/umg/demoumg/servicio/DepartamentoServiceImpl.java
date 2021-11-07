/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg.servicio;

import gt.umg.demoumg.Departamento;
import gt.umg.demoumg.dao.IDepartamentoDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class DepartamentoServiceImpl implements DepartamentoService{
    @Autowired
    private IDepartamentoDao IDepartamentoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Departamento> listaDepartamentos() {
        return (List<Departamento>) IDepartamentoDao.findAll();
    }
    
}
