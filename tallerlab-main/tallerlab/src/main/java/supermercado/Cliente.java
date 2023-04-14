
package supermercado;


public class Cliente {
    private static int contador = 1;
    public int getNumero() {
        return numero;
    }
    private double money;
    private String name;
    private int age, numero;
    private int ID;
    private int phone;

    public Cliente(double money, String name, int age, int ID, int phone) {
        this.money = money;
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.phone = phone;
        this.numero = contador;
        contador++;
    }

    public Cliente() {
    }
    

    public double getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return ID;
    }

    public int getPhone() {
        return phone;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Cliente[" + numero + "]Dinero=" + money + ", Nombre=" + name + ", Edad=" + age + ", ID=" + ID + ", Telefono=" + phone;
    }
    
    
}
