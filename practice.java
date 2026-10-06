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
        int final_total = total_marks - lowest;
        int percentage = (final_total * 100) / 400;
        System.out.println("total marks obtaine "+ total_marks);
        System.out.println("percentage obtaine "+ percentage +" %");

        //lowercase to uppercase
        System.out.println("lower enter to upper 1 esle 2");
        int d = sc.nextInt();
        if(d==1){
            System.out.println("enter a char in lowercase");
            char low = sc.next().charAt(0);
            char upper = Character.toUpperCase(low);
            System.out.println("this is the uppercase of ur char "+ upper);
        }
        else{
            System.out.println("enter a char in uppercase");
            char low = sc.next().charAt(0);
            char upper = Character.toLowerCase(low);
            System.out.println("this is the lowercase of ur char "+ upper);
        }

        // 10 multiple of n
        int n=2;
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }

        // prime num from 1 to 100
        int m= 2;
        for(int i=2; i<=100; i++){
            boolean prime = true;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime) {
                System.out.println(i);
            }
        }

        // sum from 1 to 20
        int sum = 0;
        for(int i=1; i<=20; i++){
            sum =sum + i;
        }System.out.println(sum);

        // divisible by 7 from 50 to 100
        for(int i=50; i<=100; i++){
            if(i%7 == 0){
                System.out.println(i);
            }
        }
        
    }
}
