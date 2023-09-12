package com.um.ejercicioBidiUno.repositorios;

import com.um.ejercicioBidiUno.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
