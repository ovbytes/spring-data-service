
package com.mycompany.service;

import com.mycompany.domain.Persona;
import java.util.List;

public interface PersonaService {
    public List<Persona> listPersona();
    
    public void save(Persona persona);
    
    public void delete(Persona persona);
    
    public Persona findPersona(Persona persona);
}
