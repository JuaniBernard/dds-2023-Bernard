package com.um.ejercicioUniUnoMucho.repositorios;

import com.um.ejercicioUniUnoMucho.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Long> {
}
