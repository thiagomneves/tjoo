package domain;

public class Comida extends Produto {
    float peso;
    boolean vegano;
    String ingredientes;

    @Override
    public float calcularImposto(float valor) {
        return 0;
    }
}
