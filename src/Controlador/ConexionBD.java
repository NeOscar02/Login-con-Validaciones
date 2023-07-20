/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author oskr0
 */
public class ConexionBD {

    public static String url = "jdbc:mysql://localhost/loginbd";
    public static String usuario = "root";
    public static String contraseña = "9101";
    public static String clase = "com.mysql.cj.jdbc.Driver";

    public static Connection conexion() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.print("Conexion exitosa");
        } catch (Exception e) {
            System.out.print(e);
        }
        return conexion;
    }
}
