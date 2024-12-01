package Ejercicio5;

//5. Hallar el área y el perímetro de un círculo cuyo radio mide 2 cm.

public class Ejercicio5 {

    public static void main(String[] args) {

        double radio = 2;
        double area = Math.PI *(radio *radio);
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo con radio de 2 cm es: " + String.format("%.2f", area));
        System.out.println("El perímetro del círculo con radio de 2 cm es: " + String.format("%.2f", perimetro));

    }
}
