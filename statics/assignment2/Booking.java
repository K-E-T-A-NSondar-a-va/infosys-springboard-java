package statics.assignment2;

public class Booking {
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static {
        seatsAvailable = 400;
    }

    public Booking(String customerEmail, int seatsRequired) {
        this.customerEmail = customerEmail;
        this.seatsRequired = seatsRequired;

        this.isBooked = (seatsAvailable - seatsRequired) >= 0;
        if(isBooked) seatsAvailable -= seatsRequired;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getSeatsRequired() {
        return seatsRequired;
    }

    public void setSeatsRequired(int seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public static int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static void setSeatsAvailable(int seatsAvailable) {
        Booking.seatsAvailable = seatsAvailable;
    }
}
