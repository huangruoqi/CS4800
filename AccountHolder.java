import java.lang.Math;

public abstract class AccountHolder {
    protected int ID;
    protected String address;
    
    public AccountHolder(int ID, String address) {
        this.ID = ID;
        this.address = address;
    }

    public static int getNextID() {
        return (int)Math.random()*1000001;
    }
}