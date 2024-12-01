package Ejercicio8;

/*8. Desarrolla un diagrama de flujo que realice la sumatoria de los números enteros comprendidos
     entre el 1 y el 10, es decir, 1 + 2 + 3 + …. + 10.*/

public class Ejercicio8 {

    public static void main(String[] args) {

        int suma = 0;

        for (int contador = 0; contador < 11; contador++) {
            suma = suma + contador;
        }
        System.out.println("La suma de los número entre el 1 y el 10 es:" + suma);
    }
}
