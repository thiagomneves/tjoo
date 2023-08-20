package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import exceptions.ValorNegativoException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Sobremesa extends Produto {
    private float quantidade;
    private boolean doce;
    private String informacoes;

    public Sobremesa(String nome, float valor, int codigo) throws ValorNegativoException {
        super(nome, valor, codigo);
    }

    public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean doce) throws ValorNegativoException {
        super(nome, valor, codigo);
        this.quantidade = quantidade;
        this.doce = doce;
    }

    public Sobremesa(String nome, float valor, int codigo, float quantidade, boolean doce, String informacoes) throws ValorNegativoException {
        super(nome, valor, codigo);
        this.quantidade = quantidade;
        this.doce = doce;
        this.informacoes = informacoes;
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

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
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

    @Override
    public float calcularImposto(float valor) {
        return valor * 0.2f;
    }
}
