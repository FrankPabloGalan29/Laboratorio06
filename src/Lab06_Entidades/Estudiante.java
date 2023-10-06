/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab06_Entidades;
import java.util.List;

/**
 *
 * @author Frank Pablo Galán
 */
public class Estudiante {

    private String codigo;
    private String nombre;
    private List<Curso> cursos;
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    
    public String getMostrarEstudiante(){
        return this.nombre+"Codigo: "+this.codigo;
    }
    
    
}
