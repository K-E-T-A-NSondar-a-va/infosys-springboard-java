package exception;

public class BusBooking {
    private int bookingId;
    private String destination;
    private String tripPackage;
    private double totalAmount;

    public BusBooking(int bookingId, String destination, String tripPackage) {
        this.bookingId = bookingId;
        this.destination = destination;
        this.tripPackage = tripPackage;
        totalAmount = 0;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTripPackage() {
        return tripPackage;
    }

    public void setTripPackage(String tripPackage) {
        this.tripPackage = tripPackage;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String bookTrip(String couponCode, int numberOfMembers) {
            try {
                validateCouponCode(couponCode, numberOfMembers);

                if (destination.equalsIgnoreCase("Washington DC") ||
                        destination.equalsIgnoreCase("Philadelphia") ||
                        destination.equalsIgnoreCase("Orlando") ||
                        destination.equalsIgnoreCase("Boston") ||
                        destination.equalsIgnoreCase("Atlanta")
                ) ;
                else
                    throw new InvalidDestinationException("Invalid destination");

                if (tripPackage.equalsIgnoreCase("Regular"))
                    totalAmount = 500;
                if (tripPackage.equalsIgnoreCase("Premium"))
                    totalAmount = 800;
                else
                    throw new InvalidTripPackageException("Invalid trip package");

                return "Booking successful";
            } catch (InvalidDestinationException | InvalidTripPackageException | InvalidCouponCodeException e) {
                System.out.println(e.getMessage());
            }
            return "Booking successful";
    }

    public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException {
            if(couponCode.equals("BIGBUS") && numberOfMembers >= 10) return true;
            else if(couponCode.equals("MAGICBUS") && numberOfMembers >= 15) return true;
            else throw new InvalidCouponCodeException("Invalid coupon code");
    }
}
