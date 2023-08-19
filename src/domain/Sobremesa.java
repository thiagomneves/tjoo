package domain;

public class Sobremesa extends Produto {
    float quantidade;
    boolean doce;
    String informacoes;

    public Sobremesa(String nome, float valor, int codigo) {
        super(nome, valor, codigo);
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Sobremesa{" +
                "quantidade=" + quantidade +
                ", doce=" + doce +
                ", informacoes='" + informacoes + '\'' +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                ", codigo=" + codigo +
                '}';
    }

    public boolean isDoce() {
        return doce;
    }

    public void setDoce(boolean doce) {
        this.doce = doce;
    }

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean doce, String informacoes) {
        super(nome, valor, codigo);
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacoes = informacoes;
    }

    @Override
    public float calcularImposto(float valor) {
        return valor * 0.2f;
    }
}
