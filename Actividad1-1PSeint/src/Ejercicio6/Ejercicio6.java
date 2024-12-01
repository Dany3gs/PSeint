package Ejercicio6;

//6. Hallar el área de un pentágono regular de 6 cm de lado y con 4 cm de apotema.

public class Ejercicio6 {

    public static void main(String[] args) {

        double perimetro;
        double lado = 6;
        double apotema = 4;
        double area;

        perimetro = 5 * lado;

        area = (perimetro * apotema) / 2;

        System.out.println("El área de un péntagono regular de 6 cm de lado y 4 de apotema es: " + area + " cm2");

    }
}
