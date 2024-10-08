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
public class mFicha {
    String idFicha;
    String Tipo;
    String Fecha_Grado;
    String Nombre_Asesor;
    String Nombre_Resolucion;
    String Grado;
    int lib;
    String Modalidad;
    String idTrabajador;
    String CodAlumno;

    public mFicha() {
    }

    public mFicha(String idFicha, String Tipo, String Fecha_Grado, String Nombre_Asesor, String Nombre_Resolucion, String Grado, int lib, String Modalidad, String idTrabajador, String CodAlumno) {
        this.idFicha = idFicha;
        this.Tipo = Tipo;
        this.Fecha_Grado = Fecha_Grado;
        this.Nombre_Asesor = Nombre_Asesor;
        this.Nombre_Resolucion = Nombre_Resolucion;
        this.Grado = Grado;
        this.lib = lib;
        this.Modalidad = Modalidad;
        this.idTrabajador = idTrabajador;
        this.CodAlumno = CodAlumno;
    }

    public String getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(String idFicha) {
        this.idFicha = idFicha;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFecha_Grado() {
        return Fecha_Grado;
    }

    public void setFecha_Grado(String Fecha_Grado) {
        this.Fecha_Grado = Fecha_Grado;
    }

    public String getNombre_Asesor() {
        return Nombre_Asesor;
    }

    public void setNombre_Asesor(String Nombre_Asesor) {
        this.Nombre_Asesor = Nombre_Asesor;
    }

    public String getNombre_Resolucion() {
        return Nombre_Resolucion;
    }

    public void setNombre_Resolucion(String Nombre_Resolucion) {
        this.Nombre_Resolucion = Nombre_Resolucion;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public int getLib() {
        return lib;
    }

    public void setLib(int lib) {
        this.lib = lib;
    }

    public String getModalidad() {
        return Modalidad;
    }

    public void setModalidad(String Modalidad) {
        this.Modalidad = Modalidad;
    }

    public String getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(String idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public String getCodAlumno() {
        return CodAlumno;
    }

    public void setCodAlumno(String CodAlumno) {
        this.CodAlumno = CodAlumno;
    }
    
}
