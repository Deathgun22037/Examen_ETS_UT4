import java.util.Scanner;

/**
 * Esta clase se encarga de convertir los dias a años meses segun cuantos dias te introduzca, posee un metodo conversor de dias,
 * un metodo para verificar el numero introducido, y por ultimo un metodo para imprimir mensaje.
 */

public class Mainrecu {
    /**
     * Metodo main se encarga de ejecutar el resto de metodos y mostrar resultado.
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroDias;
        numeroDias = introducirNumero(teclado);
        imprimirMensaje(conversorDias(numeroDias));
        imprimirMensaje("Gracias por utilizar mi programa");
        teclado.close();
    }

    /**
     * Este metodo se encarga de convertir los dias a años y meses segun cuantos le introduzcas
     * @param numeroDias
     * @return
     */

    public static String conversorDias (int numeroDias) {
        int años = numeroDias/365;
        int meses = (numeroDias % 365) / 30;
        int dias = (numeroDias % 365) % 30;

        String mensaje = "El "+ numeroDias + " corresponde a " + años + " a " + meses + " m " + dias + " d.";
        return mensaje;
    }

    /**
     * Este metodo verifica si el numero introducido es correcto.
     * @param teclado
     * @return
     */

    public static int introducirNumero (Scanner teclado) {
        int num = 0;

        do {
            System.out.println("Introduce el numero de dias a convertir (valores mayoes de 0)");
            num = teclado.nextInt();
        }while (num <= 0);

        return num;
    }

    /**
     * Este metodo imprime mensajes.
     * @param mensaje
     */

    public static void imprimirMensaje (String mensaje) {
        System.out.println(mensaje);
    }
}