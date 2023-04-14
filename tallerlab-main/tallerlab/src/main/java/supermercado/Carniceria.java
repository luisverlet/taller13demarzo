
package supermercado;

public class Carniceria {
    private static int contador = 1;
    public int getNumero() {
        return numero;
    }
    private int numero;
    private int meat_amount;
    private int chicken_amount;
    private double price;

    public Carniceria(int meat_amount, int chicken_amount, double price) {
        this.meat_amount = meat_amount;
        this.chicken_amount = chicken_amount;
        this.price = price;
        this.numero = contador;
        contador++;
    }

    public Carniceria() {
    }

    public int getMeat_amount() {
        return meat_amount;
    }

    public int getChicken_amount() {
        return chicken_amount;
    }

    public double getPrice() {
        return price;
    }

    public void setMeat_amount(int meat_amount) {
        this.meat_amount = meat_amount;
    }

    public void setChicken_amount(int chicken_amount) {
        this.chicken_amount = chicken_amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carniceria[" + numero + "]Cantidad de carne=" + meat_amount + ", Cantidad de pollo=" + chicken_amount + ", precio total de los alimentos=" + price;
    }

    
}
