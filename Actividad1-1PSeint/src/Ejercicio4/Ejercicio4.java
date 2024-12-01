package Ejercicio4;

//4. Hallar uno de los lados de un rectángulo cuya área es de 15 cm2 y uno de sus lados mide 3 cm.

public class Ejercicio4 {

    public static void main(String[] args) {

        int area = 15;
        int ladoConocido = 3;
        int hallarLado = area / ladoConocido;

        System.out.println("La medida del lado que queremos hallar es: " + hallarLado + " cm");
    }
}
