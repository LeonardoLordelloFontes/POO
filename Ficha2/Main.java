import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do exercício: ");
        int n_ex = scanner.nextInt();
        switch(n_ex) {
            case 1:
                int[] array1, array2;
                System.out.print("Digite a letra da alinea: ");
                switch (scanner.next().toLowerCase()) {
                    case "a":
                        System.out.print("Digite o tamanho do array: ");
                        array1 = new int[scanner.nextInt()];
                        System.out.print("Digite os elementos do array: ");
                        for (int i = 0; i < array1.length; i++) {
                            array1[i] = scanner.nextInt();
                        }
                        System.out.printf("o menor valor do array %s é %d", Arrays.toString(array1), Array.minValue(array1));
                        break;
                    case "b":
                        System.out.print("Digite o tamanho do array: ");
                        array1 = new int[scanner.nextInt()];
                        System.out.print("Digite os elementos do array: ");
                        for (int i = 0; i < array1.length; i++) {
                            array1[i] = scanner.nextInt();
                        }
                        System.out.print("Digite o índice inicial do subarray: ");
                        int start = scanner.nextInt();
                        System.out.print("Digite o índice final do subarray: ");
                        int end = scanner.nextInt();

                        System.out.printf("O subarray do array %s delimitado pelos índices %d e %d é %s",
                                Arrays.toString(array1), start, end, Arrays.toString(Array.subArray(array1, start, end)));
                        break;
                    case "c":
                        System.out.print("Digite o tamanho do array 1: ");
                        array1 = new int[scanner.nextInt()];
                        System.out.print("Digite os elementos do array 1: ");
                        for (int i = 0; i < array1.length; i++) {
                            array1[i] = scanner.nextInt();
                        }
                        System.out.print("Digite o tamanho do array 2: ");
                        array2 = new int[scanner.nextInt()];
                        System.out.print("Digite os elementos do array 2: ");
                        for (int i = 0; i < array2.length; i++) {
                            array2[i] = scanner.nextInt();
                        }
                        System.out.printf("O array com elementos comuns a %s e %s é %s",
                                Arrays.toString(array1), Arrays.toString(array2), Arrays.toString(Array.intersection(array1, array2)));
                        break;
                }
                break;
            case 2:
                Turma turma = new Turma(5, 5);
                int uc, aluno;
                boolean exercise2 = true;
                while (exercise2) {
                    System.out.println("1 - Para atualizar a pauta");
                    System.out.println("2 - Calcular a soma das notas a uma determinada unidade curricular");
                    System.out.println("3 - Calcular a média das notas de um aluno");
                    System.out.println("4 - Calcular a média das notas de uma unidade curricular");
                    System.out.println("5 - Calcular a nota mais alta qualquer uc");
                    System.out.println("6 - Calcular a nota mais baixa qualquer uc");
                    System.out.println("7 - Devolver o array com as notas acima de um determinado valor");
                    System.out.println("8 - Mostrar a nota dos alunos");
                    System.out.println("9 - determinar a unidade curricular com a média mais elevada");
                    System.out.println("10 - Fechar o programa\n");
                    System.out.print("Sua opção: ");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            for (int i = 0; i < turma.getAlunos(); i++) {
                                for (int j = 0; j < turma.getUcs(); j++) {
                                    System.out.printf("Insira a nota do aluno %d na UC %d: ", i, j);
                                    int nota = scanner.nextInt();
                                    turma.setNota(i, j, nota);
                                }
                            }
                            System.out.println("\nTodas as notas inseridas com sucesso! Aguarde!");
                            break;
                        case 2:
                            System.out.print("Insira a UC: ");
                            uc = scanner.nextInt();
                            System.out.printf("A soma das notas da UC %d é %d\n", uc, turma.sumNotas(uc));
                            break;
                        case 3:
                            System.out.print("Insira o aluno: ");
                            aluno = scanner.nextInt();
                            System.out.printf("A médias das notas do aluno %d é %.2f\n", aluno, turma.mediaAluno(aluno));
                            break;
                        case 4:
                            System.out.print("Insira a UC: ");
                            uc = scanner.nextInt();
                            System.out.printf("A médias das notas da UC %d é %.2f\n", uc, turma.mediaUC(uc));
                            break;
                        case 5:
                            System.out.printf("A nota mais alta do curso é %d\n", turma.notaMaisAlta());
                            break;
                        case 6:
                            System.out.printf("A nota mais baixa do curso é %d\n", turma.notaMaisBaixa());
                            break;
                        case 7:
                            System.out.print("Insira o limite inferior: ");
                            int limite = scanner.nextInt();
                            System.out.printf("O array com os valores acima de %d é %s\n",
                                    limite, Arrays.toString(turma.notasMaioresX(limite)));
                            break;
                        case 8:
                            System.out.println(turma);
                            break;
                        case 9:
                            System.out.printf("A UC com media mais alta é %d", turma.UCmediaMaisAlta());
                            break;
                        case 10:
                            exercise2 = false;
                            break;
                    }
                    try {
                        Thread.sleep(2000);
                        System.out.println("-------------------------------------------------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 3:
                System.out.print("Quantas datas vais inserir no máximo: ");
                Datas datas = new Datas(scanner.nextInt());
                int d, m, a;
                boolean exercise3 = true;
                while (exercise3) {
                    System.out.println("1 - Insira uma data");
                    System.out.println("2 - Data mais próxima");
                    System.out.println("3 - Mostrar datas inseridas");
                    System.out.println("4 - Fechar o programa\n");
                    System.out.print("Sua opção: ");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.print("Digite o dia: ");
                            d = scanner.nextInt();
                            System.out.print("Digite o mes: ");
                            m = scanner.nextInt();
                            System.out.print("Digite o ano: ");
                            a = scanner.nextInt();
                            datas.insereData(LocalDate.of(a, m, d));
                            break;
                        case 2:
                            System.out.print("Digite o dia: ");
                            d = scanner.nextInt();
                            System.out.print("Digite o mes: ");
                            m = scanner.nextInt();
                            System.out.print("Digite o ano: ");
                            a = scanner.nextInt();
                            LocalDate check = LocalDate.of(a, m, d);
                            System.out.printf("A data mais próxima a %s é %s\n", check, datas.dataMaisProxima(check));
                            break;
                        case 3:
                            System.out.print(datas);
                            break;
                        case 4:
                            exercise3 = false;
                            break;
                    }
                    try {
                        Thread.sleep(1000);
                        System.out.println("-------------------------------------------------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            case 4:
                int[] array;
                Array array_instance = new Array();
                System.out.print("Digite a letra da alinea: ");
                switch (scanner.next().toLowerCase()) {
                    case "a":
                        System.out.print("Digite o tamanho do array: ");
                        array = new int[scanner.nextInt()];
                        System.out.print("Digite os elementos do array: ");
                        for (int i = 0; i < array.length; i++) {
                            array[i] = scanner.nextInt();
                        }
                        String before_sort = Arrays.toString(array);
                        array_instance.sort(array);
                        System.out.printf("O array %s depois de ser ordenado por ordem crescente ficou assim %s",
                                before_sort, Arrays.toString(array));
                        break;
                    case "b":
                        System.out.print("Digite o tamanho do array: ");
                        array = new int[scanner.nextInt()];
                        System.out.print("Digite os elementos do array: ");
                        for (int i = 0; i < array.length; i++) {
                            array[i] = scanner.nextInt();
                        }
                        System.out.print("Digite o elemento que está a procura: ");
                        int elem = scanner.nextInt();
                        int index = array_instance.binarySearch(array, elem);
                        if (index == -1) {
                            System.out.printf("O elemento %d não existe no array %s",elem,Arrays.toString(array));
                        }
                        else {
                            System.out.printf("O elemento %d está no index %d do array ordenado %s",elem,index,Arrays.toString(array));
                        }
                        break;
                }
                break;

            case 5:
                System.out.print("Quantas strings vais inserir: ");
                int n_strings = scanner.nextInt();
                String[] strings = new String[n_strings];
                System.out.print("Insira as strings: ");
                for (int i = 0; i < n_strings; i++) {
                    strings[i] = scanner.next();
                }
                MyStrings mystrings = new MyStrings(strings);
                System.out.print("Digite a letra da alinea: ");
                switch (scanner.next().toLowerCase()) {
                    case "a":
                        System.out.printf("O array %s sem strings repetidas é %s",
                                Arrays.toString(strings), Arrays.toString(mystrings.semRepetidas()));
                        break;
                    case "b":
                        System.out.printf("A maior string inserida de %s é %s",
                                Arrays.toString(strings), mystrings.maiorString());
                        break;
                    case "c":
                        System.out.printf("As strings que tem repetidos do array %s são %s",
                                Arrays.toString(strings), Arrays.toString(mystrings.temRepetidas()));
                        break;
                    case "d":
                        System.out.print("Insira a string: ");
                        String string = scanner.next();
                        System.out.printf("A string %s ocorre %d vezes no array %s",
                                string, mystrings.stringOcorre(string), Arrays.toString(strings));
                        break;
                }
                break;
            case 6:
                int[][] matriz1, matriz2;
                System.out.print("Digite a letra da alinea: ");
                switch (scanner.next().toLowerCase()) {
                    case "a":
                        matriz1 = Matrizes.lerMatriz();
                        System.out.print(Arrays.deepToString(matriz1));
                        break;
                    case "b":
                        matriz1 = Matrizes.lerMatriz();
                        matriz2 = Matrizes.lerMatriz();
                        System.out.printf("A soma da matriz %s com a matriz %s é %s",
                                Arrays.deepToString(matriz1),Arrays.deepToString(matriz2),
                                Arrays.deepToString(Matrizes.somaMatriz(matriz1, matriz2)));
                        break;
                    case "c":
                        matriz1 = Matrizes.lerMatriz();
                        matriz2 = Matrizes.lerMatriz();
                        System.out.printf("As matrizes %s e %s ",Arrays.deepToString(matriz1),Arrays.deepToString(matriz2));
                        if (Matrizes.equals(matriz1, matriz2)) System.out.print("São iguais");
                        else System.out.print("Não são iguais");
                        break;
                    case "d":
                        matriz1 = Matrizes.lerMatriz();
                        System.out.printf("A matriz oposta de %s é %s", Arrays.deepToString(matriz1),
                                Arrays.deepToString(Matrizes.oposta(matriz1)));
                        break;
                }
                break;
            case 7:
                Random random = new Random();
                int[] lucky_numbers = new int[5];
                int[] lucky_stars = new int[2];
                int[] player_numbers = new int[5];
                int[] player_stars = new int[2];
                System.out.print("Insira 5 números diferentes (1-50): ");
                for (int i = 0; i < 5; i++) {
                    player_numbers[i] = scanner.nextInt();
                    lucky_numbers[i] = random.nextInt(50) + 1;
                }
                System.out.print("Insira 2 estrelas diferentes (1-9): ");
                for (int i = 0; i < 2; i++) {
                    player_stars[i] = scanner.nextInt();
                    lucky_stars[i] = random.nextInt(9) + 1;
                }
                Arrays.sort(lucky_numbers);
                Arrays.sort(lucky_stars);
                Arrays.sort(player_stars);
                Arrays.sort(player_numbers);
                if (Arrays.equals(lucky_numbers,player_numbers) && Arrays.equals(player_stars, lucky_stars)) {
                    String resultado = "";
                    for (int i = 0; i < 5; i++) {
                        resultado += lucky_numbers[i] + " ";
                    }
                    resultado += "* ";
                    for (int i = 0; i < 2; i++) {
                        resultado += lucky_stars[i] + " ";
                    }
                    resultado += "*";
                    for (int i = 0; i < 50; i++) {
                        for (int j = i; j < 2*i; j++) System.out.print("  ");
                        System.out.println(resultado);
                    }
                }
                else {
                    System.out.print("Números corretos: ");
                    for (int i = 0; i < 5; i++) {
                        if (Arrays.binarySearch(lucky_numbers, player_numbers[i]) >= 0) System.out.print(player_numbers[i] + " ");
                    }
                    System.out.print("\nEstrelas corretas: ");
                    for (int i = 0; i < 2; i++) {
                        if (Arrays.binarySearch(lucky_stars, player_stars[i]) >= 0) System.out.print(player_stars[i] + " ");
                    }
                }
                break;
        }
        scanner.close();
    }
}
