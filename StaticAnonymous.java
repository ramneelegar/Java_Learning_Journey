// anonymous obj
class Person {
    private String name;
    private static int age;
    static {
        // name = "John";   here u get error because static block can;t access instance variable
    }

    Person() {
        age = 20;
    }

    public int getAge() {
        return age;
    }
}

public class StaticAnonymous {
    public static void main(String[] args) {
        System.out.println(new Person().getAge());  // anonymous object
        // when we nned crete an object and use it only once...
    }
}
