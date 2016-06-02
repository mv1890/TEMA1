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
public class Usuarios {
    
    
    private String usuario;
    private String contraseña;
  //  private String cargo;
    
    public Usuarios(String usuario, String contraseña){
        this.usuario = usuario;
        this.contraseña = contraseña;
   //     this.cargo = cargo;
    }
    
    @Override
    public String toString() {
        return "Usuario: " + this.getUsuario() + "\n Contraseña: " + this.getContraseña();
           
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return the cargo
     */
 /*   public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
/*    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
*/
    
    
    
}
    

