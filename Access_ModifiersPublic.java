class Student {
    public String name = "Rahul";

    public void display() {
        System.out.println(name);
    }
}

public class Access_ModifiersPublic {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        System.out.println(s.name);
    }
}
