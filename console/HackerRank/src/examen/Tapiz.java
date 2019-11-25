
package examen;

public class Tapiz {
    
    
    private double cost = 0;
    

    
//    public Tapiz(float costoxMetro, float costo){
//        this.costoxMetro = costoxMetro;
//    }

    Tapiz(double cost) {
       this.cost = cost;
    }

    Tapiz() {
       
    }

    public double getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    
    
    public double Regresar_Costo(){
        return cost;
    }
}
