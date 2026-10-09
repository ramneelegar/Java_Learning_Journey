public class solid {
    public static void main(String[] args) {
        System.out.println("solid square");
        for(int i=1; i<=4; i++){  // i = row
            for(int j=1; j<=4; j++){   // j= column
                System.out.print("* ");  //same line
            }
            // move next row or line
            System.out.println(); // for new line
        }
    }
}
