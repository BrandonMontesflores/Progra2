/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg.dao;

import gt.umg.demoumg.Persona;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Usuario
 */
public interface IPersonaDao extends CrudRepository<Persona,Long>{
    
    
}
