class BankAccount {
    private long balance;

    public void setData(long amt){
        if(amt >= 0){
            balance = amt;
        }else{
            System.out.println("Invalid amount");
            System.exit(0);  // terminate the program 
        }
    }

    public long getData() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setData(1000);
        System.out.println(b.getData());
    }
}
