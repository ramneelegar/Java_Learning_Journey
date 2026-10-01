import java.util.Scanner;

public class conditinal {
    public static void main(String[] args) {
        //if statement
        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("Good consistency!");
        }

        // if-else-if ladder
        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        }
        else if (accuracy >= 75) {
            System.out.println("Good");
        }
        else if (accuracy >= 60) {
            System.out.println("Average");
        }
        else {
            System.out.println("Needs Improvement");
        }

        // nested if
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur age");
        int age = sc.nextInt();
        System.out.println("enter ur marks");
        int marks = sc.nextInt();
        if(age>=18){
            if(marks>=40){
                System.out.println("u can vote and ur passed in ur exams");
            }else{
                System.out.println("u can vote and ur fail in ur exams");
            }
        }else{
            System.out.println("u can't vote and also u failed in ur exam");
        }

        //switch case
        System.out.println("enter the value for switch statement");
        int q=sc.nextInt();
        switch (q) {
            case 1:
                System.out.println("Monday");
                break;   // if no break all execute 
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }sc.close();
    }
}
