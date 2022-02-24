import java.util.Scanner;

public class TestePrograma {
    public static void main(String[] args) {
        Ficha1 ficha1 = new Ficha1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número do exercício: ");
        int n_ex = scanner.nextInt();
        switch(n_ex) {
            case 1:
                System.out.print("Digite a temperatura em Graus celsius para converter: ");
                double celsius = scanner.nextDouble();
                double farenheit = ficha1.celsiusParaFarenheit(celsius);
                System.out.printf("%.2f graus celsius é igual a %.2f farenheit", celsius, farenheit);
                break;
            case 2:
                System.out.print("Digite dois números inteiros para obter o máximo entre eles: ");
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                System.out.printf("O maior entre %d e %d é %d", x, y, ficha1.maximoNumeros(x,y));
                break;
            case 3:
                System.out.print("Digite o nome: ");
                String nome = scanner.next();
                System.out.print("Digite o saldo: ");
                float saldo = scanner.nextFloat();
                System.out.printf(ficha1.criaDescricaoConta(nome, saldo));
                break;
            case 4:
                System.out.print("Digite o montante em euros que deseja converter: ");
                double euros = scanner.nextDouble();
                System.out.print("Insira a taxa de conversão atual de euros para libras: ");
                double taxa = scanner.nextDouble();
                System.out.printf("%.2f euros é %.2f libras", euros, ficha1.eurosParaLibras(euros, taxa));
                break;
            case 5:
                System.out.print("Digite dois inteiros: ");
                int z = scanner.nextInt();
                int t = scanner.nextInt();
                double media = (z + t) / 2.0;
                if (ficha1.maximoNumeros(z, t) == z) System.out.printf("A média entre %d e %d é %.2f", z, t, media);
                else System.out.printf("A média entre %d e %d é %.2f", t, z, media);
                break;
            case 6:
                int n = Integer.valueOf(args[0]);
                System.out.printf("o fatorial de %s é %d", args[0], ficha1.factorial(n));
                break;
            case 7:
                System.out.printf("o tempo gasto em milissegundos foi %.3f ms", Double.valueOf(ficha1.tempoGasto())/1000000);
                break;
        }
    }
}
