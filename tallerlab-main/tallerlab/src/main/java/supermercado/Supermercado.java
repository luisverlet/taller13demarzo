
package supermercado;
import java.util.ArrayList;
import java.util.Scanner;

public class Supermercado {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        
            //Cliente
            
            System.out.println("Siguiente clase, Clientes");

            ArrayList<Cliente> clientes = new ArrayList<>();

            System.out.println("¿Cuántos clientes desea agregar?");
            int numClientes = scanner.nextInt();

            for (int i = 0; i < numClientes; i++) {
                System.out.println("Ingrese los datos del cliente " + (i+1) + ":");
                System.out.println("Nombre del cliente:");
                String name = scanner.next();
                System.out.println("Edad del cliente:");
                int age = scanner.nextInt();
                System.out.println("ID del cliente:");
                int ID = scanner.nextInt();
                System.out.println("Teléfono del cliente:");
                int phone = scanner.nextInt();
                System.out.println("Dinero del cliente:");
                double money = scanner.nextDouble();

                clientes.add(new Cliente(money, name, age, ID, phone));
            }
            
        //Carniceria
            
        System.out.println("Siguiente clase, Alimentos");

        ArrayList<Carniceria> alimentos = new ArrayList<>();

        System.out.println("¿Cuántos alimentos desea agregar?");
        int contal = scanner.nextInt();

        for (int i = 0; i < contal; i++) {
            System.out.println("Ingrese datos del alimento " + (i + 1) + ":");
            System.out.println("Cantidad de carne disponible: ");
            int meat_amount = scanner.nextInt();
            System.out.println("Cantidad de pollo disponible: ");
            int chicken_amount = scanner.nextInt();
            System.out.println("Precio total: ");
            double price = scanner.nextDouble();

            alimentos.add(new Carniceria(meat_amount, chicken_amount, price));
        }
        //limpieza
        System.out.println("Siguiente clase, Areas de limpieza");

        ArrayList<Limpieza> limpiezas = new ArrayList<>();

        System.out.println("¿Cuántas áreas de limpieza desea agregar?");
        int contli = scanner.nextInt();

        for (int i = 0; i < contli; i++) {
            System.out.println("Ingrese datos del área de limpieza " + (i + 1) + ":");
            System.out.println("Cantidad de productos de limpieza: ");
            int cleaning_products = scanner.nextInt();
            System.out.println("¿Hay servicio? (Responda con true para verdadero y false para falso)");
            boolean service = scanner.nextBoolean();
            System.out.println("ID del trabajador: ");
            int ID = scanner.nextInt();
            System.out.println("Cantidad de trabajadores: ");
            int workers = scanner.nextInt();

            limpiezas.add(new Limpieza(cleaning_products, service, ID, workers));
        }
        //trabajador
        
            System.out.println("Siguiente clase, Trabajadores");

        ArrayList<Trabajador> trabajadores = new ArrayList<>();

        System.out.println("¿Cuántos trabajadores desea agregar?");
        int contt = scanner.nextInt();

        for (int i = 0; i < contt; i++) {
            System.out.println("Ingrese datos del trabajador " + (i+1) + ":");
            System.out.println("Nombre del trabajador: ");
            String name = scanner.next();
            System.out.println("Sueldo: ");
            double salary = scanner.nextDouble();
            System.out.println("ID del trabajador: ");
            int ID = scanner.nextInt();
            System.out.println("Edad: ");
            int age = scanner.nextInt();
            System.out.println("Área de trabajo: ");
            String work_area = scanner.next();

            trabajadores.add(new Trabajador(name, salary, ID, age, work_area));
    }

//datos impresos

            System.out.println("Datos de Clientes");
            for (int q = 0; q < numClientes; q++) { 
                System.out.println(clientes.get(q).toString());
            }

            System.out.println("Datos de Carnicerias");
            for (int k = 0; k < contal; k++) { 
                System.out.println(alimentos.get(k).toString());
            }
            
            System.out.println("Datos de areas de limpieza");
            for (int i = 0; i < contli; i++) { 
                System.out.println(limpiezas.get(i).toString());
            }
  
            System.out.println("Datos de trabajadores");
            for (int j = 0; j < contt; j++) { 
                System.out.println(trabajadores.get(j).toString());
                
            }
 
    }
    
}
        

