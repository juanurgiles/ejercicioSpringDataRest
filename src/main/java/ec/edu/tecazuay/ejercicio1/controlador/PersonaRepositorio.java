/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.tecazuay.ejercicio1.controlador;

import ec.edu.tecazuay.ejercicio1.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author casa
 */
public interface PersonaRepositorio extends JpaRepository<Persona, Long>{
    
}
