package domain;

public abstract class Produto {
    String nome;
    float valor;
    int codigo;

    public abstract float calcularDesconto(float valor);
}
