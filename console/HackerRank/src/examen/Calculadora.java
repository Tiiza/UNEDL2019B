
package examen;

public class Calculadora {
    
    Habitacion habitacion1 = new Habitacion();
    Tapiz tapiz1 = new Tapiz();
    
    private double totalCost = 0;
    

    Calculadora(){
        
    }
    
    public Calculadora(float totalCost){
        this.totalCost = totalCost;
    }

    Calculadora(Tapiz tapiz1, Habitacion habitacion1) {
       
    }

    
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    
    
    public void Costo_Total(){
        System.out.print("Total: ");
        System.out.println(totalCost = habitacion1.getArea()*tapiz1.getCost());  
//        totalCost = habitacion1.getArea()*tapiz1.getCosto();
    }
}
