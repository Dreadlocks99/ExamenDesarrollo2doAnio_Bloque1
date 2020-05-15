package domain;

public class Punto {

    private double puntoX;
    private double puntoY;

    public Punto(double puntoX, double puntoY) {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
    }

    public double getPuntoX() {
        return puntoX;
    }

    public double getPuntoY() {
        return puntoY;
    }
}