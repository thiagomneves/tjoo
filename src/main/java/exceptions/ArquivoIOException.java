package exceptions;

import java.io.IOException;

public class ArquivoIOException extends IOException {
    private static final long serialVersionUID = 1L;

    public ArquivoIOException(String mensagem) {
        super(mensagem);
    }

    public ArquivoIOException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}