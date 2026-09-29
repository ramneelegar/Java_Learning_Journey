public class eoperation {
    public static void main(String[] args) {

        int a = 25;
        int b = 15;
        int cc=+a;// not increase just indicate its positive value
        System.out.println(cc);  

        // arithmatic op
        int total = a + b;
        int remainder = a % 7;
        System.out.println("total "+total);
        System.out.println(remainder);

        // relational op
        System.out.println(a != b);
        System.out.println(a <= b);

        // logical op
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        // assignment op
        int z = 100;
        z += 20;  // z = z + 20
        z /= 4;   // z = z / 4
        z %= 30;  // z = z % 30
        System.out.println(z);
    }
}

