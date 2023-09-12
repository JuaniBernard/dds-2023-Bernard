package com.um.ejercicioBidiMuchoMucho.repositorios;

import com.um.ejercicioBidiMuchoMucho.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
