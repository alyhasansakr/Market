package Exceptions;

public class PriceNegative extends RuntimeException {
    public PriceNegative(String message) {
        super(message);
    }
}
