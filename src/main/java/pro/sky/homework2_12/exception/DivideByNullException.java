package pro.sky.homework2_12.exception;

public class DivideByNullException extends IllegalArgumentException {
    public DivideByNullException() {
    }

    public DivideByNullException(String s) {
        super(s);
    }

    public DivideByNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivideByNullException(Throwable cause) {
        super(cause);
    }
}
