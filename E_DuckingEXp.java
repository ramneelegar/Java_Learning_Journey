public class E_DuckingEXp{
    public static void main(String[] args) {
        System.out.println("Connection 1 established");

        try {
            d1.fun1();
        } catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        System.out.println("Connection 1 terminated");
    }
}
