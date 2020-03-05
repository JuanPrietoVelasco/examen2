/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_jpv;

/**
 *
 * @author Semipresencial
 */
public class Cliente extends Persona{
    
    private String nombreEmpresa;
    private String telefono;
    
    
    public Cliente(String nombre, String apellidos, String dni, int edad, String nombreEmpresa, String telefono) {
        super(nombre, apellidos, dni, edad);
        this.nombreEmpresa = nombreEmpresa;
        this.telefono = telefono;       
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tEmpresa: " + this.nombreEmpresa + "\t\tTeléfono: " + this.telefono; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
