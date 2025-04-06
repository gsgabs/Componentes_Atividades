public class ValidadorEstoqueComponente implements IValidadorEstoque {
    @Override
    public boolean validar(String produto, int quantidade) {
        return quantidade <= 10;
    }
}
