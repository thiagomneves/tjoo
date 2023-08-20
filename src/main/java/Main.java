import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import domain.Pedido;
import util.LeitorArquivoPedido;

public class Main {
    public static void main(String[] args) {
        String arquivoEntrada = "entrada.txt";

        ClassLoader classLoader = Main.class.getClassLoader();

        LeitorArquivoPedido leitor = new LeitorArquivoPedido();
        List<Pedido> pedidos = leitor.lerPedidos(arquivoEntrada);

        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}