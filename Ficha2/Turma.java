public class Turma {
    private int[][] notasTurma;
    private int alunos;
    private int ucs;

    public Turma(int alunos, int ucs) {
        notasTurma = new int[alunos][ucs];
        this.alunos = alunos;
        this.ucs = ucs;
    }

    // 2 a)

    public void setNota(int aluno, int uc, int nota) {
        notasTurma[aluno][uc] = nota;
    }

    public int getAlunos() {
        return alunos;
    }

    public int getUcs() {
        return ucs;
    }

    // 2 b)

    public int sumNotas(int uc) {
        int sum = 0;
        for (int i = 0; i < alunos; i++) {
            sum += notasTurma[i][uc];
        }
        return sum;
    }

    // 2 c)

    public double mediaAluno(int aluno) {
        double sum = 0;
        for (int i = 0; i < ucs; i++) {
            sum += notasTurma[aluno][i];
        }
        return sum/ucs;
    }

    // 2 d)

    public double mediaUC(int uc) {
        double sum = 0;
        for (int i = 0; i < alunos; i++) {
            sum += notasTurma[i][uc];
        }
        return sum/alunos;
    }

    // 2 e)

    public int notaMaisAlta() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < alunos; i++) {
            for (int j = 0; j < ucs; j++) {
                if (notasTurma[i][j] > max)
                    max = notasTurma[i][j];
            }
        }
        return max;
    }

    // 2 f)

    public int notaMaisBaixa() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < alunos; i++) {
            for (int j = 0; j < ucs; j++) {
                if (notasTurma[i][j] < min)
                    min = notasTurma[i][j];
            }
        }
        return min;
    }

    // 2 g)

    public int[] notasMaioresX (int x) {
        int[] temp = new int[alunos*ucs];
        int size = 0;
        for (int i = 0; i < alunos; i++) {
            for (int j = 0; j < ucs; j++) {
                if (notasTurma[i][j] > x)
                    temp[size++] = notasTurma[i][j];
            }
        }
        int[] new_array = new int[size];
        System.arraycopy(temp, 0, new_array, 0, size);
        return new_array;
    }

    // 2 h)

    public int getNota(int aluno, int uc) {
        return notasTurma[aluno][uc];
    }

    public String toString() {
        String string = "as notas dos alunos são da forma [nota na UC 0, nota na UC 1, ..., nota na UC 4]\n";
        for (int i = 0; i < alunos; i++) {
            string += "As notas do aluno " + i + " são [";
            for (int j = 0; j < ucs - 1; j++) {
                string += getNota(i, j) + ", ";
            }
            string += getNota(i, ucs - 1) + "]\n";
        }
        return string;
    }

    // 2 i)

    public int UCmediaMaisAlta() {
        double max = Double.MIN_VALUE;
        int uc = -1;
        for (int i = 0; i < ucs; i++) {
            double media = mediaUC(i);
            if (media > max) {
                max = media;
                uc = i;
            }
        }
        return uc;
    }

}
