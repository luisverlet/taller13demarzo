
package cine;

public class Espectador {
    
    
    
    private static int contador = 1;
    private int numero;
    private double money;
    private int age;
    private String name;
    private String movie;
    
    public int getNumero() {
        return numero;
    }

    public Espectador(double money, int age, String name, String movie) {
        this.money = money;
        this.age = age;
        this.name = name;
        this.movie = movie;
        this.numero = contador;
        contador++;
    }

    public Espectador() {
    }

    public double getMoney() {
        return money;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    

    @Override
    public String toString() {
        return "Espectador[" +numero+ "] Dinero disponible: " + money + ", Edad: " + age + ", Nombre: " + name + ", Pelicula a ver: " + movie + '}';
    }
    
    
    
}
