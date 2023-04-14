
package cine;

public class Limpieza {
    private static int contador = 1;
    private int numero;
    private int cleaning_products;
    private boolean service;
    private int ID;
    private int workers;
    
    public int getNumero() {
        return numero;
    }

    public Limpieza(int cleaning_products, boolean service, int ID, int workers) {
        this.cleaning_products = cleaning_products;
        this.service = service;
        this.ID = ID;
        this.workers = workers;
        this.numero = contador;
        contador++;
    }

    @Override
    public String toString() {
        return "Espectador[" +numero+ "], Cantidad de productos de limpieza: " + cleaning_products + ", Servicio disponible? " + service + ", ID de trabajador: " + ID + ", Cantidad de trabajadores" + workers;
    }

    public Limpieza() {
    }

    public int getCleaning_products() {
        return cleaning_products;
    }

    public void setCleaning_products(int cleaning_products) {
        this.cleaning_products = cleaning_products;
    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getWorkers() {
        return workers;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }
    
    
    
}
