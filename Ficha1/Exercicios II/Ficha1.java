import java.time.LocalDateTime;

public class Ficha1 {
    public double celsiusParaFarenheit(double graus) {
        return graus * 1.8 + 32;
    }

    public int maximoNumeros(int a, int b) {
        int max = b;
        if (a > b) max = a;
        return max;
    }

    public String criaDescricaoConta(String nome, float saldo) {
        return "Nome: " + nome + ", saldo: " + saldo;
    }

    public double eurosParaLibras(double valor, double taxaConversao) {
        return valor * taxaConversao;
    }

    public long factorial(int num) {
        int r = 1;
        for (int i = num; i > 1; i--) {
            r *= i;
        }
        return r;
    }

    public long tempoGasto() {
        long t = System.nanoTime();
        factorial(5000);
        return System.nanoTime() - t;
    }

}
