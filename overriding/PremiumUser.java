package overriding;

public class PremiumUser extends User {

    private int rewardPoints;

    @Override
    public boolean makePayment(double billAmount) {
        double walletBalance = getWalletBalance();
        if(walletBalance - billAmount > 0) {
            walletBalance -= billAmount;
            setWalletBalance(walletBalance);
//            double rewardPoint = Math.round(walletBalance + (billAmount * 0.10));
//            setRewardPoints(getRewardPoints() + (int) rewardPoint);

            int reward = (int) Math.round(billAmount * 0.10);
            rewardPoints += reward;

            return true;
        } else {
            return false;
        }
    }

    public PremiumUser(int id, String userName, String emailId, double walletBalance) {
        super(id, userName, emailId, walletBalance);
        rewardPoints = 0;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }
}
