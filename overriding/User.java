package overriding;

public class User {
    private int id;
    private String userName;
    private String emailId;
    private double walletBalance;

    public User(int id, String userName, String emailId, double walletBalance) {
        this.id = id;
        this.userName = userName;
        this.emailId = emailId;
        this.walletBalance = walletBalance;
    }

    public boolean makePayment(double billAmount) {
        if((walletBalance - billAmount) >= 0) {
            walletBalance -= billAmount;
            return true;
        }
        return false;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}
