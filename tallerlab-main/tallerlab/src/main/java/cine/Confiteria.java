
package cine;

public class Confiteria {
    
    private static int contador = 1;

    public int getNumero() {
        return numero;
    }
    
    private int product_ammount, numero;
    private int workers;
    private String area;
    private boolean popcorn;

    public Confiteria(int product_ammount, int workers, String area, boolean popcorn) {
        
        this.product_ammount = product_ammount;
        this.workers = workers;
        this.area = area;
        this.popcorn = popcorn;
        this.numero = contador;
        contador++;
    }

    public Confiteria() { 
    }

    public int getProduct_ammount() {
        return product_ammount;
    }

    public int getWorkers() {
        return workers;
    }

    public String getArea() {
        return area;
    }

    public boolean isPopcorn() {
        return popcorn;
    }

    public void setProduct_ammount(int product_ammount) {
        this.product_ammount = product_ammount;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPopcorn(boolean popcorn) {
        this.popcorn = popcorn;
    }
    
    @Override
    public String toString(){
        return "Confiteria [" + numero + "] Productos en tienda: " + this.product_ammount + ", Trabajadores: " + this.workers + ", Ubicacion: " + this.area + ", Crispetas disponibles: " + this.popcorn;
    }
    
    
    
    
    
}
