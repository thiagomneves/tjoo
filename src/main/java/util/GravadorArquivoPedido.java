package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Pedido;
import exceptions.ArquivoIOException;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class GravadorArquivoPedido {
    public static void escreverListaParaJSON(List<Pedido> pedidos, String arquivoSaida) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            for (Pedido pedido : pedidos) {
                System.out.println("Pedido antes da escrita: " + pedido);
            }

            objectMapper.writeValue(new File(arquivoSaida), pedidos);
            System.out.println("Arquivo JSON gerado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao escrever o arquivo JSON: " + e.getMessage());
        }
    }

}
