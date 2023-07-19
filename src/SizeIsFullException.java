public class SizeIsFullException extends RuntimeException {
    public SizeIsFullException() {
    }

    public SizeIsFullException(String message) {
        super(message);
    }

    public SizeIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public SizeIsFullException(Throwable cause) {
        super(cause);
    }

    public SizeIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
