/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author jinn
 */
public class mUsuario {
    String Usuario;
    String Pass;
    String Tipo;
    int Habilitado;
    String idTrabajador;

    public mUsuario() {
    }

    public mUsuario(String Usuario, String Pass, String Tipo, int Habilitado, String idTrabajador) {
        this.Usuario = Usuario;
        this.Pass = Pass;
        this.Tipo = Tipo;
        this.Habilitado = Habilitado;
        this.idTrabajador = idTrabajador;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getHabilitado() {
        return Habilitado;
    }

    public void setHabilitado(int Habilitado) {
        this.Habilitado = Habilitado;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
}
