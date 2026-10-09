public class solid {
    public static void main(String[] args) {
       
        System.out.println("solid rectangle");
        for(int row=1; row<=3; row++){  // i = row
            for(int column=1; column<=5; column++){   // j= column
                System.out.print("* ");  //same line
            }
            // move next row or line
            System.out.println(); // for new line
        }
    }
}
