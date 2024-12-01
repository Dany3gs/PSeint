package Ejercicio15;

/*15. Desarrolla un diagrama de flujo que permita realizar la escritura de los primeros 100 números naturales
utilizando la estructura Mientras (While). */

public class Ejercicio15 {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }
}
