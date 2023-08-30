package com.um.ejercicio1.repositorios;

import com.um.ejercicio1.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository  <Persona,Long>{
}
