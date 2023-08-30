package com.um.ejercicio2.repositorios;

import com.um.ejercicio2.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository  <Persona,Long>{
}