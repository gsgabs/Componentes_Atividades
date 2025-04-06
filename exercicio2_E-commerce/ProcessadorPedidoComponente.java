public class ProcessadorPedidoComponente implements IProcessadorPedido {
    private IValidadorEstoque validador;

    public ProcessadorPedidoComponente(IValidadorEstoque validador) {
        this.validador = validador;
    }

    @Override
    public void processar(String produto, int quantidade) {
        if (validador.validar(produto, quantidade)) {
            System.out.println("Pedido aprovado: " + produto + " x" + quantidade);
        } else {
            System.out.println("Falha no pedido: estoque insuficiente de " + produto);
        }
    }
}
