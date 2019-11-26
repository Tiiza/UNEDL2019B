package metodosnumericos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrimeraActividad {

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);

        int numeroAproximaciones = 0;
        double numeroUsuario = 0;
        double errorP = 0;
        int decimales = 0;
        double aproximadoNumero = 0;
        int numeroBase = 1;
        int numeroExponente = 2;
        double er = 0;
        double numeroCiclo=0;
        String decimal = "#.";

        do{
        System.out.println("[ --- NUMERO QUE SE OBTIENE RAIZ --- ]");
        numeroUsuario = teclado.nextInt();
        }while(numeroUsuario < 0 );
        
        System.out.println("[ --- PORCENTAJE DE ERROR --- ]");
        errorP = teclado.nextFloat();

        System.out.println("[ --- NUMERO DE DECIMALES --- ]");
        decimales = teclado.nextInt();

        for (int i = 0; i < decimales; i++) {
            decimal += "#";
        }

        DecimalFormat decimas = new DecimalFormat(decimal);

        do {
            aproximadoNumero = (int) Math.pow(numeroBase, numeroExponente);

            numeroBase++;
        } while (aproximadoNumero <= numeroUsuario);
        numeroBase = numeroBase - 2;
        
        System.out.println(" -----------------------------NUMERO BASE "+numeroBase);

        if (numeroBase*numeroBase == numeroUsuario) {
            System.out.print("La raiz es: ");
            System.out.println(decimas.format((numeroBase)));
        
//        numeroAproximaciones+=;
        } else {
            
            aproximadoNumero = (0.5 * (numeroBase + numeroUsuario / numeroBase));
            

            numeroCiclo=aproximadoNumero;
            
            numeroAproximaciones++;
            
            System.out.println("--------------------------------------------------");
            System.out.print("Iteracion N°" + numeroAproximaciones + ": ");
            System.out.println(decimas.format((aproximadoNumero)));

                er = (aproximadoNumero - numeroBase) / aproximadoNumero;
                er = er * 100;

                System.out.print("Porcentaje de error: ");
                System.out.println(decimas.format((er)));
                
                System.out.println("---------------------------------------------------------------");

            while (errorP <= er) {

                aproximadoNumero =  (0.5 * (aproximadoNumero + numeroUsuario / aproximadoNumero));
                
                numeroAproximaciones++;
            
            System.out.print("Iteracion N°" + numeroAproximaciones + ": ");
             System.out.println(decimas.format((aproximadoNumero)));

                er = (aproximadoNumero - numeroCiclo) / aproximadoNumero;
                er = er * 100;

                System.out.print("Porcentaje de error: ");
                 System.out.println(decimas.format((er)));
                 
                numeroCiclo=aproximadoNumero;
                 System.out.println("------------------------------------------------------------------");
                 
                 if(numeroAproximaciones == 10){
                     System.out.println("TIENDE A INFINITO ");
                     break;
                 }
            }
            
            aproximadoNumero =  (0.5 * (aproximadoNumero + numeroUsuario / aproximadoNumero));
                
                numeroAproximaciones++;
            
            System.out.print("Iteracion N°" + numeroAproximaciones + ": ");
             System.out.println(decimas.format((aproximadoNumero)));

                er = (aproximadoNumero - numeroCiclo) / aproximadoNumero;
                er = er * 100;

                System.out.print("Porcentaje de error: ");
                 System.out.println(decimas.format((er)));
                 
                numeroCiclo=aproximadoNumero;
                 System.out.println("------------------------------------------------------------------");
              
            System.out.print("Numero de interaciones: ");
            System.out.println(numeroAproximaciones);
            System.out.print("La raiz es: ");
            System.out.println(decimas.format((aproximadoNumero)));
        }
    }

}
