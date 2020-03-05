/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_jpv;

import empresa_jpv.Enumerados.Categoria;
import empresa_jpv.Empleado;
import java.lang.reflect.Array;
import java.util.Scanner;
/**
 * Clase Directivo: hereda de Empleado, un directivo puede tener a su cargo
 * varios empleados (entre 0 a 5). El directivo tendrá una categoría tipo
 * enumerado llamado Categoria. calcularSalarioNeto: a parte de la retención del
 * 17%, se le aplicará un complemento según la categoría: * Director: 900 euros
 *
 * Jefe de recursos humanos: 500 euros
 *
 * Gerente: 350 euros
 *
 * @author Semipresencial
 */
public class Directivo extends Empleado {

    Categoria categoria;

    Empleado[] subordinados = new Empleado[5];

    double sueldo;

    public Directivo(String nombre, String apellidos, String dni, int edad, double sueldoBruto, Categoria categoria) {
        super(nombre, apellidos, dni, edad, sueldoBruto);
        this.categoria = categoria;
    }

    protected double calcularSalarioNeto() {
        int retencion = 17;
        double sueldo = sueldoBruto / 0.17;

        if (categoria == categoria.values()[0]) {

            sueldo = sueldo + 900;

        }

        if (categoria == categoria.values()[1]) {

            sueldo = sueldo + 500;

        }

        if (categoria == categoria.values()[2]) {

            sueldo = sueldo + 350;

        }

        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "\t\tCategoría: " + this.categoria;
    }

    public void listarSubordinados() {

        for (int i = 0; i < subordinados.length; i++) {

            if (subordinados[i] != null) {
                subordinados.toString();
            }
        }

    }

    public void altaSubordinado(Empleado empleado) {
        
        Scanner sc = new Scanner (System.in);
        //Con la variable pos controlamos si se lee todo el array y está lleno.
        int pos = -1;
        
        //variable para trabajar con el dni del empleado
        String dni;
        
        

        for (int i = 0; i < subordinados.length; i++) {

            if (subordinados[i] == null) {

                pos = i;
                
                

            }

        }

        if (pos == -1) {
            System.out.println("No puede tener más subordinados.");
        }

    }

}
