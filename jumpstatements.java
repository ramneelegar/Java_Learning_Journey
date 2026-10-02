import java.util.Scanner;

public class jumpstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // break
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=0; i<=n; i++){
            if(i==4){
                break;
            }System.out.println(i);
        }

        //continue
        System.out.println("enter m");
        int m=sc.nextInt();
        for(int j=0; j<=m; j++){
            if(j==4){
                continue;
            }System.out.println(j);
        }
    }
}
