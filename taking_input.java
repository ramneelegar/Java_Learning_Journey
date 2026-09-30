import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int a=sc.nextInt();
        System.out.println("enter num2");
        int b=sc.nextInt();
        System.out.println("sum of a and b is =  " + (a+b));// this return 6 not 12
        System.out.println(a+b);

        System.out.println("enter short value");
        short s=sc.nextShort();
        System.out.println("enter float value");
        float f=sc.nextFloat();   
        
        System.out.println("int value is "+a);
        System.out.println("short value is "+s);
        System.out.println("float value is "+f);
        sc.close();
    }
}
