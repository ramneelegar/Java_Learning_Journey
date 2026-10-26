package access_modifiers;


class Animal {
    protected void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void display() {
        sound();
    }
}

public class Access_ModifiersProtected{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
