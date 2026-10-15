public class JaggedArray {
    public static void main(String[] args) {
        // decclaration
        int[][] matrix;
        // initialization
        matrix = new int[3][3];
        //  or
        int[][] brr = { {1, 2, 3},
                        {4,7, 5, 6},
                        {7, 8, 9} 
        };

        System.out.println("ele of 2nd row 0th col : "+brr[2][0]);
        System.out.println();

        //  display all elements
        int row = brr.length; 


        // if same num of row col
        // int col = brr[0].length;
        for(int i=0; i<=row-1; i++){
            // if diff num of col and row
            int col = brr[i].length;
            for(int j=0; j<=col-1; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
