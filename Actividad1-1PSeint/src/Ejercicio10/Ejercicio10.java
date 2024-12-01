package Ejercicio10;

/*10. Desarrolla un diagrama de flujo que realice la sumatoria de los números enteros
      pares comprendidos entre el 1 y el 100, es decir, 2 + 4 + 6 +…. + 100. El programa deberá
      imprimir los números en cuestión y finalmente su sumatoria.  */

public class Ejercicio10 {

    public static void main(String[] args) {

        int suma = 0;

        for (int contador = 0; contador <= 100; contador += 2) {
            suma = suma + contador;
        }
        System.out.println("La suma de los números pares entre el 1 y el 100 es: " + suma);
    }
}
