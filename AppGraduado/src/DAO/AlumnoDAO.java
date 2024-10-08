/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jinn
 */
public class AlumnoDAO {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String query = "";
    private ImageIcon format = null;
    Statement st;
    ResultSet rs;

    public String RecuperarCodigo() {
        DefaultTableModel modelo;
        String[] titulos = {"Codigo"};
        Object[] registro = new Object[1];
        modelo = new DefaultTableModel(null, titulos);
        query = "select fn_Codsiguiente_Alumno()";
        try {
            CallableStatement cst = cn.prepareCall(query);
            cst.execute();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                registro[0] = rs.getString("fn_Codsiguiente_Alumno()");
                modelo.addRow(registro);
            }
            return modelo.getValueAt(0, 0).toString();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel getLista(String cadenaEscrita) {
        DefaultTableModel modelo = new DefaultTableModel();
        try {
            String query = "select Nombres from talumno where like '" + cadenaEscrita + "%';";
            st = (Statement) mysql.conectar();
            rs = st.executeQuery(query);
            while (rs.next()) {
                modelo.addColumn(rs.getString("Nombres"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlumnoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
    public DefaultTableModel RecuperarAlumno(String pdato) {
        DefaultTableModel modelo;
        String[] titulos = {"Nombres"};
        Object[] registros = new Object[titulos.length];
        modelo = new DefaultTableModel(null, titulos);
        query = "call Usp_Listar_Alumnos_Nombres(?)";
        try {
            CallableStatement cst = cn.prepareCall(query);
            cst.setString("pdato", pdato);
            cst.execute();
            ResultSet rs = cst.getResultSet();
            while (rs.next()) {
                registros[0] = rs.getObject("Nombres");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

}
