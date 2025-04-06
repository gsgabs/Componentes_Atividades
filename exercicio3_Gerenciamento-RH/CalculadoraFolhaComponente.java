public class CalculadoraFolhaComponente implements ICalculadoraFolha {
    private ICalculadoraHoras calculadoraHoras;

    public CalculadoraFolhaComponente(ICalculadoraHoras calculadoraHoras) {
        this.calculadoraHoras = calculadoraHoras;
    }

    @Override
    public double calcularSalario(int dias, int horasDia, double valorHora) {
        int horas = calculadoraHoras.calcular(dias, horasDia);
        return horas * valorHora;
    }
}
