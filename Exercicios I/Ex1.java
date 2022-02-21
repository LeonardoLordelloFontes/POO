import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int dia, mes, ano, r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        dia = scanner.nextInt();

        System.out.println("Digite o mês: ");
        mes = scanner.nextInt();

        System.out.println("Digite o ano: ");
        ano = scanner.nextInt();

        LocalDate date =  LocalDate.of(ano, mes, dia);

        // a) i)
        r = (ano - 1900) * 365;

        // a) ii)
        r += (ano - 1900)/4;

        // a) iii)

        if (ano % 4 == 0 && (mes == 1 || mes == 2)) {
            r -= 1;
        }

        // a) iv)
        r += date.getDayOfYear();

        // b) e c)
        r %= 7;

        switch (r) {
            case 0 -> System.out.println("Domingo");
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sábado");
            default -> System.out.println("Dia inválido");
        }
        scanner.close();
    }
}
