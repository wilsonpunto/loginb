/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author wil
 */
public class Curso implements Serializable{
    public String nombre;
    public String codigo;
    public String seccion;
    public Date fechaIni;
    public Date fechaFin;
    public String profesor;
    public String horaIni;
    public String horaFin;
    public ArrayList<Alumno> Alumnos = new ArrayList<>();
     public static HashMap<String, ArrayList<String>> cursosPorAlumno = new HashMap<>();

    public static void contadorCurso(String carneAlumno, String codigoCurso) {
        
            ArrayList<String> cursosActuales = cursosPorAlumno.getOrDefault(carneAlumno, new ArrayList<>());
            cursosActuales.add(codigoCurso);
            cursosPorAlumno.put(carneAlumno, cursosActuales);
            
        
    }
}
