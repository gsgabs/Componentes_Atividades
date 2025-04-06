public class Main {
    public static void main(String[] args) {
        IValidadorEstoque validador = new ValidadorEstoqueComponente();
        IProcessadorPedido processador = new ProcessadorPedidoComponente(validador);

        processador.processar("Notebook", 3);
        processador.processar("Monitor", 12);
    }
}

