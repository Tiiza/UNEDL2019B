
package metodosnumericos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ObtenciodeRaicesCuadradasporMetodosIterativos {

    private Scanner teclado=new Scanner(System.in);
    private DecimalFormat decimas;
    
    
    private int numeroAproximaciones=0;
    private int numeroUsuario=0;
    private float errorP=0;
    private int decimales=0;
    private float aproximadoNumero=0;
    private int numeroBase=1;
    private int numeroExponente=2;
    private double cinco=0.5;
    private String decimal="#.";

    public ObtenciodeRaicesCuadradasporMetodosIterativos() {
        this.decimas = new DecimalFormat(decimal);
    }
            
   
    
    public float raiz(int numero){
        
        do{
         aproximadoNumero = (int) Math.pow(numeroBase,numeroExponente );
         numeroBase++;
        }while(aproximadoNumero<=numero);
        numeroBase=numeroBase-2;
        
        numeroAproximaciones+=1;
        return numeroBase;
    }
    
    public void proceso(){
        do{
            
           aproximadoNumero = (numeroBase + numeroUsuario / numeroBase);
            
            
        }while(errorP==3);
        
    }
    
    public void datos(){
        
        System.out.println("[ --- NUMERO QUE SE OBTIENE RAIZ --- ]");
        numeroUsuario = teclado.nextInt();
        
        System.out.println("[ --- PORCENTAJE DE ERROR --- ]");
        errorP = teclado.nextFloat();
        
        System.out.println("[ --- NUMERO DE DECIMALES --- ]");
        decimales = teclado.nextInt();
        for(int i=0;i<decimales;i++){
            decimal+="0";
        }
        
        System.out.println(decimas.format(raiz(numeroUsuario)));
        
    }
   
    public static void main(String[] args) {
        ObtenciodeRaicesCuadradasporMetodosIterativos oc = new ObtenciodeRaicesCuadradasporMetodosIterativos();
        
        oc.datos();
        
        
    }
    
}
