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
public class Equipo {

    private String nombre;
    private String estadio;
    private String localidad;
    private float presupuesto;
    private int golesFavor;
    private int golesContra;
    private String liga;

    public Equipo(String nombre, String estadio, String localidad, float presupuesto, int golesFavor, int golesContra, String liga) {
        this.nombre = nombre;
        this.estadio = estadio;
        this.localidad = localidad;
        this.presupuesto = presupuesto;
        this.golesFavor = golesFavor;
        this.golesContra = golesContra;
        this.liga = liga;
        System.out.println("Ejecuntado constructor Equipo");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + "\n Estadio: " + this.getEstadio() + "\n localidad: " + this.getLocalidad() + "\n Presupuesto: " + this.getPresupuesto() + "/nGoles a favor: " + getGolesFavor() + "/nGoles en contra: " + getGolesContra() + "/nLiga: " + getLiga();

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
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the presupuesto
     */
    public float getPresupuesto() {
        return presupuesto;
    }

    /**
     * @param presupuesto the presupuesto to set
     */
    public void setPresupuesto(float presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * @return the golesFavor
     */
    public int getGolesFavor() {
        return golesFavor;
    }

    /**
     * @param golesFavor the golesFavor to set
     */
    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    /**
     * @return the golesContra
     */
    public int getGolesContra() {
        return golesContra;
    }

    /**
     * @param golesContra the golesContra to set
     */
    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    /**
     * @return the liga
     */
    public String getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(String liga) {
        this.liga = liga;
    }

    /**
     * @return the estadio
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * @param estadio the estadio to set
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

}
