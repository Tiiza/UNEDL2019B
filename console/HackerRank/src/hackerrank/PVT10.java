
package hackerrank;

public class PVT10 {
    
    public static void main(String args[]){
        
        int [][] grupos = new int [8][];
        int calificaciones = 0;
        int contador = 0;
        int alumno = 0;
        
        grupos[0] = new int [30];
        
        grupos[1] = new int [27];
        
        grupos[2] = new int [24];
        
        grupos[3] = new int [19];
        
        grupos[4] = new int [14];
        
        grupos[5] = new int [14];
        
        grupos[6] = new int [14];
        
        grupos[7] = new int [14];
        
        
        for( int i = 0; i < grupos.length; i++ ){
            for( int j = 0; j < grupos[i].length; j++ ){
                
                calificaciones = (int) (Math.random()*(10-6+1)+6);
                grupos[i][j] = calificaciones;
            }
        }
        
        for( int i = 0; i < grupos.length; i++ ){
            contador++;
            System.out.println("\n"+contador+"° SEMESTRE");
            for( int j = 0; j < grupos[i].length; j++ ){
                alumno++;
                System.out.print(" Alumno "+alumno+" Calificacion: "+grupos[i][j]+"  ");
            }
            alumno = 0;
        }
    }
    
}
