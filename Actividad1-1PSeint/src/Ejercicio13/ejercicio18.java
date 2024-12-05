/* Este codigo ha sido generado por el modulo psexport 20230904-mac de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "Ejercicio18.java."

import java.io.*;

public class ejercicio18 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int contador;
		int n;
		double notas;
		double promedio;
		contador = 0;
		notas = 0;
		System.out.println("indica las notas");
		while (contador!=0) {
			System.out.println("Indieque la nota");
			notas = Double.parseDouble(bufEntrada.readLine());
			contador = contador+1;
			System.out.println(notas);
			System.out.println(contador);
		}
	}


}

