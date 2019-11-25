
package examen;

public class Habitacion {
     
    private double ancho = 0;
    private double largo = 0;
    private double area = 0;
    
//    public Habitacion (float ancho, float largo){
//      this.ancho = ancho;
//      this.largo = largo;
//      this.area = area;
//    }

    Habitacion(double ancho, double largo) {
      this.ancho = ancho;
      this.largo = largo;   
    }

    Habitacion() {
        
    }

    public double getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }
    
    public double Area(){
        System.out.println("Ancho "+ancho +" Largo "+largo);
        area = ancho * largo;
        System.out.println("Area "+area);
        return area;
        
    }
}
