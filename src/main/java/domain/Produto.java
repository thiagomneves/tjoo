package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import exceptions.ValorNegativoException;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Produto {
    protected String nome;
    protected float valor;
    protected int codigo;

    public Produto(String nome, float valor, int codigo) throws ValorNegativoException {
        this.nome = nome;
        this.valor = valor;
        this.codigo = codigo;
    }

    public abstract float calcularImposto(float valor);
}
