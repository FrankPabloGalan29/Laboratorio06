/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab06_Entidades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank Pablo Galán
 */
public class Profesor {
    
    private String nombre;
    private List<Curso> cursos;

    public Profesor(String nombre, Curso cursodelProf) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.cursos.add(cursodelProf);
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public List<Curso> getCursos(){
        return cursos;
    }
    public void setCurso(List<Curso> cursos){
        this.cursos = cursos;
    }
    
    public String getmostrarProfesor(){
        return this.nombre;
    }
    
}
