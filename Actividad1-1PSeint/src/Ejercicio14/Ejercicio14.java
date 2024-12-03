package Ejercicio14;

/*14. Desarrolla un diagrama de flujo que permita leer 3 números
      y ordenarlos de menor a mayor, si es el caso*/

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique tres números para ordenar de menor a mayor:");

        int[] array = new int[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indique número: " + (i + 1));
            array[i] = sc.nextInt();
        }

        // Ordenar el array de menor a mayor usando método burbuja
        for (int i = 0; i < array.length - 1; i++) { //solo necesitamos la penultima posición
            for (int j = 0; j < array.length - 1 - i; j++) { //asegura que j+1 este en rango
                if (array[j] > array[j + 1]) {
                    //intercambiamos elementos
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        System.out.println("El orden de menor a mayor es:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
