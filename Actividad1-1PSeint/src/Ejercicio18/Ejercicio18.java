package Ejercicio18;

/*18. Desarrolla un diagrama de flujo que permita calcular Promedio de Notas; finaliza cuando N = 0.*/

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double suma, contador, nota, promedio;

        suma = 0.0;
        contador = 0.0;

      do {
          System.out.println("Ingresa una nota (o escribe 0 para terminar):");
          nota = sc.nextDouble();
          if (nota != 0) {
              suma = suma + nota;
              contador = contador + 1;
          }
      } while (nota != 0);

      if (contador > 0) {
          promedio = suma / contador;
          System.out.println("El promedio de las notas es: " + promedio);
      } else {
          System.out.println("No se ingresaron notas.");
      }
    }
}
