/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Marc
 */
public class Jugador {
    
    private String nombre;
    private String dni;
    private int dorsal;
    private float valor;
    private String equipo;
    
    public Jugador(String dni, String nombre, int dorsal, float valor, String equipo){
        this.nombre = nombre;
        this.dni = dni;
        this.dorsal = dorsal;
        this.valor = valor;
        this.equipo = equipo;
        System.out.println("Ejecuntado constructor Jugador");
    }
    
    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\n Dni: " + this.getDni() +"\n Dorsal: " + this.getDorsal() + "/nValor: " + getValor() + "/nEquipo: " +getEquipo();
           
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

   

    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the dorsal
     */
    public int getDorsal() {
        return dorsal;
    }

    /**
     * @param dorsal the dorsal to set
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    

  
    
    
    
}
