   
class BankAccount {
    private long bal;

    public void setBal(long bal) {
        if (bal > 0){
            this.bal = bal;
        }
        else{
            System.out.println("Invalid balance");
        }
    }

    public long getBal() {
        return bal;
    }
}

class Customer {
    private int cid;
    private String cname;
    private long cnum;

    public void setCid(int cid, String cname, long cnum) {
        this.cid = cid;
        this.cname = cname;
        this.cnum = cnum;
    }
    
    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public long getCnum() {
        return cnum;
    }
}

public class Encp_Bank {
    public static void main(String[] args) {

        BankAccount b = new BankAccount();
        b.setBal(1000);
        System.out.println(b.getBal());

        Customer c = new Customer();
        c.setCid(1,"ram",8956456542L);

        System.out.println(c.getCid());
        System.out.println(c.getCname());
        System.out.println(c.getCnum());
    }
}
