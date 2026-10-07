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

        // fac of n
        int a=sc.nextInt();
        int fact = 1;
        for(int k=1;k<=a;k++){
            fact = fact * k;
            
        }System.out.println(fact);

         //checking prime num
        int p=sc.nextInt();  // not divisible only still its half not more then it
        for(int l=2; l<=p/2; l++){
            if(p % l == 0){
                System.out.println("not prime");
                break;
            }else{
                System.out.println(" prime");
                break;
            }
        }

        
        // nested loop
        for(int c=1; c<=3; c++){  // row
            for(int d=1; d<=3; d++){  //colunm
                System.out.print("* ");
            }
            System.out.println();
        }

        for( i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.print("i="+i+ ", j="+j +" ");
            }System.out.println();
        }System.out.println();
        sc.close();

        // while loop
        int n =sc.nextInt();
        // int i=1;
        while( i<=5){
            System.out.println("jai shree ram");
            i++;
        }

        do{
            System.out.println(i);
            i++;
        }while(i<=0);
    }
}
