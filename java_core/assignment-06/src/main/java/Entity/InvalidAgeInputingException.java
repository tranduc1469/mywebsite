package Entity;

public class InvalidAgeInputingException extends RuntimeException {
    public InvalidAgeInputingException() {
    }

    public InvalidAgeInputingException(String message) {
        super(message);
    }
}
