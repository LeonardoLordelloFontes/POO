import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quatas notas serão enviadas: ");
        int n = scanner.nextInt();
        int[] intervalos = new int[4];
        for (int i = 0; i < 4; i++) intervalos[i] = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do " + (i+1) + "º" + " aluno: ");
            double nota = scanner.nextDouble();
            if (nota >= 0 && nota < 5) {
                intervalos[0] += 1;
            }
            else if (nota >= 5 && nota < 10) {
                intervalos[1] += 1;
            }
            else if (nota >= 10 && nota < 15) {
                intervalos[2] += 1;
            }
            else if (nota >= 15 && nota <= 20) {
                intervalos[3] += 1;
            }
        }
        scanner.close();
        System.out.println(intervalos[0] + " nota(s) no intervalo [0, 5[");
        System.out.println(intervalos[1] + " nota(s) no intervalo [5, 10[");
        System.out.println(intervalos[2] + " nota(s) no intervalo [10, 15[");
        System.out.println(intervalos[3] + " nota(s) no intervalo [15, 20]");
    }
}
