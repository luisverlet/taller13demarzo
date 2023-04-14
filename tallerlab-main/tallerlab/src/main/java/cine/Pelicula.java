
package cine;

public class Pelicula {
    
    private static int contador = 1;
    private int numero;
    private int MDA;
    private String movie_name;
    private double price;
    private int movie_ID;
    
     public int getNumero() {
        return numero;
    }

    public Pelicula(int MDA, String movie_name, double price, int movie_ID) {
        this.MDA = MDA;
        this.movie_name = movie_name;
        this.price = price;
        this.movie_ID = movie_ID;
        this.numero = contador;
        contador++;
    }

    public Pelicula() {
    }

    public int getMDA() {
        return MDA;
    }

    public void setMDA(int MDA) {
        this.MDA = MDA;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMovie_ID() {
        return movie_ID;
    }

    public void setMovie_ID(int movie_ID) {
        this.movie_ID = movie_ID;
    }
    
    @Override
    public String toString() {
        return "Pelicula[" +numero+ "] Edad minima para entrar: " + MDA + ", Nombre de pelicula: " + movie_name + ", Precio de entrada: " + price + ", ID de pelicula: " + movie_ID;
    }
    
    
    
}
