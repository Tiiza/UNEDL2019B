
package examen;

public class Calculadora {
    
    
    private double totalCost = 0;
    

    Calculadora(){
        
    }
    
    public Calculadora(float totalCost){
        this.totalCost = totalCost;
    }

    Calculadora(Tapiz tapiz1, Habitacion habitacion1) {
       totalCost = habitacion1.Area()*tapiz1.Regresar_Costo();
    }

    
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    
    
    public double Costo_Total(){
        return totalCost;
//        totalCost = habitacion1.getArea()*tapiz1.getCosto();
    }
}
