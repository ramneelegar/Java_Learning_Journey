public class hollow_daimond {
    public static void main(String[] args) {
        int n=4;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row; col++){
                System.out.print("  ");
            }
            if(row==1 ){
                for(int col=1; col<=2*row-1; col++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int col=1; col<=2*row-3; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");

            }System.out.println();
        }

        
        // inverted
        for(int row = 2; row <= n; row++){
            for(int col = 1; col <= row - 1; col++){
                System.out.print("  ");
            }
            if(row == n){
                System.out.print("* ");
            }
            else{
                System.out.print("* ");
                for(int col = 1; col <= 2*n - 2*row - 1; col++){
                    System.out.print("  ");
                }
                System.out.print("* ");
            }System.out.println();
        }
    }
}
