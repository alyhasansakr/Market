package Exceptions;

public class UnknownOperation extends RuntimeException {
    public UnknownOperation(String message) {
        super(message);
    }
}
