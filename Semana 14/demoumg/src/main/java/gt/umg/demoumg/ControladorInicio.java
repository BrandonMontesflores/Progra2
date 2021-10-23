/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
@Controller
@Slf4j
public class ControladorInicio {
    @GetMapping("/")
    public String inicio(Model modelo){
        log.info("Entrando al controlador inicio MVC");
        var msg = "Datos de Vendedores";    
        var persona = new Persona();
        persona.setNombre("Kevin");
        persona.setEnero("100");
        persona.setFebrero("400");
        persona.setMarzo("500");
        persona.setSuma("1000");
        persona.setPromedio("333.3");
        
        var persona2 = new Persona();
        persona2.setNombre("Kilian");
        persona2.setEnero("800");
        persona2.setFebrero("200");
        persona2.setMarzo("100");
        persona2.setSuma("1200");
        persona2.setPromedio("400");
                
        var persona3 = new Persona();
        persona3.setNombre("Leo");
        persona3.setEnero("100");
        persona3.setFebrero("200");
        persona3.setMarzo("300");
        persona3.setSuma("600");
        persona3.setPromedio("200");
        
        var persona4 = new Persona();
        persona4.setNombre("Bruno");
        persona4.setEnero("1000");
        persona4.setFebrero("500");
        persona4.setMarzo("100");
        persona4.setSuma("1600");
        persona4.setPromedio("533.3");
        
        var persona5 = new Persona();
        persona5.setNombre("Paul");
        persona5.setEnero("900");
        persona5.setFebrero("500");
        persona5.setMarzo("200");
        persona5.setSuma("1600");
        persona5.setPromedio("533.3");
        
        var personas = Arrays.asList(persona,persona2,persona3,persona4,persona5);
        
        modelo.addAttribute("msg",msg);
        modelo.addAttribute("personas", personas);
        return "index";
    }
    
} 
