package com.mycompany.web;

import com.mycompany.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        
        var personas = personaService.listPersona();
                
        log.info("Executing the Spring Controller MVC");
        model.addAttribute("personas", personas);
        
        return "index";
    }

}
