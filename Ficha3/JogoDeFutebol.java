public class JogoDeFutebol {
    private enum Estado {
        INICIAR,
        DECORRER,
        TERMINADO
    }

    private Estado estado;
    private String nomeEquipaVisitante;
    private String nomeEquipaVisitada;
    private int golosEquipaVisitante;
    private int golosEquipaVisitada;

    public JogoDeFutebol() {
        this.estado = Estado.INICIAR;
        this.nomeEquipaVisitante = "EQUIPA VISITANTE";
        this.nomeEquipaVisitada = "EQUIPA VISITADA";
        this.golosEquipaVisitante = 0;
        this.golosEquipaVisitada = 0;
    }

    public JogoDeFutebol(String nomeEquipaVisitante, String nomeEquipaVisitada) {
        this.estado = Estado.INICIAR;
        this.nomeEquipaVisitante = nomeEquipaVisitante;
        this.nomeEquipaVisitada = nomeEquipaVisitada;
        this.golosEquipaVisitante = 0;
        this.golosEquipaVisitada = 0;
    }

    public JogoDeFutebol(JogoDeFutebol jogoDeFutebol) {
        this.estado = jogoDeFutebol.getEstado();
        this.nomeEquipaVisitante = jogoDeFutebol.getNomeEquipaVisitante();
        this.nomeEquipaVisitada = jogoDeFutebol.getNomeEquipaVisitada();
        this.golosEquipaVisitante = jogoDeFutebol.getGolosEquipaVisitante();
        this.golosEquipaVisitada = jogoDeFutebol.getGolosEquipaVisitada();
    }

    public Estado getEstado() {
        return this.estado;
    }

    public String getNomeEquipaVisitante() {
        return this.nomeEquipaVisitante;
    }

    public String getNomeEquipaVisitada() {
        return this.nomeEquipaVisitada;
    }

    public int getGolosEquipaVisitante() {
        return this.golosEquipaVisitante;
    }

    public int getGolosEquipaVisitada() {
        return this.golosEquipaVisitada;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setNomeEquipaVisitante(String nomeEquipaVisitante) {
        this.nomeEquipaVisitante = nomeEquipaVisitante;
    }

    public void setNomeEquipaVisitada(String nomeEquipaVisitada) {
        this.nomeEquipaVisitada = nomeEquipaVisitada;
    }

    public void setGolosEquipaVisitante(int golosEquipaVisitante) {
        this.golosEquipaVisitante = golosEquipaVisitante;
    }

    public void setGolosEquipaVisitada(int golosEquipaVisitada) {
        this.golosEquipaVisitada = golosEquipaVisitada;
    }

    public void startGame() {
        if (estado != Estado.INICIAR) {
            System.out.print("ERRO: NÃO FOI POSSÍVEL INICIAR O JOGO\nESTADO: " + estado);
            System.exit(1);
        }
        estado = Estado.DECORRER;
    }

    public void endGame() {
        if (estado != Estado.DECORRER) {
            System.out.print("ERRO: NÃO FOI POSSÍVEL TERMINAR O JOGO\nESTADO: " + estado);
            System.exit(1);
        }
        estado = Estado.TERMINADO;
    }

    public void goloVisitado() {
        if (estado != Estado.DECORRER) {
            System.out.print("ERRO: JOGO NÃO ESTÁ EM ANDAMENTO");
            System.exit(1);
        }
        golosEquipaVisitada++;
    }

    public void goloVisitante() {
        if (estado != Estado.DECORRER) {
            System.out.print("ERRO: JOGO NÃO ESTÁ EM ANDAMENTO");
            System.exit(1);
        }
        golosEquipaVisitante++;
    }

    public String resultadoActual() {
        if (estado == Estado.INICIAR) {
            System.out.print("ERRO: O JOGO AINDA NÃO COMEÇOU");
            System.exit(1);
        }
        return String.format("%s %d X %d %s",nomeEquipaVisitada,golosEquipaVisitada,golosEquipaVisitante,nomeEquipaVisitante);
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;

        JogoDeFutebol jogoDeFutebol = (JogoDeFutebol) o;
        return  this.estado == jogoDeFutebol.getEstado() &&
                this.nomeEquipaVisitante == jogoDeFutebol.getNomeEquipaVisitante() &&
                this.nomeEquipaVisitada == jogoDeFutebol.getNomeEquipaVisitada() &&
                this.golosEquipaVisitante == jogoDeFutebol.getGolosEquipaVisitante() &&
                this.golosEquipaVisitada == jogoDeFutebol.getGolosEquipaVisitada();
    }

    public JogoDeFutebol clone() {
        return new JogoDeFutebol(this);
    }

    // ALTERAR PARA STRING BUILDER
    public String toString() {
        String string = "<<<<<<<<<<<< JOGO DE FUTEBOL >>>>>>>>>>>>\n\n";
        string += "ESTADO: " +  estado + "\n";
        string += "EQUIPA VISITANTE: " + nomeEquipaVisitante + "\n";
        string += "EQUIPA VISITADA: " + nomeEquipaVisitada + "\n";
        string += "GOLOS EQUIPA VISITANTE: " + golosEquipaVisitante + "\n";
        string += "GOLOS EQUIPA VISITADA: " + golosEquipaVisitada + "\n";
        return string;
    }
}
