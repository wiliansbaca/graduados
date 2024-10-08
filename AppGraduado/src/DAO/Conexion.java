/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jinn
 */
public class Conexion {

    public String bd = "bdGraduados";
    public String url = "jdbc:mysql://localhost/" + bd;
    public String user = "root";
    public String pass = "";

    public Conexion() {

    }

    public Connection conectar() {
        java.sql.Connection link = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.user, this.pass);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return link;
    }

}
