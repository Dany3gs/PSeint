package Ejercicio20;

/*20. Desarrolla el diagrama de flujo anterior utilizando la herramienta Si-Entonces-De lo contrario-Fin_SI
(IF-THEN-ELSE- END-IF)*/

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numIngresado, calculoAno, calculoMes, calculoSemanas, calculoDias;
        numIngresado = sc.nextDouble();

        int year = 365, meses = 30, semanas = 7, dias = 1;

        if (numIngresado > 0) {
            calculoAno = numIngresado / year;
            calculoMes = numIngresado / meses;
            calculoSemanas = numIngresado / semanas;
            calculoDias = numIngresado / dias;

            System.out.printf("%.2f días son aproximadamente %.2f años.%n", numIngresado, calculoAno);
            System.out.printf("%.2f días son aproximadamente %.2f meses.%n", numIngresado, calculoMes);
            System.out.printf("%.2f días son aproximadamente %.2f semanas.%n", numIngresado, calculoSemanas);
            System.out.printf("%.2f días son aproximadamente %.2f días.%n", numIngresado, calculoDias);

        } else {
            System.out.println("Indique un número mayor a 0");
        }

    }
}
