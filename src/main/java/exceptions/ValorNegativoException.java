package exceptions;

public class ValorNegativoException extends RuntimeException {
    public ValorNegativoException(String message) {
        super(message);
    }
}