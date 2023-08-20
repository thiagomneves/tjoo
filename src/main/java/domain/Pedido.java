package domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import exceptions.ValorNegativoException;
import util.LocalDateTimeSerializer;

import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pedido {
    private String descricao;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isWeb() {
        return web;
    }

    public void setWeb(boolean web) {
        this.web = web;
    }

    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public Set<Solicitante> getSolicitantes() {
        return solicitantes;
    }

    public void setSolicitantes(Set<Solicitante> solicitantes) {
        this.solicitantes = solicitantes;
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
