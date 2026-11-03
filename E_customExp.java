import java.util.*;
public class E_customExp {
    public static void main(String[] args) {
        InvaliduserException iue=new InvaliduserException();

        // ATM atm = new ATM();
        bank b =new bank();
        b.permit();
    }
}

class ATM{
    int p =1234;
    int pin;

    void acceptInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the PIN num");
        pin = sc.nextInt();
    }

    void validate() throws InvaliduserException{
        if(p== pin){
            System.out.println("collect money");
        }else{
            InvaliduserException iue = new InvaliduserException();
            throw iue;
        }
    }
}
