package com.ups.PracticaMS_Docente.services;

import com.ups.PracticaMS_Docente.model.Curso;
import com.ups.PracticaMS_Docente.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired // es como el inject
    private CursoRepository cursoRepository;

    //Servicio de crear Docentes
    public Curso create(Curso curso){
        return cursoRepository.save(curso);

    }
    //Servicios de Listar Serviciso

    public List<Curso> listCurso() {
        return cursoRepository.findAll();
    }
}
