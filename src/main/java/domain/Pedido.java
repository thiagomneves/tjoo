package domain;

import exceptions.ValorNegativoException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pedido {
    private String descricao;
    private LocalDateTime data;
    private boolean web;

    private List<Produto> listaProdutos;
    private Set<Solicitante> solicitantes;

    public Pedido(String descricao, LocalDateTime data, boolean web, List<Produto> listaProdutos) throws ValorNegativoException {
        this.descricao = descricao;
        this.data = data;
        this.web = web;
        this.listaProdutos = new ArrayList<>(listaProdutos);
        this.solicitantes = new HashSet<>();
    }

    public Pedido(String descricao, LocalDateTime data, boolean web, List<Produto> listaProdutos, Solicitante solicitante) throws ValorNegativoException {
        this.descricao = descricao;
        this.data = data;
        this.web = web;
        this.listaProdutos = new ArrayList<>(listaProdutos);
        this.solicitantes = new HashSet<>();
        this.solicitantes.add(solicitante);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descricao='" + descricao + '\'' +
                ", data=" + data +
                ", web=" + web +
                ", listaProdutos=" + listaProdutos +
                ", solicitantes=" + solicitantes +
                '}';
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }

    public void adicionarSolicitante(Solicitante solicitante) {
        solicitantes.add(solicitante);
    }

    public void removerSolicitante(Solicitante solicitante) {
        solicitantes.remove(solicitante);
    }
}