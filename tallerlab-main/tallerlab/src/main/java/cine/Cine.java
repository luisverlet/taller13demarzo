
package cine;

import java.util.ArrayList;
import java.util.Scanner;


public class Cine {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        
            //pelicula
            
            System.out.println("Primera clase, Peliculas");
        
            ArrayList<Pelicula>  peliculas = new ArrayList<>();
        
            System.out.println("Cuantas peliculas desea agregar?");
            int contpe = scanner.nextInt();
        
            for (int i = 0; i < contpe; i++) {
            System.out.println("Ingrese datos la pelicula "+ (i+1) + ":");
            System.out.println("Edad minima para ver: ");
            int MDA = scanner.nextInt();
            System.out.println("Nombre de la pelicula: ");
            String movie_name = scanner.next();
            System.out.println("Precio de la entrada: ");
            double price = scanner.nextDouble();
            System.out.println("ID de la pelicula: ");
            int movie_ID = scanner.nextInt();
            
            
            peliculas.add(new Pelicula(MDA,movie_name,price,movie_ID));
            }
            
        //confiterias
            
        System.out.println("Siguiente clase, Confiterias: ");
        
        ArrayList<Confiteria>  confiterias = new ArrayList<>();
        
        
        System.out.println("Bienvenido, cuantas confiterias desea agregar?");
        int contag = scanner.nextInt();
        
        for (int i = 0; i < contag; i++) {
            System.out.println("Ingrese datos de la confiteria "+ (i+1) + ":");
            System.out.println("Cantidad de productos: ");
            int product_ammount = scanner.nextInt();
            System.out.println("Trabajadores: ");
            int workers = scanner.nextInt();
            System.out.println("Area en que se ubica(Sin espacios, usar _ ): ");
            String area = scanner.next();
            System.out.println("Hay palomitas? (Responda con true para verdadero y false para falso) ");
            boolean popcorn = scanner.nextBoolean();
            
            
            confiterias.add(new Confiteria(product_ammount,workers,area,popcorn));
            }
        
        System.out.println("Siguiente clase, Espectadores");
        
        ArrayList<Espectador>  espectadores = new ArrayList<>();
        
        System.out.println("cuantos espectadores  desea agregar?");
        int contes = scanner.nextInt();
        
        for (int i = 0; i < contes; i++) {
            System.out.println("Ingrese datos del espectador "+ (i+1) + ":");
            System.out.println("Dinero disponible: ");
            double money = scanner.nextDouble();
            System.out.println("Edad: ");
            int age = scanner.nextInt();
            System.out.println("Nombre del espectador(Sin espacios, usar _ ): ");
            String name = scanner.next();
            System.out.println("Que pelicula va a ver? ");
            String movie = scanner.next();
            
            
            espectadores.add(new Espectador(money,age,name,movie));
            }
        //limpieza
        
            System.out.println("Siguiente clase, Areas de limpieza");
        
            ArrayList<Limpieza>  limpiezas = new ArrayList<>();
        
            System.out.println("cuantas areas de limpieza desea agregar?");
            int contli = scanner.nextInt();
        
            for (int i = 0; i < contli; i++) {
            System.out.println("Ingrese datos del area de limpieza "+ (i+1) + ":");
            System.out.println("Cantidad de productos de limpieza: ");
            int cleaning_products = scanner.nextInt();
            System.out.println("Hay servicio? (Responda con true para verdadero y false para falso)");
            boolean service = scanner.nextBoolean();
            System.out.println("ID del trabajador: ");
            int ID = scanner.nextInt();
            System.out.println("Cantidad de trabajadores: ");
            int workers = scanner.nextInt();
            
            
            limpiezas.add(new Limpieza(cleaning_products,service,ID,workers));
            }
            
            //sala
            System.out.println("Siguiente clase, Salas de cine");

        ArrayList<Sala> salas = new ArrayList<>();

        System.out.println("¿Cuántas salas de cine desea agregar?");
        int contsa = scanner.nextInt();

        for (int i = 0; i < contsa; i++) {
            System.out.println("Ingrese datos de la sala de cine " + (i + 1) + ":");
            System.out.println("Nombre de la sala: ");
            String cinema_room = scanner.next();
            System.out.println("Capacidad de la sala: ");
            int capacity = scanner.nextInt();
            System.out.println("¿Hay película en reproducción? (Responda con true para verdadero y false para falso)");
            boolean screen_movie = scanner.nextBoolean();
            System.out.println("ID de la sala: ");
            int ID = scanner.nextInt();

    salas.add(new Sala(ID, cinema_room, capacity, screen_movie));
}

//datos impresos

            System.out.println("Datos de salas");
            for (int q = 0; q < contsa; q++) { 
                System.out.println(salas.get(q).toString());
            }

            System.out.println("Datos de peliculas");
            for (int k = 0; k < contpe; k++) { 
                System.out.println(peliculas.get(k).toString());
            }
            
            System.out.println("Datos de espectadores");
            for (int i = 0; i < contes; i++) { 
                System.out.println(espectadores.get(i).toString());
            }
  
            System.out.println("Datos de confiterias");
            for (int j = 0; j < contag; j++) { 
                System.out.println(confiterias.get(j).toString());
                
            }
                        
            System.out.println("Datos de areas de limpieza");
            for (int h = 0; h < contli; h++) { 
                System.out.println(limpiezas.get(h).toString());
            }
            
            
            
       
        
    }
    
}
