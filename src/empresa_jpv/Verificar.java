/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa_jpv;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author Semipresencial
 */
public class Verificar {
    
   /**
    * comprobarTelefono: devolverá verdadero si el teléfono introducido por
    * parámetro contiene 9 números, falso en caso contrario.
    * @param dni
    * @return 
    */
    public static boolean comprobarTelefono (int telefono){
        
       
        
        String numero = String.valueOf(telefono);
        
        Pattern p = Pattern.compile("\\d{9}");
        Matcher m = p.matcher(numero);
                
        
        return m.matches();
    }
    
    
    
    
    
    public static boolean comprobarDni(String dni){
        
        
        
            Pattern p = Pattern.compile("\\d{8}[A-Z]{1}");
            Matcher m = p.matcher(dni);
           
          
        return m.matches();
    }
    

}
