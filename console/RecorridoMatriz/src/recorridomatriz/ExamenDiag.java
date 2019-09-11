
package recorridomatriz;

public class ExamenDiag {
    private  int matriz[][] = new int[4][4];
    private int numero=1;
    private int i=0, j=0;
    
    public void llenar(){
        matriz[0][0] = 1;
        matriz[0][1] = 4;
        matriz[0][2] = 2;
        matriz[0][3] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 7;
        matriz[1][2] = 6;
        matriz[1][3] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 9;
        matriz[2][2] = 8;
        matriz[2][3] = 5;
        matriz[3][0] = 7;
        matriz[3][1] = 7;
        matriz[3][2] = 0;
        matriz[3][3] = 2;
                
    }
    
    public void acomodar(){
        do{
        switch(numero){
            case 1:
                for(j=0;j<4;j++){
                    System.out.print(matriz[i][j]+", ");
                }
                numero++;
                break;
            case 2:
                i=1;
                for(j=3;j>=0;j--){
                    System.out.print(matriz[i][j]+", ");
                }
                numero++;
                break;
            case 3:
                i=2;
                for(j=0;j<4;j++){
                    System.out.print(matriz[i][j]+", ");
                }
                numero++;
                break;
            case 4:
                i=3;
                for(j=3;j>=0;j--){
                    System.out.print(matriz[i][j]+", ");
                }
                numero++;
                break;
        }
        }while(numero<5);
    }
    
    
    
    
    
    
    public static void main (String[] args){
        ExamenDiag ex = new ExamenDiag();
        ex.llenar();
        ex.acomodar();
    }
}
