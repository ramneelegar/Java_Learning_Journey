import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur age");
        int age = sc.nextInt();
        System.out.println("enter ur gender m/f");
        char gender = sc.next().charAt(0);
        if(age >= 18){
            if(gender == 'm'){
                System.out.println("he is eligible for vote");
            }if(gender == 'f'){
                System.out.println("she is eligible for vote");
            }else{
                System.out.println("enter valid gender");
            }
        }else{
            System.out.println("not eligiable for vote");
        }

    }
}
