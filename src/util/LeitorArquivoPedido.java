package util;

import domain.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivoPedido {

    public List<Pedido> lerPedidos(String caminhoArquivo) {
        List<Pedido> pedidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            Pedido pedidoAtual = null;

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");

                if (partes[0].equals("P")) {
                    String descricao = partes[1];
                    if (pedidoAtual != null) {
                        pedidos.add(pedidoAtual);
                    }
                    LocalDateTime data = LocalDateTime.parse(partes[2]);
                    boolean web = Boolean.parseBoolean(partes[3]);
                    pedidoAtual = new Pedido(descricao, data, web, new ArrayList<Produto>());
                } else if (partes[0].equals("S")) {
                    String nome = partes[1];
                    String cpf = partes[2];
                    String email = partes[3];
                    Solicitante solicitante = new Solicitante(nome, cpf, email);
                    pedidoAtual.adicionarSolicitante(solicitante);
                } else {
                    Produto produto = criarProduto(partes);
                    pedidoAtual.adicionarProduto(produto);
                }
            }

            if (pedidoAtual != null) {
                pedidos.add(pedidoAtual);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return pedidos;
    }

    private Produto criarProduto(String partes[]) {
        Produto produto = null;

        String nome = partes[0];
        float valor = Float.parseFloat(partes[1]);
        int codigo = Integer.parseInt(partes[2]);

        String tipoProduto = partes[6];

        switch (tipoProduto) {
            case "B":
                boolean gelada = Boolean.parseBoolean(partes[3]);
                float tamanho = Float.parseFloat(partes[4]);
                String marca = partes[5];
                produto = new Bebida(nome, valor, codigo, gelada, tamanho, marca);
                break;
            case "C":
                float peso = Float.parseFloat(partes[3]);
                boolean vegano = Boolean.parseBoolean(partes[4]);
                String ingredientes = partes[5];
                produto = new Comida(nome, valor, codigo, peso, vegano, ingredientes);
                break;
            case "S":
                float quantidade = Float.parseFloat(partes[4]);
                boolean doce = Boolean.parseBoolean(partes[3]);
                String informacoes = partes[5];
                produto = new Sobremesa(nome, valor, codigo, quantidade, doce, informacoes);
                break;
            default:
                System.out.println("Tipo de produto inválido: " + tipoProduto);
                break;
        }

        return produto;
    }
}
