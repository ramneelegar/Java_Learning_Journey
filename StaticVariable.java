
class Test {
    public static int y = 0;
}

public class StaticVariable {
    private static int x = 100;

    public static void main(String[] args) {
        Static s1 = new Static();
        s1.x++;

        Static s2 = new Static();
        s2.x++;

        s1 = new Static();
        s1.x++;

        Static.x++;
        System.out.println("Adding to 100, x = " + x);

        Test t1 = new Test();
        t1.y++;

        Test t2 = new Test();
        t2.y++;

        t1 = new Test();
        t1.y++;

        System.out.print("Adding to 0, ");
        System.out.println("y = " + t1.y + ", " + t2.y + ", " + (t1.y + t2.y));

    }
}
