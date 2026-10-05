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

        // percentage calculator by dropping lowest marks
        int total_marks = 0;
        int i;
        int lowest = 100;
        for(i=1 ; i<=5 ; i++){
            System.out.println("enter ur marks of all sub");
            int marks = sc.nextInt();
            total_marks += marks;
            if (marks < lowest ){
                lowest = marks;
            }
        }

    }
}
