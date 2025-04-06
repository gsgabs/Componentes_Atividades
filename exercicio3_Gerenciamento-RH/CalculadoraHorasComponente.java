public class CalculadoraHorasComponente implements ICalculadoraHoras {
    @Override
    public int calcular(int diasTrabalhados, int horasPorDia) {
        return diasTrabalhados * horasPorDia;
    }
}
