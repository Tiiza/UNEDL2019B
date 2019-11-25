
package examen;

public class Examen {
    
    public static void main(String[] args){
        
        Tapiz tapiz1 = new Tapiz(3.5);
        Habitacion habitacion1 = new Habitacion(2.75,4.0);
        Calculadora calculadora1 = new Calculadora(tapiz1, habitacion1);
        habitacion1.Area();
        tapiz1.Regresar_Costo();
        System.out.println("Costo total:" + calculadora1.Costo_Total());
        
        
    }
}
