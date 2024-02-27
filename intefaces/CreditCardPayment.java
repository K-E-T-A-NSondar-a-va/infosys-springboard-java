package intefaces;

public class CreditCardPayment extends Payment {
    private static int counter;

    static {
        counter = 999;
    }
    public CreditCardPayment(int customerId) {
        super(customerId);
        setPaymentId("C"+ ++counter);
    }

    @Override
    public double payBill(double amount) {
        if(amount <= 500) {
            setServiceTaxPercentage(3);
        }
        else if(amount > 500 && amount <= 1000) {
            setServiceTaxPercentage(5);
        }
        else if(amount > 1000){
            setServiceTaxPercentage(6);
        }

        double serviceTax = (amount * (getServiceTaxPercentage() / 100));
        return (amount + serviceTax);
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        CreditCardPayment.counter = counter;
    }
}
