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
    }
}
