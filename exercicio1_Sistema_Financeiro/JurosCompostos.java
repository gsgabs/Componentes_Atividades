package exercicio1_Sistema_Financeiro;

// Classe que implementa o cálculo de juros compostos
class JurosCompostos implements Juros {
    @Override
    public double calcularJuros(double principal, double taxa, int periodo) {
        return principal * Math.pow(1 + taxa, periodo);
    }
}
    
    
    
    
    
    
