import java.util.Scanner;

public class Mainrecu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDias;
        numeroDias = introducirNumero(teclado);
        imprimirMensaje(conversorDias(numeroDias));
        imprimirMensaje("Gracias por utilizar mi programa");
        teclado.close();
    }

    public static String conversorDias (int numeroDias) {
        int años = numeroDias/365;
        int meses = (numeroDias % 365) / 30;
        int dias = (numeroDias % 365) % 30;

        String mensaje = "El "+ numeroDias + " corresponde a " + años + " a " + meses + " m " + dias + " d.";
        return mensaje;
    }

    public static int introducirNumero (Scanner teclado) {
        int num = 0;

        do {
            System.out.println("Introduce el numero de dias a convertir (valores mayoes de 0)");
            num = teclado.nextInt();
        }while (num <= 0);

        return num;
    }

    public static void imprimirMensaje (String mensaje) {
        System.out.println(mensaje);
    }
}