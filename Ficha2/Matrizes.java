import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {

    // Supostamente era para fazer o IO na main, n percebo o que eles querem aqui com um método de leitura
    // 6 a)

    public static int[][] lerMatriz() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite o número de colunas da matriz: ");
        int colunas = scanner.nextInt();
        System.out.print("Elementos da matriz: ");
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        return matriz;
    }

    // 6 b)

    public static int[][] somaMatriz(int[][] m1, int[][] m2) {
        int[][] matriz = m1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] += m2[i][j];
            }
        }
        return matriz;
    }

    // 6 c)

    public static boolean equals(int[][] m1, int[][] m2) {
        return Arrays.deepEquals(m1, m2);
    }

    // 6 d)

    public static int[][] oposta(int[][] matriz) {
        int[][] m = matriz;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = -matriz[i][j];
            }
        }
        return matriz;
    }
}
