public class pattern_alphabetTriangle {
    public static void main(String[] args) {
        int n=4;
        for(int row=1; row<=n; row++){
            // part 1
            for(int col=1; col<=n-row; col++){
                System.out.print("   ");
            }
            // part 2
            for(int col=1; col<=row; col++){
                int a=col;
                int b='A'-1;
                int ans=a+b;
                char finalans=(char)ans;
                System.out.print(finalans +"  ");
            }
            // part 3
            char alp=(char)(row + 'A' -2);
            for(int col=1; col<=row-1; col++){
                System.out.print(alp +"  ");
                alp--;
            }
            System.out.println();
        }
    }
}
