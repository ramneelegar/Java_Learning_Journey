public class pattern_TriangleNum {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1; i<=n; i++){
            // for each row diff diff star
            // column = 1 to value of row
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
