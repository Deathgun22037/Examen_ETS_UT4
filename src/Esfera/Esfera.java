package Esfera;

public class Esfera {
    private double area;
    private double radio;
    final double pi = Math.PI;

    public Esfera() {
    }

    public Esfera(double area, double radio) {
        this.area = area;
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public static double calcularArea(double radio, double pi) {
        double area = 0;

        area = 4*pi*radio*radio*radio;
        return area;
    }

    public static double calcularVolumen(double radio, double pi) {
        double volumen = 0;

        volumen = (4*pi*radio*radio*radio)/3;
        return volumen;
    }
}
