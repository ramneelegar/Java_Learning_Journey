import java.util.Scanner;

public class E_multiCatchBlock {
    public static void main(String[] args) {
        System.out.println("Connection is Estd");
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator:");
            int a = scan.nextInt();
            System.out.println("Enter the denominator:");
            int b = scan.nextInt();
            int c = a / b;
            System.out.println(c);

            System.out.println("Enter the size of the array:");
            int size = scan.nextInt();
            int[] ar = new int[size];

            System.out.println("Enter the element:");
            int ele = scan.nextInt();
            System.out.println("Enter the position to be stored in:");
            int index = scan.nextInt();

            ar[index] = ele;
            System.out.println("Stored element: " + ar[index]);
        }
    }
}

