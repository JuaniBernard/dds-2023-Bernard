package com.um.ejercicio2.repositorios;

import com.um.ejercicio2.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository <Domicilio,Long>{
}
