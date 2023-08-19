package domain;

public class Bebida extends Produto {

    boolean gelada;
    float tamanho;
    String marca;

    @Override
    public float calcularImposto(float valor) {
        return valor * 0.6f;
    }
}
