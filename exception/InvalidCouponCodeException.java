package exception;

public class InvalidCouponCodeException extends Exception {
    public InvalidCouponCodeException(String message) {
        super(message);
    }
}
