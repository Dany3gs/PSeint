package Ejercicio16;

/*16. Desarrolla un diagrama de flujo que permita leer un valor
      entero positivo N y determinar si es primo o no*/

import java.util.Scanner;
import java.util.SortedMap;

public class Ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Indique un númeró para ver si es primo.");
        number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("El número " + number + " es primo.");
        } else {
            System.out.println("El número " + number + " no es primo.");
        }
    }
}
