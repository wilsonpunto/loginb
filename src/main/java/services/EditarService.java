/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package services;

import com.mycompany.loginb.Profesor;

/**
 *
 * @author wil
 */
public interface EditarService<T> {
    T buscarElemento(String usuario);
    T buscarElementoId(String usuarioID);
    void editarElemento(String usuarioID, String nuevoNombre, String nuevoApellido);
}