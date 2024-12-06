package Ejercicio20;

/*20. Desarrolla el diagrama de flujo anterior utilizando la herramienta Si-Entonces-De lo contrario-Fin_SI
(IF-THEN-ELSE- END-IF)*/

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número de días para saber cuantos años, meses y semanas tiene: ");
        int numIngresado = sc.nextInt();

   int year, meses, semanas, dias;

        if (numIngresado > 0) {
            year = numIngresado / 365;
            int restoDeDias = numIngresado % 365;

            meses = restoDeDias / 30;
            restoDeDias = restoDeDias % 30;

            semanas = restoDeDias / 7;
            dias = restoDeDias % 7;

            System.out.printf("%d días equivalen a; %n", numIngresado);
            System.out.printf("%d años, %d meses, %d semanas y %d días.%n",
                    year, meses, semanas, dias);
        } else {
            System.out.println("Indique un número mayor a 0");
        }
    }
}
