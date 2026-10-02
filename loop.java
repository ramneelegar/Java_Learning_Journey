import java.util.Scanner;

public class loop{
    public static void main(String[] args) {
        // for(int i=2; i<=10; i=i+2){
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();
        int i=n;
        for(i=n; i>=0 ; i--){
            System.out.println(i);

        }

        // even num from 1 to n
        System.out.print("enter m  ");
        int m = sc.nextInt();
        for(int j=2; j<=m; j++){
            if(j%2 ==0){
                 System.out.println(j);
            }
        }
    }
}
