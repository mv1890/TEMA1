/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marc
 */
public class BaseDeDatos {
    
    
    String bd = "liga_futbol";
    String usuario = "user";
    String contraseña = "1234";
    String servidor = "jdbc:mysql://localhost/";

    Connection conexion;

    BaseDeDatos(String bd, String usuario, String contraseña, String servidor) {
        this.bd = bd;
        this.contraseña = contraseña;
        this.servidor = servidor;
        this.usuario = usuario;

    }


    public boolean abrirConexion() throws SQLException, ClassNotFoundException {
        boolean estado = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(servidor + bd, usuario, contraseña);
            estado = true;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Error de conexion");
        }
        return estado;
    }

    public void cerrarConexion() {

        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public int ejecutarUpdate(String sentenciaSQL) {

        int i = 0;
        try {
            Statement st = conexion.createStatement();
            i = st.executeUpdate(sentenciaSQL);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return i;

    }

    public ResultSet ejecutarQuery(String sentenciaSQL) {
        ResultSet rs = null;
        try {
            Statement st = conexion.createStatement();
            rs = st.executeQuery(sentenciaSQL);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }

    public String[] devolverStringResultSet(String sentenciaSQL) throws SQLException {
        String cadena = "";
        ResultSet rs = ejecutarQuery(sentenciaSQL);
        ResultSetMetaData metaDatos = rs.getMetaData();
        int numColumnas = metaDatos.getColumnCount();
        String[] columnas = new String[numColumnas];
        for (int i = 0; i < numColumnas; i++) {
            columnas[i] = metaDatos.getColumnLabel(i + 1);
        }
        return columnas;

    }

    public void actualizarDesdeResulSet(String sentenciaSQL) throws SQLException {
        ResultSet rs = null;
        try {
            Statement st = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);//Poder modificar desde el resulset la base de datos
            rs = st.executeQuery(sentenciaSQL);
            String nombre = "xxx";
            while (rs.next()) {
                rs.updateString("nombre", nombre);
                rs.updateString("sexo", "F");
            }
        } catch (SQLException ex){
            System.out.println(ex.getMessage());

        }

    }
    
    
    
    
}
    

