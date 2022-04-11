import java.lang.Math;

public class AccountHolder {
    private int ID;
    private String address;

    public AccountHolder(int ID, String address) {
        this.ID = ID;
        this.address = address;
    }

    public static int getNextID() {
        return (int)Math.random()*1000001;
    }

    public int getID() { return ID; }
    public String getAddress() { return address; }
    public void setID(int i) { ID = i; }
    public void setAddress(String s) { address = s; }
}