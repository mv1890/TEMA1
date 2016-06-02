/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
/**
 *
 * @author Marc
 */


public class Interfaz {

    //Gestion g = new Gestion();
    JTabbedPane tabs = new JTabbedPane();

    //MENU PRINCIPAL
    JFrame framePrincipal = new JFrame();
    JPanel panelPrincipal = new JPanel(new GridLayout(6, 1));
    JButton btnAltaJugador = new JButton("Alta jugador");
    JButton btnBajaJugador = new JButton("Baja Jugador");
    JButton btnAltaEquipo = new JButton("Alta Equipo");
    JButton btnBajaEquipo = new JButton("Baja Equipo");
    JButton btnModificar = new JButton("Modificar");

    //MENU ALTA JUGADOR
    JFrame frameAltaJugador = new JFrame();
    JPanel panelAltaJugador = new JPanel();
    JLabel labelDniJugadorAlta = new JLabel("Dni:");
    JLabel labelNombreJugadorAlta = new JLabel("Nombre: ");
    JLabel labelDorsalJugadorAlta = new JLabel("Dorsal: ");
    JLabel labelValorJugadorAlta = new JLabel("Valor: ");
    JLabel labelEquipoJugadorAlta = new JLabel("Equipo: ");
    JTextField dniJugadorAlta = new JTextField(20);
    JTextField nombreJugadorAlta = new JTextField(20);
    JTextField dorsalJugadorAlta = new JTextField(20);
    JTextField valorJugadorAlta = new JTextField(20);
    JTextField equipoJugadorAlta = new JTextField(20);
    JButton btnAceptarAlta = new JButton("Aceptar");
    JButton btnCancelarAlta = new JButton("Cancelar");

    //MENU BAJA JUGADOR
    JFrame frameBajaJugador = new JFrame();
    JPanel panelBajaJugador = new JPanel();
    JLabel labelDniJugadorBaja = new JLabel("Dni:");
    JLabel labelNombreJugadorBaja = new JLabel("Nombre:");
    JTextField dniJugadorBaja = new JTextField(20);
    JTextField nombreJugadorBaja = new JTextField(20);
    JButton btnAceptarBaja = new JButton("Aceptar");
    JButton btnCancelarBaja = new JButton("Cancelar");
    
    //MENU MODIFICAR JUGADOR
    JFrame frameModificarJugador = new JFrame();
    JPanel panelModificarJugador = new JPanel();
    static JComboBox comboboxJugador = new JComboBox();
    JButton btnprueba = new JButton();
    
    //MENU ALTA EQUIPO
    JFrame frameAltaEquipo = new JFrame();
    JPanel panelAltaEquipo = new JPanel();
    JLabel labelNombreEquipoAlta = new JLabel("Nombre: ");
    JLabel labelEstadioEquipoAlta = new JLabel("Estadio: ");
    JLabel labelLocalidadEquipoAlta = new JLabel("Localidad: ");
    JLabel labelPresupuestoEquipoAlta = new JLabel("Presupuesto: ");
    JLabel labelGolesFavorEquipoAlta = new JLabel("Goles a favor: ");
    JLabel labelGolesContraEquipoAlta = new JLabel("Goles en contra: ");
    JLabel labelLigaEquipoAlta = new JLabel("Liga: ");
    JTextField nombreEquipoAlta = new JTextField(20);
    JTextField estadioEquipoAlta = new JTextField(20);
    JTextField localidadEquipoAlta = new JTextField(20);
    JTextField presupuestoEquipoAlta = new JTextField(20);
    JTextField golesFavorEquipoAlta = new JTextField(20);
    JTextField golesContraEquipoAlta = new JTextField(20);
    JTextField ligaEquipoAlta = new JTextField(20);
    JButton btnAceptarAltaEquipo = new JButton("Aceptar");
    JButton btnCancelarAltaEquipo = new JButton("Cancelar");

    //MENU ACCESO
    JFrame frameAcceso = new JFrame();
    JPanel panelAcceso = new JPanel();
    JLabel labelAccesoNombre = new JLabel("Usuario: ");
    JLabel labelAccesoContraseña = new JLabel("Contraseña: ");
    JTextField nombreAcceso = new JTextField(20);
    JTextField contraseñaAcceso = new JTextField(20);
    JButton btnAceptarAcceso = new JButton("Acceder");
    JButton btnRegistrarAcceso = new JButton("Registro");

