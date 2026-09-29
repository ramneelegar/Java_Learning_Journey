public class datatype {
    static void main(){
        // byte which store range upto 127 
        byte aa=127;
        System.out.println(aa);
        // byte b= 500;
        // System.out.println(b);
        // this will not dtore value more then 127

        short c =32000; 
        System.out.println(c);

        // float d = 3.14; this will not print
        float d=3.14f;
        System.out.println(d);

        double e=1.223345678;
        System.out.println(e);

        boolean ram=true;
        System.out.println(ram);

        char a='a';
        System.out.println(a);
        System.out.println(a + 2); // here a ascii value is 97 soo it is adding 2 to it and o/p is 99

        // type conversion
        // implisite
        int q=10;
        long ww =1;
        System.out.println("this is int type "+q);
        System.out.println("this is long type "+ww);
        
        // explisite
        // from large data type to small (some case data may loss)
        long hhh = 2272;
        // int j=hhh;  // not print beccoz loss of data
        int j = (int)hhh;  // forcelly converting
        System.out.println(hhh);
        System.out.println(j);
    }
}
