package Ejercicio19;

/*19. Desarrolla un diagrama de flujo que permita determinar a partir de un número de días, introducido
por pantalla, ¿Cuántos años, meses, semanas y días?; constituyen el número de días proporcionado
utilizando la estructura Mientras While.*/

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número de días para saber cuantos años, meses y semanas tiene: ");

        int numIngresado = sc.nextInt();

        int anos = 0, meses = 0, semanas = 0, dias = 0;

        while (numIngresado >= 365) {
            anos++;
            numIngresado -= 365;
        }

        while (numIngresado >= 30) {
            meses++;
            numIngresado -= 30;
        }

        while (numIngresado >= 7) {
            semanas++;
            numIngresado -= 7;
        }

        while (numIngresado >= 1) {
            dias++;
            numIngresado -= 1;
        }

        System.out.printf("Equivalencia: %d años, %d meses, %d semanas, y %d días.%n",
                anos, meses, semanas, dias);

    }
}
