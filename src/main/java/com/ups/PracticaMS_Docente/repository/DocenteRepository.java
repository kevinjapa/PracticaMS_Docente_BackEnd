package com.ups.PracticaMS_Docente.repository;

import com.ups.PracticaMS_Docente.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository<Docente, Long> {
}