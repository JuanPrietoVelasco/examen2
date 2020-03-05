/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_jpv;

import java.util.Scanner;

/**
 *
 * @author Semipresencial
 */
public class Lectura {

    static Scanner sc = new Scanner(System.in);
    static int valor;

    public static int leerInteger(String msg) {

        System.out.println(msg);
        boolean correcto = false;

        while (!correcto) {
            try {
                valor = Integer.parseInt(sc.nextLine());
                correcto = true;

            } catch (Exception e) {

                System.out.println("Introduzca un valor numérico.");
            }

        }
        return valor;
    }

    public static int leerInteger(String msg, int min, int max) {

        System.out.println(msg + " " + min + " y " + max);
        boolean correcto = false;

        while (!correcto) {

            int valor = Integer.parseInt(sc.nextLine());

            try {
                if (valor >= min && valor <= max) {

                    correcto = true;

                } else {
                    System.out.println("Introduzca un valor numérico entre " + min + " y " + max);
                }

            } catch (Exception e) {
            }

        }

        return valor;
    }

    public static String leerString(String msg) {

        System.out.println(msg);

        String cadena = sc.nextLine();

        return cadena;

    }

    public static String leerString(String msg, int longitud) {
        
        String cadena="";
        
        System.out.println(msg);
        
        int longCadena;

        boolean correcto = false;

        while (!correcto) {
            
            cadena = sc.nextLine();
            longCadena = cadena.length();
            
            if (longCadena <= longitud) {
                correcto = true;

            } else {
                System.out.println("El texto no puede tener más de " + longitud + " carecteres.");
            }

        }

        return cadena;
    }
}
