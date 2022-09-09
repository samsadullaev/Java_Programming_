package day39_inheritance;

public class Employee extends Person {
    public static void main(String[] args) {

        System.out.println();
    }
    double salary;

     public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
}
