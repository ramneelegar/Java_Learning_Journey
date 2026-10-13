public class pattern_NumTriangle {
    public static void main(String[] args) {
        int n=4;
        for(int row=1; row<=n; row++){
            // part 1
            for(int col=1; col<=n-row; col++){
                System.out.print("   ");
            }
            // part 2
            for(int col=1; col<=row; col++){

                System.out.print(col +"  ");

            }
            // part 3
            int rowvalue = row;
            int decrowvalue = row-1;
            for(int col=1; col<=row-1; col++){
                System.out.print(decrowvalue+"  ");
                decrowvalue--;
            }
            System.out.println();
        }

    }
}
