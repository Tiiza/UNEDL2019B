
package hackerrank;

public class DiagonalDiference {

    public static int diagonalDifference(List<List<Integer>> arr) {
    
        int numero1=0;
        int numero2=0;
        int resultado=0;
        int x=0;
        int n=arr.size();
        int conejo=0;
        
        while(x<2){
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(x==0){
                        if(j == i){
                            numero1+=arr.get(i).get(j);
                        }
                    }else if(x==1){
                        if(conejo == j){
                            numero2+=arr.get(i).get(j);
                            conejo--;
                        }
                    }
                }
            }
            conejo=n-1;
            x++;
        }
        
       resultado=numero1-numero2;
       if(resultado<0){
           conejo=resultado;
           resultado-=conejo*2;
       }

        return resultado;

    }
   
    
}
