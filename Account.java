import javax.management.modelmbean.DescriptorSupport;

public class Account {
    private AccountHolder holder;
    private double balance;

    public Account(double amt, AccountHolder holder) {
        this.balance = amt;
        this.holder = holder;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }

    public void withdraw(double amt) {
        this.balance -= amt;
    }

    public double getBalance() { return balance; }
    public AccountHolder getHolder() { return holder; }
    public void setBalance(double i) { balance = i; }
    public void getHolder(AccountHolder s) { holder = s; }
}
