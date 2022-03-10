public class Circulo {
    private double x;
    private double y;
    private double raio;

    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 1;
    }

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }

    public Circulo(Circulo circulo) {
        this.x = circulo.getX();
        this.y = circulo.getY();;
        this.raio = circulo.getRaio();
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getRaio() {
        return this.raio;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void alteraCentro(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calculaPerimetro() {
        return 2 * Math.PI * raio;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;

        Circulo circulo = (Circulo) o;
        return this.x == circulo.getX() && this.y == circulo.getY() && this.raio == circulo.getRaio();
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("((x, y), raio) = ((");
        sb.append(x).append(", ").append(y).append("), ").append(raio).append(")");
        return sb.toString();
    }

    public Circulo clone() {
        return new Circulo(this);
    }
}
