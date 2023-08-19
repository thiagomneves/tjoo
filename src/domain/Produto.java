package domain;

public abstract class Produto {
    String nome;
    float valor;
    int codigo;

    public Produto(String nome, float valor, int codigo) {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public abstract float calcularImposto(float valor);
}
