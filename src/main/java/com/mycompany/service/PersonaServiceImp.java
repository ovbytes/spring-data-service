/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.service;

import com.mycompany.dao.PersonaDAO;
import com.mycompany.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImp implements PersonaService{

    @Autowired
    private PersonaDAO personaDAO;
    
    @Override
    @Transactional(readOnly=true)
    public List<Persona> listPersona() {
        return (List<Persona>) personaDAO.findAll();
    }

    @Override
    @Transactional()
    public void save(Persona persona) {
        personaDAO.save(persona);
    }

    @Override
    @Transactional()
    public void delete(Persona persona) {
        personaDAO.delete(persona);
    }

    @Override
    @Transactional(readOnly=true)
    public Persona findPersona(Persona persona) {
        return personaDAO.findById(persona.getIdPersona()).orElse(null);
    }
    
}
