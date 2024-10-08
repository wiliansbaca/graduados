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
public class mFIchaLaboral {
    String idFichaLaboral;
    String Labor;
    String Empleador;
    double Salario;
    String Fecha_Inicio;
    String Fecha_Fin;
    String idFicha;
    String idEmpresa;

    public mFIchaLaboral() {
    }

    public mFIchaLaboral(String idFichaLaboral, String Labor, String Empleador, double Salario, String Fecha_Inicio, String Fecha_Fin, String idFicha, String idEmpresa) {
        this.idFichaLaboral = idFichaLaboral;
        this.Labor = Labor;
        this.Empleador = Empleador;
        this.Salario = Salario;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Fin = Fecha_Fin;
        this.idFicha = idFicha;
        this.idEmpresa = idEmpresa;
    }

    public String getIdFichaLaboral() {
        return idFichaLaboral;
    }

    public void setIdFichaLaboral(String idFichaLaboral) {
        this.idFichaLaboral = idFichaLaboral;
    }

    public String getLabor() {
        return Labor;
    }

    public void setLabor(String Labor) {
        this.Labor = Labor;
    }

    public String getEmpleador() {
        return Empleador;
    }

    public void setEmpleador(String Empleador) {
        this.Empleador = Empleador;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
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

    public String getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(String idFicha) {
        this.idFicha = idFicha;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
}
