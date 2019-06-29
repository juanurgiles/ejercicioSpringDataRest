/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.ejercicio1.vista;

import ec.edu.tecazuay.ejercicio1.controlador.PersonaRepositorio;
import ec.edu.tecazuay.ejercicio1.modelo.Persona;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author casa
 */
@RestController
@RequestMapping("/persona")
public class PersonaRest {

    @Autowired
    PersonaRepositorio personaRepositorio;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Persona> listar() {
        return personaRepositorio.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public Persona guardar(@RequestBody Persona p) {
        return personaRepositorio.save(p);
    }
}
