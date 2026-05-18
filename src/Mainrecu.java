import java.util.Scanner;
public class Mainrecu { public static void main(String[] args) {
    Scanner t= new Scanner(System.in);int nd, a, m, d;
    do { System.out.println("Introduce el número de días a convertir (valores mayores de 0)");nd = t.nextInt();
    } while(nd<=0);
    a = (int) nd/365;m = (int) (nd%365)/30;d = (nd%365)%30;
    System.out.println("El "+nd+" corresponde a "+a+" a "+m+" m "+d+ " d.");
    System.out.println("Gracias por utilizar mi programa");t.close();}}