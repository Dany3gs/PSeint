package Ejercicio9;

/*9. Desarrolla un diagrama de flujo que realice la sumatoria de los números enteros múltiplos de 5,
     comprendidos entre el 1 y el 100, es decir, 5 + 10 + 15 +…. + 100. El diagrama de flujo deberá imprimir
     los números en cuestión y finalmente su sumatoria. */

public class Ejercicio9 {

    public static void main(String[] args) {

        int suma = 0;

        for (int contador = 0; contador <= 100; contador += 5) {
            suma = suma + contador;
        }
        System.out.println("La suma de los números múltiplos de 5 entre el 1 y el 100 es: " + suma);
    }
}
