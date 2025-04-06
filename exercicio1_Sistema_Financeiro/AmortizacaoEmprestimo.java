package exercicio1_Sistema_Financeiro;
    
// Classe que implementa a geração do plano de amortização
class AmortizacaoEmprestimo implements Amortizacao {
    private Juros juros;

    public AmortizacaoEmprestimo(Juros juros) {
        this.juros = juros;
    }
    @Override
    public void gerarPlano(double principal, double taxa, int periodo) {
        double saldo = principal;
        for (int i = 1; i <= periodo; i++) {
            double saldoComJuros = juros.calcularJuros(saldo, taxa, 1);
            double pagamento = saldoComJuros / (periodo - i + 1);
            saldo = saldoComJuros - pagamento;
    
            System.out.printf("Mês %d: Saldo com juros: %.2f, Pagamento: %.2f, Novo saldo: %.2f%n",
            i, saldoComJuros, pagamento, saldo);
        }
    }
}
