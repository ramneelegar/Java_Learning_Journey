public class unarybitwise_operater {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        int c=10;
        int d=10;
        
        // unary inc n decrement op
        int cc=+a;// not increase just indicate its positive value
        System.out.println("increase the value and print next   " + ++a);
        System.out.println("print first and increment nest  "+ b++);
        System.out.println("decrement the value and print next  "+ --c);
        System.out.println("decrement the value and print next  "+ d--);

        // bitwise op
        int x = 6;  // 00000110
        int y = 3;  // 00000011
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
        System.out.println(x << 1);
        System.out.println(x >> 1);
    }
}
