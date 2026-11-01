class Student {
    int id;
    String name;

    Student() {
        id = 101;
        name = "Ram";
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
