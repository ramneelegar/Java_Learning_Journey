class Employee {
    int id;
    String name;
    double salary;

    Employee() {
        this(101, "Ram", 50000);
    }

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

}

public class Constructor{
    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.display();

        Employee e2 = new Employee(102, "Kiran", 30000);
        e2.display();
    }
}
