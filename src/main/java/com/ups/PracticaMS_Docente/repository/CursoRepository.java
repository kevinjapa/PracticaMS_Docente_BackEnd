package com.ups.PracticaMS_Docente.repository;

import com.ups.PracticaMS_Docente.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
