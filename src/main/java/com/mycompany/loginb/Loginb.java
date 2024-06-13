    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     */

package com.mycompany.loginb;


import static com.mycompany.loginb.Curso.contadorCurso;
import static com.mycompany.loginb.Curso.cursosPorAlumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

    /**
     *
     * @author wil
     */
    public class Loginb {

        public static ArrayList<Profesor> profesores = new ArrayList<>();
        public static Profesor profesorLogeado = new Profesor();
        public static ArrayList<Alumno> alumnos = new ArrayList<>();
        public static Alumno alumnoLogeado = new Alumno();
        public static ArrayList<Curso> Cursos = new ArrayList<>();
        

        public void agregarAlumno(Alumno alumno) {
            alumnos.add(alumno);
        }
       
        public static void main(String[] args) {
        // Cargar profesores
            Loginb.profesores = BinManager.cargarProfesores();

        // Cargar alumnos
            Loginb.alumnos = BinManager.cargarAlumnos();

        // Cargar cursos
            Loginb.Cursos = BinManager.cargarCursos();
            BinManager.cargarCursosPorAlumno();
            
            Login l = new Login();
            l.setVisible(true);
        }
        
        public static boolean validarContrasena(String contrasena) {
        // Expresión regular para validar la contraseña
            String expresionRegular = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";

            Pattern pattern = Pattern.compile(expresionRegular);
            Matcher matcher = pattern.matcher(contrasena);

            return matcher.matches();
        }
        public static boolean validarUsuarioExistente(String usuario) {
            for (Profesor profesor : Loginb.profesores) {
                return profesor.usuario.equals(usuario); // El usuario ya existe
        }
            return false;

        }   
      
       /* public static boolean validarCursos(String carneAlumno) {
        ArrayList<String> cursosActuales = cursosPorAlumno.getOrDefault(carneAlumno, new ArrayList<>());
        return cursosActuales.size() >= 5;
    }*/

        public static List<Curso> buscarCursosAlumno(Alumno alumno) {
        List<Curso> cursosAlumno = new ArrayList<>();
        for (Curso e : Loginb.Cursos) {
            // Se compara el carne del alumno inscrito con los alumnos de todos los cursos
            if (e.Alumnos.stream().anyMatch(alumnoInscrito -> alumnoInscrito.carne.equalsIgnoreCase(alumno.carne))) { 
                cursosAlumno.add(e);

            }
        }
        return cursosAlumno;
    }   
        public static List<Curso> buscarCursosProfe(Profesor profesor) {
        List<Curso> cursosProfe = new ArrayList<>();
        for (Curso e : Loginb.Cursos) {
             
            // Verificar si el alumno está asignado en el curso
            if (e.profesor.equals(profesor.usuario)) { 
                cursosProfe.add(e);

            }
        }
        return cursosProfe;
    } 
        public static void quitarAlumnoCurso(Alumno alumnoLogeado, String codigoCurso) {
        for (Curso curso : Loginb.Cursos) {
            if (curso.codigo.equals(codigoCurso)) {

                for (int i = 0; i < curso.Alumnos.size(); i++) {
                    Alumno alumnoEnCurso = curso.Alumnos.get(i);
                    if (alumnoEnCurso.carne.equals(alumnoLogeado.carne)) {
                        curso.Alumnos.remove(i); 
                        return; 
                    }
                }


                System.err.println("Error Alumno " + alumnoLogeado.nombre + " no encontrado en el curso '" + codigoCurso);
            }
    }

 
}       
        public static Alumno buscarAlu(String usuario) {
        for (Alumno alumno : Loginb.alumnos) {
            if (alumno.carne.equals(usuario)) {
                return alumno;
            }
        }
        return null; // alumno no encontrado
    }
      
        public static boolean validarCursos(Curso curso) {
        // validar límite de 10 alumnos por curso
        if (curso.Alumnos.size() >= 10) {
            JOptionPane.showMessageDialog(null, "El curso ya tiene el máximo de alumnos permitidos (10).");
            return false;
        }
        return true; 
}    
        public static boolean validarInscritos(Alumno alumno) {
        
          // validar límite de 5 inscripciones por alumno en todos los cursos
        int contadorInscripciones = 0;
        for (Curso c : Loginb.Cursos) {
            contadorInscripciones += Collections.frequency(c.Alumnos, alumno); // Contar cuántas veces aparece el alumno en cada curso
            if (contadorInscripciones >= 5) {
                JOptionPane.showMessageDialog(null, "El alumno ya está inscrito al máximo de cursos permitidos (5)");
                return false;
            }
        }
        return true; 
}




       
        
}
