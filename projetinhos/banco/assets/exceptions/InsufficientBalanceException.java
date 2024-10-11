package assets.exceptions;

public class InsufficientBalanceException extends AccountException {
    public InsufficientBalanceException(String arg) {
        super(arg);
    }
}
