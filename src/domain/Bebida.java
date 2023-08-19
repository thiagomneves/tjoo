package domain;

public class Bebida extends Produto {

    boolean gelada;
    float tamanho;
    String marca;

    public Bebida(String nome, float valor, int codigo) {
        super(nome, valor, codigo);
    }

    public Bebida(String nome, float valor, int codigo, boolean gelada, float tamanho, String marca) {
        super(nome, valor, codigo);
        this.gelada = gelada;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public boolean isGelada() {
        return gelada;
    }

    public void setGelada(boolean gelada) {
        this.gelada = gelada;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "gelada=" + gelada +
                ", tamanho=" + tamanho +
                ", marca='" + marca + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public float calcularImposto(float valor) {
        return valor * 0.6f;
    }
}
