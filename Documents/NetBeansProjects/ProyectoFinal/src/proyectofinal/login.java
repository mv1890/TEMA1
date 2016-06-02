/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marc
 */
public class login {
    
    private boolean contactoCorrecto= false;
    private Usuarios u;
    
    public void recuperarDatosContacto(String usuario, String contraseña) throws SQLException, ClassNotFoundException{
        BaseDeDatos bd = new BaseDeDatos("liga_futbol", "user", "1234", "jdbc:mysql://localhost/");
        ResultSet rs = null;
        
        if (bd.abrirConexion()){
            System.out.println("Conectado");
            String sentenciaSQL = "SELECT * FROM usuarios;";
            rs = bd.ejecutarQuery(sentenciaSQL);
           
            while (rs.next()){
                if (((rs.getString(1)).equals(usuario) & ((rs.getString(2)).equals(contraseña)))){
                u = new Usuarios(rs.getString(1), rs.getString(2));
                contactoCorrecto = true;
                    System.out.println("Usuario conectado");
                    Interfaz i = new Interfaz();
                    i.interfazPrincipal();
                    
            }else{
                    System.out.println("Usuario o contraseña incorrecto");
                }
              
            }
        }
    }
    
}
