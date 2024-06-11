/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;

import static com.mycompany.loginb.Curso.cursosPorAlumno;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author wil
 */
public class BinManager {
    //estas m son metodos
    public static void guardarProfesores(ArrayList<Profesor> profesores) {
        try (FileOutputStream fos = new FileOutputStream("profesores.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(profesores);
            System.out.println( "Profesor guardado exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println( "Error al guardar el profesor");
        }
    }

    public static void guardarAlumnos(ArrayList<Alumno> alumnos) {
        try (FileOutputStream fos = new FileOutputStream("alumnos.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(alumnos);
            System.out.println("Alumno guardado en bin");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar el alumno");
        }
    }

    public static void guardarCursos(ArrayList<Curso> cursos) {
        try (FileOutputStream fos = new FileOutputStream("cursos.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(cursos);
            System.out.println("Curso guardado exitosamente");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println( "Error al guardar el curso");
        }
    }

    //  métodos  para cargar los datos 
    public static ArrayList<Profesor> cargarProfesores() {
        ArrayList<Profesor> profesores = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("profesores.bin"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            profesores = (ArrayList<Profesor>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al cargar los profesores");
        }
        return profesores;
    }

    public static ArrayList<Alumno> cargarAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("alumnos.bin"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            alumnos = (ArrayList<Alumno>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al cargar los alumnos");
        }
        return alumnos;
    }

    public static ArrayList<Curso> cargarCursos() {
        ArrayList<Curso> cursos = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("cursos.bin"); ObjectInputStream ois = new ObjectInputStream(fis)) {
            cursos = (ArrayList<Curso>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al cargar los cursos");
        }
        return cursos;
    }
     public static void guardarCursosPorAlumno() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cursosPorAlumno.bin"))) {
            oos.writeObject(cursosPorAlumno);
            
        } catch (IOException e) {
            
        }
    }

    public static void cargarCursosPorAlumno() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cursosPorAlumno.bin"))) {
            cursosPorAlumno = (HashMap<String, ArrayList<String>>) ois.readObject();
           
        } catch (IOException | ClassNotFoundException e) {
           
        }
    }
}
