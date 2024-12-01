package Ejercicio7;

/*7. Desarrolla un diagrama de flujo que lea cuatro números diferentes
     y a continuación imprima el mayor de los cuatro números introducidos y también el menor de ellos.*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique cuatro números para ver cuál es el mayor y el menor:");

        Double num1;
        Double num2;
        Double num3;
        Double num4;

        System.out.println("Escriba el número 1:");
        num1 = sc.nextDouble();

        System.out.println("Escriba el número 2:");
        num2 = sc.nextDouble();

        System.out.println("Escriba el número 3:");
        num3 = sc.nextDouble();

        System.out.println("Escriba el número 4:");
        num4 = sc.nextDouble();

        if (num1 > num2 && num1 > num3 && num1 > num4) {
            System.out.println("El número 1 con valor " + num1 + " es el mayor.");
        } else if (num2 > num1 && num2 > num3 && num2 > num4) {
            System.out.println("El número 2 con valor " + num2 + " es el mayor.");
        } else if (num3 > num1 && num3 > num2 && num3 > num4) {
            System.out.println("El número 3 con valor " + num3 + " es el mayor.");
        }else {
            System.out.println("El número 4 con valor " + num4 + " es el mayor.");
        }

        if (num1 < num2 && num1 < num3 && num1 < num4) {
            System.out.println("Y el número 1 con valor " + num1 + " es el menor.");
        } else if (num2 < num1 && num2 < num3 && num2 < num4) {
            System.out.println("Y el número 2 con valor " + num2 + " es el menor.");
        } else if (num3 < num1 && num3 < num2 && num3 < num4) {
            System.out.println("Y el número 3 con valor " + num3 + " es el menor.");
        }else {
            System.out.println("Y el número 4 con valor " + num4 + " es el menor.");
        }

    }
}
