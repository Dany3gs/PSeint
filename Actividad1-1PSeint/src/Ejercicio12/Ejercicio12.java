package Ejercicio12;
import java.util.Scanner;
import java.util.SortedMap;
/*12. Desarrolla un diagrama de flujo que permita convertir calificaciones numéricas, según la siguiente tabla:

A = 19 y 20,
B = 16, 17 y 18,
C = 13, 14 y 15,
D = 10, 11 y 12,
E = 1 hasta el 9.

Se asume que la nota está comprendida entre 1 y 20
*/

public class Ejercicio12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Indique una calificación para indicar su calificación:");
        nota = sc.nextInt();
        if (nota >= 19 && nota <= 20) {
            System.out.println("La calificación es A");
        } else if (nota >= 16 && nota <= 18) {
            System.out.println("La calificación es B");
        } else if (nota >= 13 && nota <= 15) {
            System.out.println("La calificación es C");
        } else if (nota >= 10 && nota <= 12) {
            System.out.println("La calificación es D");
        } else if (nota >= 1 && nota < 10) {
            System.out.println("La calificación es E");
        } else {
            System.out.println("La calificación es ERRÓNEA");
        }
    }
}
