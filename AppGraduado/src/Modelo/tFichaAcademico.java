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
public class tFichaAcademico {
    String idFichaAcademico;
    int Nro_Horas;
    String Rubro;
    String Tipo;
    String Fecha_Inicio;
    String Fecha_Fin;
    String idInstituto;
    String idFicha;

    public tFichaAcademico() {
    }

    public tFichaAcademico(String idFichaAcademico, int Nro_Horas, String Rubro, String Tipo, String Fecha_Inicio, String Fecha_Fin, String idInstituto, String idFicha) {
        this.idFichaAcademico = idFichaAcademico;
        this.Nro_Horas = Nro_Horas;
        this.Rubro = Rubro;
        this.Tipo = Tipo;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Fin = Fecha_Fin;
        this.idInstituto = idInstituto;
        this.idFicha = idFicha;
    }

    public String getIdFichaAcademico() {
        return idFichaAcademico;
    }

    public void setIdFichaAcademico(String idFichaAcademico) {
        this.idFichaAcademico = idFichaAcademico;
    }

    public int getNro_Horas() {
        return Nro_Horas;
    }

    public void setNro_Horas(int Nro_Horas) {
        this.Nro_Horas = Nro_Horas;
    }

    public String getRubro() {
        return Rubro;
    }

    public void setRubro(String Rubro) {
        this.Rubro = Rubro;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(String Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public String getFecha_Fin() {
        return Fecha_Fin;
    }

    public void setFecha_Fin(String Fecha_Fin) {
        this.Fecha_Fin = Fecha_Fin;
    }

    public String getIdInstituto() {
        return idInstituto;
    }

    public void setIdInstituto(String idInstituto) {
        this.idInstituto = idInstituto;
    }

    public String getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(String idFicha) {
        this.idFicha = idFicha;
    }
    
}
