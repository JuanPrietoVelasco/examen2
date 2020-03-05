/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_jpv;

/**
 * Clase Empleado: hereda de Persona y contiene el sueldo bruto (el salario
 * bruto será de 1250.49 euros). calcularSalarioNeto: este método calculará el
 * salario neto, que se le aplicará una retención del 17%.
 *
 * @author Semipresencial
 */
public class Empleado extends Persona {

    protected double sueldoBruto = 1250.49;

    public Empleado(String nombre, String apellidos, String dni, int edad, double sueldoBruto) {
        super(nombre, apellidos, dni, edad);
        this.sueldoBruto = sueldoBruto;
    }

    protected double calcularSalarioNeto() {

        int retencion = 17;
        double sueldo = sueldoBruto / 0.17;

        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tSueldo Bruto: " + this.sueldoBruto;
    }

    
    
}
