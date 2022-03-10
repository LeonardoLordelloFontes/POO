import java.util.Calendar;

public class Lampada {

    private boolean ligada;
    private double consumoEnergia;
    private double taxaConsumo;
    private double taxaConsumoModoEco;
    private double consumoTotal;
    private long lastReset;

    public Lampada() {
        this.ligada = false;
        this.consumoEnergia = 0.05;
        this.taxaConsumo = 0;
        this.taxaConsumoModoEco = 0.3;
        this.consumoTotal = 0;
        this.lastReset = 0;
    }

    public Lampada(double consumoEnergia, double taxaConsumoModoEco) {
        this.ligada = false;
        this.consumoEnergia = consumoEnergia;
        this.taxaConsumo = 0;
        this.taxaConsumoModoEco = taxaConsumoModoEco;
        this.consumoTotal = 0;
        this.lastReset = 0;
    }

    public Lampada (Lampada lampada) {
        this.ligada = lampada.getLigada();
        this.consumoEnergia = lampada.getConsumoEnergia();
        this.taxaConsumo = lampada.getTaxaConsumo();
        this.taxaConsumoModoEco = lampada.getTaxaConsumoModoEco();
        this.consumoTotal = lampada.getConsumoTotal();
        this.lastReset = lampada.getLastReset();
    }

    public boolean getLigada() {
        return this.ligada;
    }

    public double getConsumoEnergia() {
        return this.consumoEnergia;
    }

    public double getTaxaConsumo() {
        return this.taxaConsumo;
    }

    public double getConsumoTotal() {
        return this.consumoTotal;
    }

    public long getLastReset() {
        return this.lastReset;
    }

    public double getTaxaConsumoModoEco() {
        return this.taxaConsumoModoEco;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public void setTaxaConsumo(int taxaConsumo) {
        this.taxaConsumo = taxaConsumo;
    }

    public void setConsumoTotal(int consumoTotal) {
        this.consumoTotal = consumoTotal;
    }

    public void setLastReset(long lastReset) {
        this.lastReset = lastReset;
    }

    public void setTaxaConsumoModoEco(double taxaConsumoModoEco) {
        this.taxaConsumoModoEco = taxaConsumoModoEco;
    }

    public void lampON() {
        if (this.ligada) {
            System.out.print("ERRO: A LÂMPADA JÁ ESTÁ LIGADA");
            System.exit(1);
        }
        Calendar calendar = Calendar.getInstance();
        this.lastReset = calendar.getTimeInMillis();
        this.taxaConsumo = 1;
        this.ligada = true;
    }

    public void lampOFF() {
        if (!this.ligada) {
            System.out.print("ERRO: A LÂMPADA JÁ ESTÁ DELIGADA");
            System.exit(1);
        }
        this.consumoTotal += periodoConsumo();
        this.taxaConsumo = 0;
        this.ligada = false;
    }

    public void lampECO() {
        if (this.ligada) {
            System.out.print("ERRO: A LÂMPADA JÁ ESTÁ LIGADA");
            System.exit(1);
        }
        Calendar calendar = Calendar.getInstance();
        this.lastReset = calendar.getTimeInMillis();
        this.taxaConsumo = this.taxaConsumoModoEco;
        this.ligada = true;
    }

    public double totalConsumo() {
        return this.consumoTotal;
    }

    public double periodoConsumo() {
        Calendar calendar = Calendar.getInstance();
        long tempoConsumo = Math.abs(this.lastReset - calendar.getTimeInMillis());
        return tempoConsumo * this.consumoEnergia * this.taxaConsumo;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;

        Lampada lampada = (Lampada) o;
        return  this.ligada == lampada.getLigada() &&
                this.consumoEnergia == lampada.getConsumoEnergia() &&
                this.taxaConsumo == lampada.getTaxaConsumo() &&
                this.taxaConsumoModoEco == lampada.getTaxaConsumoModoEco() &&
                this.consumoTotal == lampada.getConsumoTotal() &&
                this.lastReset == lampada.getLastReset();
    }

    public Lampada clone() {
        return new Lampada(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<<<<<<<<<<<< LAMPADA >>>>>>>>>>>>\n\n");
        if (this.ligada)
            sb.append("STATUS: LIGADA\n");
        else
            sb.append("STATUS: DESLIGADA\n");

        sb.append("CONSUMO DE ENERGIA POR MILISSEGUNDO: ")
                .append(consumoEnergia).append(" WATTZ\n").append("TAXA DE CONSUMO ATUAL: ")
                .append(taxaConsumo * 100).append(" %\n").append("TAXA DE CONSUMO NO MODO ECONOMIA: ")
                .append(taxaConsumoModoEco * 100).append(" %\n").append("CONSUMO TOTAL DE ENERGIA DESDE O INICIO: ")
                .append(consumoTotal).append(" WATTZ\n").append("CONSUMO TOTAL DE ENERGIA DESDE O ULTIMO RESET: ")
                .append(periodoConsumo()).append(" WATTZ\n");
        return sb.toString();
    }
}
