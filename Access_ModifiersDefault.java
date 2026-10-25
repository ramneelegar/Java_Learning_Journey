package access_modifiers;


class Student {
    int marks = 85;
}

public class Access_ModifiersDefault {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.marks);
    }
}
