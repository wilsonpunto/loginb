/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.mycompany.loginb.Alumno;
import com.mycompany.loginb.Loginb;
import com.mycompany.loginb.Profesor;

/**
 *
 * @author wil
 */
public class AlumnoImpl implements EditarService<Alumno>  {

    @Override
    public Alumno buscarElemento(String usuario) {
        for (Alumno alumno : Loginb.alumnos) {
            if (alumno.nombre.equals(usuario)) {
                return alumno;
            }
        }
        return null; // alumno no encontrado
    }

    @Override
    public Alumno buscarElementoId(String usuarioID) {
        for (Alumno alumno : Loginb.alumnos) {
            if (alumno.carne.equals(usuarioID)) {
                return alumno;
            }
        }
        return null; // alumno no encontrado
    }

    @Override
    public void editarElemento(String usuarioID, String nuevoNombre, String nuevoApellido) {
        for (Alumno alumno : Loginb.alumnos) {
            if (alumno.carne.equals(usuarioID)) {
                alumno.nombre = nuevoNombre;
                alumno.apellido = nuevoApellido;
                break; // Terminar la iteración después de editar el elemento
            }
        }    }
    
}
