
package metodosnumericos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Metodo_biseccion {
    
    private Scanner teclado=new Scanner(System.in);
    private DecimalFormat decimas;
    
    private int tamañoEcuacion = 0;
    private int intervalo1 = 0;
    private int intervalo2 = 0;
    private int numeroAproximaciones=0;
    private float errorP=0;
    private int decimales=0;
    private float aproximadoNumero=0;
    private int numeroBase=1;
    private int numeroExponente=2;
    private double cinco=0.5;
    private String decimal="#.";
    
    public Metodo_biseccion() {
        this.decimas = new DecimalFormat(decimal);
    }
    
    public void datos(){
        
        System.out.println("[ --- INGRESA EL TAMAÑO DE LA ECUACION --- ]");
        tamañoEcuacion = teclado.nextInt();
        System.out.println("[ --- INGRESA EL INTERVALO A --- ]");
        intervalo1 = teclado.nextInt();
        System.out.println("[ --- INGRESA EL INTEVALO B --- ]");
        intervalo2 = teclado.nextInt();
        System.out.println("[ --- INGRESA EL PORCENTAJE DE ERROR --- ]");
        errorP = teclado.nextFloat();
        System.out.println("[ --- NUMERO DE DECIMALES --- ]");
        decimales = teclado.nextInt();
//        for(int i=0;i<decimales;i++){
//            decimal+="0";
//        }
//        
//        System.out.println(decimas.format(raiz(numeroUsuario)));
//        
    }
    
    
    public static void main(String[] args){
        
       
    }
    
}
