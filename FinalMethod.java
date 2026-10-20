class Parent {
    final void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    // Cannot override a final method
    // void display() {
    //     System.out.println("Child class method");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {

        Child c = new Child();
        c.display();
    }
}
