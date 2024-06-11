    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginb;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author wil
 */
public class Alumno implements Serializable{
    public String nombre;
    public String apellido;
    public String carne;
    public String password;
    public NotasFinales notasFinales = new NotasFinales();
    public String Genero;
 
   
    public class NotasFinales extends HashMap<String, Double> implements Serializable {
  
    public void agregarNotaFinal(String codigoCurso, double notaFinal) {
        notasFinales.put(codigoCurso, notaFinal);
        }

    public double getNotaFinal(String codigoCurso) {
        return notasFinales.getOrDefault(codigoCurso, 0.0);
        }
    }
    
}   
