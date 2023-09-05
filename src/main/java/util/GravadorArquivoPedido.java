package util;

import domain.Pedido;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class GravadorArquivoPedido {
    public static void escreverListaParaJSON(List<Pedido> pedidos, String arquivoSaida) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoSaida))) {
            String json = pedidos.stream()
                    .map(pedido -> pedidoToJSON(pedido))
                    .collect(Collectors.joining(", ", "[", "]"));

            writer.write(json);
            System.out.println("Arquivo JSON gerado com sucesso.");
        } catch (IOException e) {
            System.err.println("Erro ao escrever o arquivo JSON: " + e.getMessage());
        }
    }

    private static String pedidoToJSON(Pedido pedido) {
        StringBuilder jsonBuilder = new StringBuilder();
        jsonBuilder.append("{");
        jsonBuilder.append("\"descricao\": \"" + pedido.getDescricao() + "\", ");
        jsonBuilder.append("\"data\": \"" + pedido.getData() + "\", ");
        jsonBuilder.append("\"web\": " + pedido.isWeb());

        jsonBuilder.append("}");
        return jsonBuilder.toString();
    }

}
