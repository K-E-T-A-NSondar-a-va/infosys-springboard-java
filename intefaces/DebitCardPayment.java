package intefaces;

public class DebitCardPayment extends Payment {
    private static int counter;
    private double discountPercentage;

    static {
        counter = 999;
    }

    public DebitCardPayment(int customerId) {
        super(customerId);
        setPaymentId("D"+ ++counter);
    }

    @Override
    public double payBill(double amount) {
        if(amount <= 500) {
            setServiceTaxPercentage(2.5);
            discountPercentage = 1;
        }
        else if(amount > 500 && amount <= 1000) {
            setServiceTaxPercentage(4);
            discountPercentage = 2;
        }
        else if(amount > 1000){
            setServiceTaxPercentage(5);
            discountPercentage = 3;
        }

        double serviceTax = (amount * (getServiceTaxPercentage() / 100));
        double discount = (amount * (discountPercentage / 100));

        return ((amount + serviceTax) - discount);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        DebitCardPayment.counter = counter;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}
