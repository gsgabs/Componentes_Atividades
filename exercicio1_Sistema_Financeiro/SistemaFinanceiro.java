package exercicio1_Sistema_Financeiro;

// Classe principal para executar o sistema
public class SistemaFinanceiro {
    public static void main(String[] args) {
        Juros juros = new JurosCompostos();
        Amortizacao amortizacao = new AmortizacaoEmprestimo(juros);
    
        double principal = 10000;
        double taxa = 0.05;
        int periodo = 12;
    
        System.out.println("Plano de Amortização:");
        amortizacao.gerarPlano(principal, taxa, periodo);
    }
}