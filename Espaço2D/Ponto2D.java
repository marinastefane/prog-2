public class Ponto2D {
    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculaDistancia(Ponto2D ponto) {
        return Math.sqrt(Math.pow((ponto.getX() - this.x), 2) + Math.pow((ponto.getY() - this.y), 2));
    }
}
