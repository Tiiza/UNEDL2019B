
package metodosnumericos;

import java.text.DecimalFormat;

public class MetodoBiseccion {
    private double intervaloA;
    private double intervaloB;
    private double constante;
    private double error;
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private double x5;
    private double x6;
    private double pm;
    private double funcionA;
    private double funcionB;
    private int contador;
    private double er;
    double funcionPM;
    private String decimal;
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private String s6;
    private int decimales;

    

    
    public MetodoBiseccion(){
        intervaloA = 0;
        intervaloB = 0;
        constante = 0;
        error = 0;
        x1 = 0;
        x2 = 0;
        x3 = 0;
        x4 = 0;
        x5 = 0;
        x6 = 0;
        decimales = 0;
        pm = 0;
        funcionA = 0;
        funcionB = 0;
        funcionPM = 0;
        contador = 0;
        er = 0;
        decimal = "#.";
        s1 = "";
        s2 = "";
        s3 = "";
        s4 = "";
        s5 = "";
        s6 = "";
    }
    
    public MetodoBiseccion(double intervaloSup, double intervaloInf,double con, double meee, double xx1, double xx2, double xx3, double xx4, double xx5, double xx6, int deci, String simbolo1, String simbolo2, String simbolo3, String simbolo4, String simbolo5, String simbolo6 ){
       intervaloA = intervaloSup;
       intervaloB = intervaloInf;
       constante = con;
       error = meee;
       x1 = xx1;
       x2 = xx2;
       x3 = xx3;
       x4 = xx4;
       x5 = xx5;
       x6 = xx6;
       decimales = deci;
       s1 = simbolo1;
       s2 = simbolo2;
       s3 = simbolo3;
       s4 = simbolo4;
       s5 = simbolo5;
       s6 = simbolo6;
       
    }
    
    public double getIntervaloA() {
        return intervaloA;
    }

    public void setIntervaloA(double intervaloA) {
        this.intervaloA = intervaloA;
    }

    public double getIntervaloB() {
        return intervaloB;
    }

    public void setIntervaloB(double intervaloB) {
        this.intervaloB = intervaloB;
    }

    public double getConstante() {
        return constante;
    }

    public void setConstante(double constante) {
        this.constante = constante;
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error = error;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getX5() {
        return x5;
    }

    public void setX5(double x5) {
        this.x5 = x5;
    }

    public double getX6() {
        return x6;
    }

    public void setX6(double x6) {
        this.x6 = x6;
    }

    public int getDecimales() {
        return decimales;
    }

    public void setDecimales(int decimales) {
        this.decimales = decimales;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public String getS5() {
        return s5;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public String getS6() {
        return s6;
    }

    public void setS6(String s6) {
        this.s6 = s6;
    }
    
    
    public void proceso(){
        
        Menor0();
        funciones();
        
        
    }
   
    
    public void funciones(){
        for (int i = 0; i < decimales; i++) {
                        decimal += "#";
                    }
        DecimalFormat deci = new DecimalFormat(decimal);
        
        if(funcionA+funcionPM == 0){
            if(funcionA == 0){
                System.out.println(" Felicidades F(a) = 0");
            }else{
                System.out.println(" Felicidades F(pm) = 0");
            }
        }else{
            if(funcionPM+funcionB == 0){
                if(funcionPM == 0){
                    System.out.println(" Felicidades F(pm) = 0");
                }else{
                    System.out.println("Felicidades F(b) = 0");
                }
            }else{
                if(funcionA+funcionPM < 0){
                    pm=(funcionPM+intervaloB)/2;
                    contador++;
                    System.out.println("--- "+ contador +"APROXIMACION ---");
                    System.out.println(deci.format(pm));
                    er = (pm - funcionPM) / pm;
                    er = er * 100;
                    funcionPM=ObtenerFuncion(pm);

                        System.out.print("Porcentaje de error: ");
                        System.out.println(deci.format((er)));

                        System.out.println("---------------------------------------------------------------");
                        while(er <= error){
                            funciones();
                        }
                        funciones();
                }else{
                    if(funcionB+funcionPM < 0){
                    pm=(funcionPM+intervaloA)/2;
                    contador++;
                    System.out.println("--- "+ contador +"APROXIMACION ---");
                    System.out.println(deci.format(pm));
                    er = (pm - funcionPM) / pm;
                    er = er * 100;
                    funcionPM=ObtenerFuncion(pm);

                        System.out.print("Porcentaje de error: ");
                        System.out.println(deci.format((er)));

                        System.out.println("---------------------------------------------------------------");
                        while(er <= error){
                            funciones();
                        }
                        funciones();
                }
            }
           
        }
        }
    }
    
    
    
    public double Menor0(){
        
        for (int i = 0; i < decimales; i++) {
                        decimal += "#";
                    }
        DecimalFormat deci = new DecimalFormat(decimal);
        
        
        funcionA=ObtenerFuncion(intervaloA);
        funcionB=ObtenerFuncion(intervaloB);
        
        if(funcionA+funcionB == 0){
            if(funcionA == 0){
                System.out.println("Felicidades F(a) = 0");

            }else{
                System.out.println("Felicidades F(b) = 0");
              
            }
        }else{
            if(funcionA+funcionB < 0){
                pm=(intervaloA+intervaloB)/2;
                contador++;
                System.out.println("--- "+ contador +"APROXIMACION ---");
                System.out.println(deci.format(pm));
                funcionPM=ObtenerFuncion(pm);
            }else{
                System.out.println("INGRESA DE NUEVO LOS INTERVALOS");
            }
            
        }      
   
        
        
        return pm;
    }
    
    public double ObtenerFuncion(double intervalo){
        for (int i = 0; i < decimales; i++) {
                        decimal += "#";
                    }
        DecimalFormat deci = new DecimalFormat(decimal);
        
        double fx=0;
        
        fx+=constante;
       if(s1 == "+"){
           fx+=x1*intervalo;
       }else if(s1 == "-"){
           fx-=x1*intervalo;
       }
       
       if(x2 == 0){
           return fx;
       }else if(s2 == "+"){
           fx+=(x2*Math.pow(intervalo, 2));
       }else if(s2 == "-"){
           fx-=(x2*Math.pow(intervalo, 2));
       }
       
       if(x3 == 0){
           return fx;
       }else if(s3 == "+"){
           fx+=(x3*Math.pow(intervalo, 3));
       }else if(s3 == "-"){
           fx-=(x3*Math.pow(intervalo, 3));
       }
       
       if(x4 == 0){
           return fx;
       }else if(s4 == "+"){
           fx+=(x4*Math.pow(intervalo, 4));
       }else if(s4 == "-"){
           fx-=(x4*Math.pow(intervalo, 4));
       }
       
       if(x5 == 0){
           return fx;
       }else if(s5 == "+"){
           fx+=(x5*Math.pow(intervalo, 5));
       }else if(s5 == "-"){
           fx-=(x5*Math.pow(intervalo, 5));
       }
       
       if(x6 == 0){
           return fx;
       }else if(s6 == "+"){
           fx+=(x6*Math.pow(intervalo, 6));
       }else if(s6 == "-"){
           fx-=(x6*Math.pow(intervalo, 6));
       }
        return fx;
    }
}
