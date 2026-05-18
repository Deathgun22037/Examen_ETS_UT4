package Esfera;

/**
 * Clase objeto esfera tiene como atributos radio como private y final el numero pi, tiene metodos como calcular area y volumen
 * y constructor de objetos asi como un metodo toString para presentar el objeto.
 */

public class Esfera {
    private double radio;
    final double pi = Math.PI;

    /**
     * Constructor vacio buena praxis.
     */
    public Esfera() {
    }

    /**
     * Constructor del objeto
     * @param radio
     */

    public Esfera(double radio) {
        this.radio = radio;
    }

    /**
     * Getter y setter de los datos del objeto.
     * @return
     */

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * Metodo que calcula el area.
     * @param radio
     * @param pi
     * @return
     */

    public static double calcularArea(double radio, double pi) {
        double area = 0;

        area = 4*pi*radio*radio*radio;
        return area;
    }

    /**
     * Meotod que calcula el volumen
     * @param radio
     * @param pi
     * @return
     */

    public static double calcularVolumen(double radio, double pi) {
        double volumen = 0;

        volumen = (4*pi*radio*radio*radio)/3;
        return volumen;
    }

    /**
     * Metodo que devuelve un string con los datos de la esfera.
     * @return
     */

    @Override
    public String toString() {
        return "Esfera{" +
                "radio=" + radio +
                '}';
    }
}
