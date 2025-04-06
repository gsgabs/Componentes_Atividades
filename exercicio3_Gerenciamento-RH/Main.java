

public class Main {
    public static void main(String[] args) {
        ICalculadoraHoras calculadoraHoras = new CalculadoraHorasComponente();
        ICalculadoraFolha folha = new CalculadoraFolhaComponente(calculadoraHoras);

        double salario = folha.calcularSalario(22, 8, 30.0);
        System.out.println("Folha de pagamento: R$" + salario);
    }
}
