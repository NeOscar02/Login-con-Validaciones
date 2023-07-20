/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author oskr0
 */
public class ConsultasSQL {

    public static ConexionBD conexion = new ConexionBD();
    public static PreparedStatement pps;
    public static ResultSet res;
    public static String SQL;
    public static int resultadoNu = 0;

    public int guardar(String nombre, String apellidos, String correo, String contraseña, String CURP, String palseg) {
        int resultado = 0;
        Connection conexion = null;
        String Guardar = ("INSERT INTO usuarios (Nombre,Apellidos,Correo,Contraseña,CURP,PalSeg,Admin)"
                + "VALUES (?,?,?,?,?,?,?)");
        try {
            conexion = ConexionBD.conexion();
            pps = conexion.prepareStatement(Guardar);
            pps.setString(1, nombre);
            pps.setString(2, apellidos);
            pps.setString(3, correo);
            pps.setString(4, contraseña);
            pps.setString(5, CURP);
            pps.setString(6, palseg);
            pps.setString(7, "N");
            resultado = pps.executeUpdate();
            pps.close();
            conexion.close();

        } catch (Exception e) {
            System.out.print(e);
        }
        return resultado;
    }

    public static String BuscarNombre(String correo) {
        String BusquedaFinalizada = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conexion();
            String BuscarEnBD = ("SELECT Nombre,Apellidos FROM usuarios WHERE Correo = '" + correo + "'");
            pps = conexion.prepareStatement(BuscarEnBD);
            res = pps.executeQuery();
            if (res.next()) {
                String nombre = res.getString("Nombre");
                String apellidos = res.getString("Apellidos");
                BusquedaFinalizada = (nombre + " " + apellidos);
            }
            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return BusquedaFinalizada;
    }

    public static String BuscarUsRegis(String correo, String contraseña) {
        String BuscaUsuario = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conexion();
            String BuscarUsuarioEnBD = ("SELECT Nombre,Correo,Contraseña "
                    + "FROM usuarios WHERE Correo = '" + correo + "' && Contraseña COLLATE utf8mb4_0900_as_cs = '" + contraseña + "'");
            pps = conexion.prepareStatement(BuscarUsuarioEnBD);
            res = pps.executeQuery();
            if (res.next()) {
                BuscaUsuario = "Usuario encontrado";
            } else {
                BuscaUsuario = "Usuario no encontrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return BuscaUsuario;
    }

    public static String BuscarCorreoRegis(String correo) {
        String BuscarCorreo = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conexion();
            String BuscarCorreoEnBD = ("SELECT Correo "
                    + "FROM usuarios WHERE Correo = '" + correo + "'");
            pps = conexion.prepareStatement(BuscarCorreoEnBD);
            res = pps.executeQuery();
            if (res.next()) {
                BuscarCorreo = "Correo Registrado";
            } else {
                BuscarCorreo = "Correo no registrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return BuscarCorreo;
    }
    
public static String BuscarPalReg(String correo, String palabra) {
        String BuscaPalabraSegura = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conexion();
            String BuscarPalEnBD = ("SELECT Nombre,PalSeg "
                    + "FROM usuarios WHERE Correo = '" + correo + "' && PalSeg = '" + palabra + "'");
            pps = conexion.prepareStatement(BuscarPalEnBD);
            res = pps.executeQuery();
            if (res.next()) {
                BuscaPalabraSegura = "Autentificado";
            } else {
                BuscaPalabraSegura = "No Autentificado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return BuscaPalabraSegura;
    }

public static String BuscarCurpRegis(String curp) {
        String BuscarCurp = null;
        Connection conexion = null;
        try {
            conexion = ConexionBD.conexion();
            String BuscarCurpEnBD = ("SELECT CURP "
                    + "FROM usuarios WHERE CURP = '" + curp + "'");
            pps = conexion.prepareStatement(BuscarCurpEnBD);
            res = pps.executeQuery();
            if (res.next()) {
                BuscarCurp = "Curp Registrado";
            } else {
                BuscarCurp = "Curp no registrado";
            }
            conexion.close();
        } catch (Exception e) {
            System.out.print(e);
        }
        return BuscarCurp;
    }
    
    
        
    
    
}
