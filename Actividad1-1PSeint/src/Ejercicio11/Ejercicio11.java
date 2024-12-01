package Ejercicio11;

/*11. Desarrolla un diagrama de flujo que lea los primeros 300 números enteros
      y determine cuántos de ellos son impares; al final deberá indicar su sumatoria.*/

public class Ejercicio11 {

    public static void main(String[] args) {

        int impares = 0;

        for (int contador = 0; contador <= 300; contador++) {
            if (contador % 2 != 0){
                impares += contador;
            }
        }
        System.out.println("La suma de los números impares entre el 1 y el 300 es: " + impares);
    }
}
