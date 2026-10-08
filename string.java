public class string {
    public static void main(String[] args) {
        String s1 = "SACHIN";
        String s2 = "SAURAV";

        System.out.println(s1.charAt(2));
        System.out.println(s1.length());

        // string comparision
        if(s1 == s2){
            System.out.println("both are at same referance");
        }
        
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s1.compareTo(s1));


    }
}   
