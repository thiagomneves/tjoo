package exceptions;

import java.io.IOException;

public class ArquivoIOException extends IOException {

    public ArquivoIOException(String mensagem) {
        super(mensagem);
    }

    public ArquivoIOException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}