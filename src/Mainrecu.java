import java.util.Scanner;

public class Mainrecu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDias, años, meses, dias;
        do {
            System.out.println("Introduce el número de días a convertir (valores mayores de 0)");
            numeroDias = teclado.nextInt();
        } while (numeroDias <= 0);
        años = (int) numeroDias / 365;
        meses = (int) (numeroDias % 365) / 30;
        dias = (numeroDias % 365) % 30;
        System.out.println("El " + numeroDias + " corresponde a " + años + " a " + meses + " m " + dias + " d.");
        System.out.println("Gracias por utilizar mi programa");
        teclado.close();
    }
}