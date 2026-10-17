
abstract class Bird {
    abstract void eat();
    abstract void fly();
}

abstract class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle flies at great heights");
    }
}

class SerpentEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("Serpent Eagle hunts over mountains and eats");
    }
}

class GoldenEagle extends Eagle {
    @Override
    void eat() {
        System.out.println("Golden Eagle hunts over oceans and eats");
    }
}

public class AbstractBird {
    public static void main(String[] args) {
        Bird serpent = new SerpentEagle();
        serpent.eat();
        serpent.fly();

        Bird golden = new GoldenEagle();
        golden.eat();
        golden.fly();
    }
}
