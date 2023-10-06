/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio06;

import Lab06_Entidades.Curso;
import Lab06_Entidades.Estudiante;
import Lab06_Entidades.Profesor;
import Lab06_Pantallas.JFrameGestorDeCursos;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Frank Pablo Galán
 */
public class Laboratorio06 {

    public static List<Curso> cursosRegistrados;
    public static List<Estudiante> listaEstudiantes;
    public static List<Profesor> listaProfesores;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Listas en blanco para el sistema hasta que se cierre
        cursosRegistrados = new ArrayList<>();
        listaEstudiantes = new ArrayList<>();
        listaProfesores = new ArrayList<>();
        
        //Inicio la ventana principal de gestor de cursos
        JFrameGestorDeCursos ventanaPrincipal = new JFrameGestorDeCursos();
        ventanaPrincipal.setLocationRelativeTo(null);//Centra el formulario
        ventanaPrincipal.setVisible(true);
        
    }
    
}
