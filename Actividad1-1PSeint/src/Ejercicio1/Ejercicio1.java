package Ejercicio1;

//1. Elaborar un diagrama de ujo para calcular el área de cualquier
//   triángulo rectángulo y presentar el resultado en pantalla.

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("Indica la base y la altura para calcular el área de un triángulo rectángulo.");
        System.out.println("Indica la base: ");
        base = sc.nextDouble();
        System.out.println("Indica la altura:");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("Se ha indicado una base de " + base + " y una altura de " + altura);
        System.out.println("El área es: " + area);
    }
}
