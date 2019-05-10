package authorisation;

public class Customer {

    private int id;
    private String name;
    private String mobile;
    private Float balance;
    private String accountStatus;

    public Customer(int id, String name, String mobile, Float balance, String accountStatus) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.balance = balance;
        this.accountStatus = accountStatus;
    }

    public Customer(int id, String name, String mobile) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
