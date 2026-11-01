class Student {
    int id;
    String name;

    Student() {
        id = 101;
        name = "Ram";
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id);
        System.out.println(name);
    }
}


public class Constructor2 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        System.out.println();

        Student s2 = new Student(102, "Rahul");
        s2.display();
    }
}
