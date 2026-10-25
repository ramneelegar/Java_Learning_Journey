package access_modifiers;


class Student {
    private int marks = 90;

    public void display() {
        System.out.println(marks);
    }
}

public class Access_ModifiersPrivate {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();

        // System.out.println(s.marks); // Errorprivate access
    }
}
