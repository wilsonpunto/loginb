/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.mycompany.loginb.Loginb;
import com.mycompany.loginb.Profesor;

/**
 *
 * @author wil
 */
public class ProfesorImpl implements EditarService<Profesor>  {

    @Override
    public Profesor buscarElemento(String usuario) {
        for (Profesor profesor : Loginb.profesores) {
            if (profesor.usuario.equals(usuario)) {
                return profesor;
            }
        }
        return null; // Profesor no encontrado
    }

    @Override
    public void editarElemento(String usuarioID, String nuevoNombre, String nuevoApellido) {
        for (Profesor profesor : Loginb.profesores) {
            if (profesor.usuario.equals(usuarioID)) {
                profesor.nombre = nuevoNombre;
                profesor.apellido = nuevoApellido;
                break; // Terminar la iteración después de editar el elemento
            }
        }
    }

    @Override
    public Profesor buscarElementoId(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


   
    

