package domain;

public class Sobremesa extends Produto {
    float quantidade;
    boolean doce;
    String informacoes;

    @Override
    public float calcularImposto(float valor) {
        return valor * 0.2f;
    }
}
