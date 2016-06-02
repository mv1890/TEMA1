/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marc
 */
public class Gestion {

  ArrayList<arrayGeneral> arrayGen = new ArrayList<>();
   

    /* public void altaJugador(String nombre, String dni, String dorsal, String valor, String equipo) {

        Jugador jug = new Jugador(nombre, dni, dorsal, valor, equipo);
        arrayJug.add(jug);

        recorrerArray();
    }*/
    public void altaJugador(String dniJugadorAlta, String nombreJugadorAlta, int dorsalJugadorAlta, float valorJugadorAlta, String equipoJugadorAlta) {

        String servidor = "jdbc:mysql://localhost/";
        String bd = "liga_futbol";
        String usuario = "user";
        String contraseña = "1234";
        String sentenciaSQL;
        BaseDeDatos db = new BaseDeDatos(bd, usuario, contraseña, servidor);

        try {
            if (db.abrirConexion()) {
                System.out.println("Conectado");
                System.out.println("DNI: " + dniJugadorAlta);

                sentenciaSQL = "INSERT INTO JUGADORES VALUES"
                        + "('" + dniJugadorAlta + "', '" + nombreJugadorAlta + "', '" + dorsalJugadorAlta + "', '" + valorJugadorAlta + "', '" + equipoJugadorAlta + "');";
                db.ejecutarUpdate(sentenciaSQL);

            }
        } catch (NumberFormatException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void altaEquipo(String nombreEquipoAlta, String estadioEquipoAlta, String localidadEquipoAlta, float presupuestoEquipoAlta, int golesFavorEquipoAlta, int golesContraEquipoAlta, String ligaEquipoAlta) throws SQLException, ClassNotFoundException {

        String servidor = "jdbc:mysql://localhost/";
        String bd = "liga_futbol";
        String usuario = "user";
        String contraseña = "1234";
        String sentenciaSQL;
        BaseDeDatos db = new BaseDeDatos(bd, usuario, contraseña, servidor);

        if (db.abrirConexion()) {
            System.out.println("Conectado");

            sentenciaSQL = "INSERT INTO EQUIPOS VALUES"
                    + "('" + nombreEquipoAlta + "', '" + estadioEquipoAlta + "', '" + localidadEquipoAlta + "', '" + presupuestoEquipoAlta + "', '" + golesFavorEquipoAlta + "', '" + golesContraEquipoAlta + "', '" + ligaEquipoAlta + "');";
            db.ejecutarUpdate(sentenciaSQL);

        }
    }
    
   public void modificarJugador() throws SQLException, ClassNotFoundException{
        
        String servidor = "jdbc:mysql://localhost/";
        String bd = "liga_futbol";
        String usuario = "user";
        String contraseña = "1234";
        String sentenciaSQL;
        BaseDeDatos db = new BaseDeDatos(bd, usuario, contraseña, servidor);
        
        if (db.abrirConexion()) {
            System.out.println("Conectado");
            
            sentenciaSQL = "SELECT * FROM JUGADORES";
            ResultSet rs;
            rs=db.ejecutarQuery(sentenciaSQL);
            int c = 0;
            Interfaz i = new Interfaz();
            while (rs.next()){
                arrayGeneral jugador = new arrayGeneral(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getString(5));
                arrayGen.add(c, jugador);
                i.comboboxJugador.addItem(rs.getString(1) + ", " + rs.getString(2));
                c++;
            }
            
        }
        
    }
    
    

  /*  public void recorrerArray() {

        Iterator it = arrayJug.iterator();
        while (it.hasNext()) {
            Object elemento = it.next();
            System.out.println("");
            System.out.println(elemento);
            System.out.println("");
        }

    }*/
    
    

}
