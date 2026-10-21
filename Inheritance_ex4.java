class Customer {
    int cid;
    String name;
    int num;
    String addr;

    public Customer(int cid, String name, int num, String addr) {
        this.cid = cid;
        this.name = name;
        this.num = num;
        this.addr = addr;
    }
}

class RegularCustomer extends Customer {
    float discount;

    public RegularCustomer(int cid, String name, int num, String addr, float discount) {
        super(cid, name, num, addr); // calling parent constructor
        this.discount = discount;
    }
}

public class Inheritance_ex4 {
    public static void main(String[] args) {
        RegularCustomer rc = new RegularCustomer(
            101, "Ram", 987654321, "Bengaluru", 0.15f
        );

        System.out.println("Customer ID: " + rc.cid);
        System.out.println("Customer Name: " + rc.name);
        System.out.println("Phone Number: " + rc.num);
        System.out.println("Address: " + rc.addr);
        System.out.println("Discount: " + rc.discount);
    }
}
