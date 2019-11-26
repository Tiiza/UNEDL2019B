package Otros;

import javax.swing.JOptionPane;

public class MetodoBiseccion {

    private double a1,b1,p1;
    private double a2,b2,p2;
    private double a3,b3,p3;
    private double a4,b4,p4;
    private double a5,b5,p5;
    private double a6,b6,p6;
    private double constante;
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private String s6;
    private double signoFuncion;
    private double pm,pm2,er;//punto medio
    private double ecuacionSup;
    private double ecuacionPM;
    private double ecuacionInf;
    private double intervaloSup;
    private double intervaloPM;
    private double intervaloInf;
    
    

    public void setMetodoBiseccion(double x1, double x2, double x3, double x4, double x5, double x6, double constante, double intervaloSup, double intervaloInf, double error, String s1, String s2, String s3, String s4, String s5, String s6) {
        this.constante = constante;
        this.intervaloSup = intervaloSup;
        this.intervaloInf = intervaloInf;
        a1 = x1 * intervaloSup;
        a2 = x2 * Math.pow(intervaloSup, 2);
        a3 = x3 * Math.pow(intervaloSup, 3);
        a4 = x4 * Math.pow(intervaloSup, 4);
        a5 = x5 * Math.pow(intervaloSup, 5);
        a6 = x6 * Math.pow(intervaloSup, 6);
        b1 = x1 * intervaloInf;
        b2 = x2 * Math.pow(intervaloInf, 2);//Haciendo la multiplicación de los coeficientes por los intervalos elevados a la potencia
        b3 = x3 * Math.pow(intervaloInf, 3);
        b4 = x4 * Math.pow(intervaloInf, 4);
        b5 = x5 * Math.pow(intervaloInf, 5);
        b6 = x6 * Math.pow(intervaloInf, 6);
        if(s6.equals("-"))b5 = b5 * (-1);//Comparando signo para volver negativo en coeficiente
        if(s5.equals("-"))b4 = b4 * (-1);
        if(s4.equals("-"))b3 = b3 * (-1);
        if(s3.equals("-"))b2 = b2 * (-1);
        if(s2.equals("-"))b1 = b1 * (-1);
        if(s6.equals("-"))a5 = a5 * (-1);
        if(s5.equals("-"))a4 = a4 * (-1);
        if(s4.equals("-"))a3 = a3 * (-1);
        if(s3.equals("-"))a2 = a2 * (-1);
        if(s2.equals("-"))a1 = a1 * (-1);
        if(s1.equals("-"))constante = constante * (-1);
        ecuacionSup = a6 + a5 + a4 + a3 + a2 + a1 + constante;
        ecuacionInf = b6 + b5 + b4 + b3 + b2 + b1 + constante;
        signoFuncion = ecuacionSup * ecuacionInf;
        if(signoFuncion < 0 ){
            pm = (intervaloSup + intervaloInf) /2;
            do{
            p1 = x1 * pm;
            p2 = x2 * Math.pow(pm,2);
            p3 = x3 * Math.pow(pm,3);
            p4 = x4 * Math.pow(pm,4);
            p5 = x5 * Math.pow(pm,5);
            p6 = x6 * Math.pow(pm,6);
            if(s6.equals("-"))p5 = p5 * (-1);
            if(s5.equals("-"))p4 = p4 * (-1);
            if(s4.equals("-"))p3 = p3 * (-1);
            if(s3.equals("-"))p2 = p2 * (-1);
            if(s2.equals("-"))p1 = p1 * (-1);
            ecuacionPM = p6 +p5 + p4 + p3 +p2 +p1 +constante;
            intervaloPM = pm;
            if (ecuacionSup* ecuacionPM < 0) {//lado izq
                 pm2 = (this.intervaloSup + this.intervaloPM)/2;
                this.intervaloInf = intervaloPM;
                ecuacionInf = ecuacionPM;
                intervaloPM = this.intervaloInf;
                ecuacionPM = ecuacionInf;
                
            }else if (ecuacionPM*ecuacionInf < 0){//lado der
                pm2 = (intervaloPM + this.intervaloInf)/2;
                this.intervaloSup = intervaloPM;
                ecuacionSup = ecuacionPM;
                intervaloPM = pm2;
                ecuacionPM = ecuacionSup;
            }
            er = ((pm2 - pm)/pm2)*100;
            if(er <0 )er = er * (-1);
            pm = pm2;
                System.out.println("");
                System.out.println("-----------------------------------------------");
            System.out.println("Error relativo: "+er);
                System.out.println("Punto medio: " + pm);
                System.out.println("-----------------------------------------------");
                System.out.println("");
            }while(er > error);
        }else if(signoFuncion == 0){
            JOptionPane.showMessageDialog(null,"¡FELICIDADES ENCONTRASTE LA RAÍZ!");
        }else{
            JOptionPane.showMessageDialog(null, "Probablemente no está en el intervalo. Prueba con otro intervalo");
        }
    }
    
}
