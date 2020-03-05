/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_jpv;

/**Clase Persona: se trata de una clase abstracta que contiene los datos básicos
 * de una persona: nombre, apellidos, dni y edad. Aunque en el diagrama no aparezca se debe realizar los get y set.
 *
 * @author Semipresencial
 */
public abstract class Persona {
    private String nombre;
    private String apellidos;
    private String dni;
    private int edad;
    
 
    
    public Persona(String nombre, String apellidos, String dni, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.edad = edad;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\t\tApellidos: " + this.apellidos + "\t\tDNI: " + this.dni + "\t\tEdad: " + this.edad; 
    }
    
    
    
    
}
