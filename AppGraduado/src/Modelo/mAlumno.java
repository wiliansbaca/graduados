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
public class mAlumno {
    String CodAlumno;
    String Nombres;
    String DNI;
    String Direccion;
    String Telefono;
    byte[] Foto;
    String Correo;
    String Fecha_Graduacion;
    String RedSocial;
    String Sexo;

    public mAlumno() {
    }

    public mAlumno(String CodAlumno, String Nombres, String DNI, String Direccion, String Telefono, byte[] Foto, String Correo, String Fecha_Graduacion, String RedSocial, String Sexo) {
        this.CodAlumno = CodAlumno;
        this.Nombres = Nombres;
        this.DNI = DNI;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Foto = Foto;
        this.Correo = Correo;
        this.Fecha_Graduacion = Fecha_Graduacion;
        this.RedSocial = RedSocial;
        this.Sexo = Sexo;
    }

    public String getCodAlumno() {
        return CodAlumno;
    }

    public void setCodAlumno(String CodAlumno) {
        this.CodAlumno = CodAlumno;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public byte[] getFoto() {
        return Foto;
    }

    public void setFoto(byte[] Foto) {
        this.Foto = Foto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getFecha_Graduacion() {
        return Fecha_Graduacion;
    }

    public void setFecha_Graduacion(String Fecha_Graduacion) {
        this.Fecha_Graduacion = Fecha_Graduacion;
    }

    public String getRedSocial() {
        return RedSocial;
    }

    public void setRedSocial(String RedSocial) {
        this.RedSocial = RedSocial;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
}
