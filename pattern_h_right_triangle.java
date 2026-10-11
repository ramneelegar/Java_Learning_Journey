public class pattern_h_right_triangle {
    public static void main(String[] args) {
        int n=10;
        for(int row=1; row<=n; row++){   
            if(row==1 || row==2 || row==n){
                for(int col=1; col<=row; col++){
                    System.out.print("* "); 
                }       
            }else{
                //start col
                System.out.print("* ");
                //mid col
                for(int col=1; col<=(row-2); col++){
                    System.out.print("  ");
                }
                // last col
                System.out.print("* ");
            }System.out.println();
        }
    }
}
