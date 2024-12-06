package Ejercicio13;

//13. Realiza el mismo diagrama de flujo utilizando Mientras (While).

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;
        System.out.println("Indique una calificación para indicar su calificación:");
        nota = sc.nextInt();

        boolean continuar = true;
        while (nota >= 19 && nota <= 20 && continuar == true) {
            System.out.println("La calificación es A");
            continuar = false;
        }
        while (nota >= 13 && nota <= 15 && continuar == true) {
            System.out.println("La calificación es B");
            continuar = false;
        }
        while (nota >= 10 && nota <= 12 && continuar == true) {
            System.out.println("La calificación es C");
            continuar = false;
        }
        while (nota >= 1 && nota < 10  && continuar == true) {
            System.out.println("La calificación es A");
            continuar = false;
        }
        if (nota <= 0 || nota > 20 ) {
            System.out.println("La calificación es ERRÓNEA");
        }
    }
}
