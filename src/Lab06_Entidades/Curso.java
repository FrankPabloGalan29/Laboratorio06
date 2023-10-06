/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab06_Entidades;

import java.util.ArrayList;


/**
 *
 * @author Frank Pablo Galán
 */
public class Curso {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Profesor> profesores;
    private String codigo;
    private Integer creditos;
    private String nombre;
    
    public Curso(){}

    public Curso(String codigo, Integer creditos, String nombre) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.nombre = nombre;
        //this.estudiantes = new ArrayList<>();
        //this.profesores = new ArrayList<>();
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiantes.size() < 30) {
            estudiantes.add(estudiante);
        } else {
            // Deja de agregarse los estudiantes a este curso
        }
    }
    
    public void eliminarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }
    
    public void agregarProfesor(Profesor profesor) {
        if (profesores.size() < 2) {
            profesores.add(profesor);
        } else {
            // Deja de agregarse los profesores a este curso
        }
    }

    public void eliminarProfesor(Profesor profesor) {
        profesores.remove(profesor);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
   
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
   
    public Integer getCreditos(){
        return creditos;
    }
    public void setCreditos(Integer creditos){
        this.creditos = creditos;
    }
   
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String mostrarCursos(){
        return this.getNombre()+"Codigo: "+this.getCodigo()
                +"Creditos: "+this.getCreditos();
    }

}
