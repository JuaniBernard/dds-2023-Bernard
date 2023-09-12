package com.um.ejercicioUniUnoMucho.repositorios;

import com.um.ejercicioUniUnoMucho.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
