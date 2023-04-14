
package supermercado;

public class Trabajador {
    private static int contador = 1;
    public int getNumero() {
        return numero;
    }
    private int numero;
    private String name;
    private double salary;
    private int ID;
    private int age;
    private String work_area;

    public Trabajador(String name, double salary, int ID, int age, String work_area) {
        this.name = name;
        this.salary = salary;
        this.ID = ID;
        this.age = age;
        this.work_area = work_area;
        this.numero = contador;
        contador++;
    }

    public Trabajador() {
    }
    

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public String getWork_area() {
        return work_area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWork_area(String work_area) {
        this.work_area = work_area;
    }

    @Override
    public String toString() {
        return "Trabajador[" + numero + "]nombre=" + name + ", sueldo=" + salary + ", ID=" + ID + ", edad=" + age + ", area de trabajo=" + work_area;
    }
    
    
    
}
