/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_jpv;

import static empresa_jpv.Verificar.*;
import java.util.Scanner;

/**
 *
 * @author Semipresencial
 */
public class Empresa_JPV {

    static Empleado[] empleados = new Empleado[25];

    static Cliente[] clientes = new Cliente[30];

    public static void AniadirCliente() {

        int pos = -1;
        String dni;
        String nombre, apellidos;

        //Buscar posición vacía
        for (int i = 0; i < clientes.length; i++) {

            if (clientes[i] == null) {

                pos = i;
                break;
            }

        }

        if (pos == -1) {
            System.out.println("No hay espacio para más clientes");
        } else {

            System.out.println("Introduzca DNI: ");
            dni = Lectura.leerString("Introduzca DNI del cliente.", 9);

            if (comprobarDni(dni)) {

                boolean encontrado = false;

                for (int i = 0; i < clientes.length && !encontrado; i++) {

                    if (clientes[i] != null && clientes[i].getDni().equalsIgnoreCase(dni)) {

                        encontrado = true;

                    }

                }

                if (encontrado) {
                    System.out.println("El cliente con dni " + dni + " ya existe.");
                } else {

                }

            } else {
                System.out.println("Dni incorrecto.");
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Directivo cliente = new Directivo("Juan", "Prieto", "71889272N", 37,1250.49,Enumerados.Categoria.GERENTE);
//        
//        System.out.println(cliente.toString());
        // Lectura.leerInteger("escribe numero");
        //System.out.println(Lectura.leerInteger("Introduce un valor entre ",3,10));
        //Lectura.leerString("texto", 5);
        Scanner sc = new Scanner(System.in);

        System.out.println("Haga una eleccion: \n1.Añadir cliente.\n2.Eliminar cliente.\n3.Listar clientes.");

        int seleccion = sc.nextInt();

        switch (seleccion) {

            case 1:

                AniadirCliente();

            case 2:

            // BorrarCliente();
            case 3:

            // ListarClientes();
        }

    }

}
