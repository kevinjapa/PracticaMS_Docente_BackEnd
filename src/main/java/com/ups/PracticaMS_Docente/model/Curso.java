package com.ups.PracticaMS_Docente.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Curso")
public class Curso
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private float horas;
    private String docente;
    private String estudiante;

    public Curso() {

    }

    public Curso(int id, String nombre, float horas, String docente, String estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.docente = docente;
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }
}

