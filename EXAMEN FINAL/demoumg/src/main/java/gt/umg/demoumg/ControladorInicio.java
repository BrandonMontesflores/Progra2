/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.umg.demoumg;

import gt.umg.demoumg.dao.IPersonaDao;
import gt.umg.demoumg.servicio.DepartamentoService;
import gt.umg.demoumg.servicio.PersonaService;
import gt.umg.demoumg.servicio.ProfesionService;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Usuario
 */
@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired
    private PersonaService personaService;
    
    @Autowired
    private DepartamentoService departamentoService;
    
    @Autowired
    private ProfesionService profesionService;
    
    
    @GetMapping("/")
    public String inicio(Model modelo){
        var personas = personaService.listaPersonas();
        modelo.addAttribute("personas",personas);
        
        var departamentos = departamentoService.listaDepartamentos();
        modelo.addAttribute("deptos",departamentos);
        
        var profesiones = profesionService.listaProfesion();
        modelo.addAttribute("profes",profesiones);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona,Model modelo){
        var departamentos = departamentoService.listaDepartamentos();
        modelo.addAttribute("deptos",departamentos);
        
        var profesiones = profesionService.listaProfesion();
        modelo.addAttribute("profes",profesiones);
             
        return "modificar";
    }
    
    @GetMapping("/agregar2")
    public String agregar2(Profesion profesion){
        return "modificar2"; 
    }  
    
    @PostMapping("/guardar") 
    public String guardar(Persona persona){
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @PostMapping("/guardar2") 
    public String guardar2(Profesion profesion){
        profesionService.guardarprof(profesion);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{id_usuario}")
    public String editar(Persona persona,Model modelo){
        persona = personaService.encontrarPersona(persona);
        modelo.addAttribute("persona",persona);
        
        var departamentos = departamentoService.listaDepartamentos();
        modelo.addAttribute("deptos",departamentos);
        
        var profesiones = profesionService.listaProfesion();
        modelo.addAttribute("profes",profesiones);
        
        return "modificar";
    }
    
    @GetMapping("/editar2/{id_profesion}")
    public String editar2(Profesion profesion,Model modelo){
        profesion = profesionService.encontrarProfesion(profesion);
        modelo.addAttribute("profesion",profesion);
        return "modificar2";
    }
    
    
    @GetMapping("/eliminar/{id_usuario}")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/eliminar2/{id_profesion}")
    public String eliminar2(Profesion profesion){
        profesionService.eliminarprof(profesion);
        return "redirect:/";
    }
     
}
