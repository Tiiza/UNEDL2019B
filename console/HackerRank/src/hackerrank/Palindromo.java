
package hackerrank;

import java.util.Scanner;

public class Palindromo {
    
    Scanner teclado = new Scanner(System.in);
    
     private String palabra = "";
     private int numero = 0;
     String palabras = palabra.replace(" ", "");
    
    public boolean palindromo(){
       numero = palabras.length();
        
        for( int i = 0; i < palabras.length(); i++ ){
        
            if(palabras.charAt(i) != palabras.charAt(numero-1)){
                return false;
            }
            numero--;
        }
        
        return true;
    }
     
    public void ingresar(){
        System.out.println(" --- Ingresa la plabra ---");
        palabra = teclado.next();
        
        palindromo();
        
        if(palindromo()==false){
            System.out.println("No es un palindromo ");
        }else{
            System.out.println("Es palindromo ");
        }
    }
    
    
    public static void main(String[] args){
        
        Palindromo pal = new Palindromo();
        
        pal.ingresar();
        
    }
    
}