    public void interfazAcceso() {
        GridLayout layoutAcceso = new GridLayout(3, 2);
        frameAcceso.setLayout(new BorderLayout());
        frameAcceso.add(panelAcceso);
        panelAcceso.setLayout(layoutAcceso);
        panelAcceso.add(labelAccesoNombre);
        panelAcceso.add(nombreAcceso);
        panelAcceso.add(labelAccesoContraseña);
        panelAcceso.add(contraseñaAcceso);
        panelAcceso.add(btnAceptarAcceso);
        panelAcceso.add(btnRegistrarAcceso);

        frameAcceso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameAcceso.pack();
        frameAcceso.setVisible(true);
        frameAcceso.setSize(200, 200);

        btnAceptarAcceso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                login lg = new login();
                try {
                    lg.recuperarDatosContacto(nombreAcceso.getText(), contraseñaAcceso.getText());
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    public void interfazPrincipal() {

        framePrincipal.add(panelPrincipal);
        panelPrincipal.add(btnAltaJugador);
        panelPrincipal.add(btnBajaJugador);
        panelPrincipal.add(btnAltaEquipo);
        panelPrincipal.add(btnBajaEquipo);
        panelPrincipal.add(btnModificar);
        framePrincipal.add(tabs);
        tabs.add("Equipo", interfazAltaEquipo());
     //   tabs.add("Jugador", interfazModificarJugador());

        //       tabs.add("Jugador", InterfazAltaJugador());
        framePrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        framePrincipal.pack();
        framePrincipal.setVisible(true);
        framePrincipal.setSize(200, 300);

        //COMPORTAMIENTO BOTONES INTERFAZ PRINCIPAL
        btnAltaJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comportamiento(ae);
            }
        });
        btnBajaJugador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comportamiento(ae);
            }
        });
        btnAltaEquipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comportamiento(ae);
            }
        });
        btnBajaEquipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comportamiento(ae);
            }
        });
        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                comportamiento(ae);
            }
        });

    }

    //   public void InterfazAltaJugador() {
    public JPanel InterfazAltaJugador() {
        frameAltaJugador.setLayout(new BorderLayout());
        frameAltaJugador.add(panelAltaJugador);
        panelAltaJugador.add(labelDniJugadorAlta);
        panelAltaJugador.add(dniJugadorAlta);
        panelAltaJugador.add(labelNombreJugadorAlta);
        panelAltaJugador.add(nombreJugadorAlta);
        panelAltaJugador.add(labelDorsalJugadorAlta);
        panelAltaJugador.add(dorsalJugadorAlta);
        panelAltaJugador.add(labelValorJugadorAlta);
        panelAltaJugador.add(valorJugadorAlta);
        panelAltaJugador.add(labelEquipoJugadorAlta);
        panelAltaJugador.add(equipoJugadorAlta);
        panelAltaJugador.add(btnAceptarAlta);
        panelAltaJugador.add(btnCancelarAlta);

        frameAltaJugador.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameAltaJugador.pack();
        frameAltaJugador.setVisible(true);
        frameAltaJugador.setSize(200, 300);

        //COMPORTAMIENTO BOTONES INTERFAZ ALTA JUGADOR
        btnAceptarAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Gestion g = new Gestion();
                g.altaJugador(dniJugadorAlta.getText(), nombreJugadorAlta.getText(), Integer.parseInt(dorsalJugadorAlta.getText()), Float.parseFloat(valorJugadorAlta.getText()), equipoJugadorAlta.getText());

            }
        });

        btnCancelarAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frameAltaJugador.dispose();
            }
        });

        return panelAltaJugador;
    }

    public JPanel InterfazBajaJugador() {

        frameBajaJugador.setLayout(new BorderLayout());
        frameBajaJugador.add(panelBajaJugador);
        panelBajaJugador.add(labelDniJugadorBaja);
        panelBajaJugador.add(dniJugadorBaja);
        panelBajaJugador.add(labelNombreJugadorBaja);
        panelBajaJugador.add(nombreJugadorBaja);
        
        frameBajaJugador.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameAltaJugador.pack();
        frameAltaJugador.setVisible(true);

        return panelBajaJugador;
    }
    
    public JPanel interfazModificarJugador() throws SQLException, ClassNotFoundException{
        
        frameModificarJugador.setLayout(new BorderLayout());
        frameModificarJugador.add(panelModificarJugador);
        panelModificarJugador.add(comboboxJugador);
        Gestion g = new Gestion();
        g.modificarJugador();
        
        frameModificarJugador.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameModificarJugador.pack();
        frameModificarJugador.setVisible(true);
        
        return panelModificarJugador;
    }

    public JPanel interfazAltaEquipo() {
        frameAltaEquipo.setLayout(new BorderLayout());
        frameAltaEquipo.add(panelAltaEquipo);
        panelAltaEquipo.add(labelNombreEquipoAlta);
        panelAltaEquipo.add(nombreEquipoAlta);
        panelAltaEquipo.add(labelEstadioEquipoAlta);
        panelAltaEquipo.add(estadioEquipoAlta);
        panelAltaEquipo.add(labelPresupuestoEquipoAlta);
        panelAltaEquipo.add(presupuestoEquipoAlta);
        panelAltaEquipo.add(labelLocalidadEquipoAlta);
        panelAltaEquipo.add(localidadEquipoAlta);
        panelAltaEquipo.add(labelGolesFavorEquipoAlta);
        panelAltaEquipo.add(golesFavorEquipoAlta);
        panelAltaEquipo.add(labelGolesContraEquipoAlta);
        panelAltaEquipo.add(golesContraEquipoAlta);
        panelAltaEquipo.add(labelLigaEquipoAlta);
        panelAltaEquipo.add(ligaEquipoAlta);

        panelAltaEquipo.add(btnAceptarAltaEquipo);
        panelAltaEquipo.add(btnCancelarAltaEquipo);

        frameAltaEquipo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frameAltaEquipo.pack();
        frameAltaEquipo.setVisible(true);
        frameAltaEquipo.setSize(200, 300);

        btnAceptarAltaEquipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    Gestion g = new Gestion();
                    g.altaEquipo(nombreEquipoAlta.getText(), estadioEquipoAlta.getText(), localidadEquipoAlta.getText(), Float.parseFloat(presupuestoEquipoAlta.getText()), Integer.parseInt(golesFavorEquipoAlta.getText()), Integer.parseInt(golesContraEquipoAlta.getText()), ligaEquipoAlta.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        return panelAltaEquipo;

    }

    public void comportamiento(ActionEvent ae) {
        Object obj = ae.getSource();

        if (obj == btnCancelarAlta) {
        }
        if (obj == btnAltaJugador) {
            InterfazAltaJugador();

        }
        if (obj == btnAltaEquipo) {
            interfazAltaEquipo();
        }

    }

}
