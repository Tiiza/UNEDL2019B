
package hackerrank;

import java.util.Scanner;

public class PVT6 {
    
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);
    int numero1 = 0;
    int numero2 = 0;
    float resultado = 0;
    int rep = 0;
    char iterador;   
    
    do{
    System.out.println(" --- Ingresa un numero --- ");
    numero1 = teclado.nextInt();
    
    System.out.println(" --- Ingresa otro numero --- ");
    numero2 = teclado.nextInt();
    
    System.out.println(" --- Ingresa el iterador --- ( +, -, *, /, <, >, =, &, |, !");
    iterador = teclado.next().charAt(0);
    
    switch(iterador){
        case '+':
            resultado = numero1 + numero2;
            System.out.println("Resultado: "+resultado);
            break;
        case '-':
            resultado = numero1 - numero2;
            System.out.println("Resultado: "+resultado);
            break;
        case '*':
            resultado = numero1 * numero2;
            System.out.println("Resultado: "+resultado);
            break;
        case '/':
            resultado = numero1 / numero2;
            System.out.println("Resultado: "+resultado);
            break;
        case '<':
            if( numero1 < numero2 ){
                System.out.println("El numero: "+numero1+" Es menor al numero: "+numero2);
            }else{
                System.out.println("El numero: "+numero1+" No es menor al numero: "+numero2 );
            }
            break;
        case '>':
            if( numero1 < numero2 ){
                System.out.println("El numero: "+numero1+" Es mayor al numero: "+numero2);
            }else{
                System.out.println("El numero: "+numero1+" No es mayor al numero: "+numero2 );
            }
            break;
        case '=':
            if( numero1 == numero2 ){
                System.out.println("El numero: "+numero1+" Es igual al numero: "+numero2);
            }else{
                System.out.println("El numero: "+numero1+" No es igual al numero: "+numero2 );
            }
            break;
        case '&':
            if( numero1 > 0 && numero2 > 0 ){
                System.out.println("El numero: "+numero1+" y el numero: "+numero2+" son mayores a 0");
            }else if ( numero1 < 0 && numero2 < 0 ){
                System.out.println("El numero: "+numero1+" y el numero: "+numero2+" son menor a 0");
            }else if ( numero1 < 0 && numero2 > 0 ){
                System.out.println("El numero: "+numero1+" es menor a 0 y el numero: "+numero2+" es mayor a 0");
            }else if ( numero1 > 0 && numero2 < 0 ){
                System.out.println("El numero: "+numero1+" es menor a 0 y el numero: "+numero2+" es mayor a 0");
            }
            break;
        case '!':
            if (numero1 != 5 ){
                System.out.println("El numero: "+numero1+" es diferente a 5");
            }
            break;
        case '|':
            if(numero1 > 5 || numero2 > 5 ){
                System.out.println("Alguno de los numeros es mayor al 5");
            }else{
                System.out.println("Ninguno de los numeros es mayor a 5");
            }
            break;
    }
        System.out.println("Otro ejemplo 1-. Si  2-. No");
        rep = teclado.nextInt();
    }while(rep==1);
    
    
   
    }
}
