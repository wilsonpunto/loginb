/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import com.mycompany.loginb.Curso;
import com.mycompany.loginb.Loginb;
import com.mycompany.loginb.Profesor;

/**
 *
 * @author wil
 */
public class CursoImpl implements EditarService<Curso>{

    @Override
    public Curso buscarElemento(String usuario) {
        for (Curso c : Loginb.Cursos) {
            if (c.nombre.equals(usuario)) {
                return c;
            }
        }
        return null; // curso no encontrado
    }

    @Override
    public void editarElemento(String usuarioID, String nuevoNombre, String nuevoApellido) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Curso buscarElementoId(String usuarioID) {
      
        for (Curso c : Loginb.Cursos) {
            if (c.codigo.equals(usuarioID)) {
                return c;
            }
        }
        return null; // curso no encontrado
    }


}
