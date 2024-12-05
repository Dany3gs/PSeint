Algoritmo Ejercicio18

    Definir suma, contador, nota, promedio Como Real;
    
    suma <- 0;
    contador <- 0;
	
    // Bucle para ingresar notas Do While
    Repetir
        Escribir "Ingresa una nota (o escribe 0 para terminar):";
        Leer nota;
		
        // Verificar si se debe continuar
        Si nota <> 0 Entonces
            suma <- suma + nota;
            contador <- contador + 1;
        Fin Si
    Hasta Que nota = 0;
	
    // Verificar si se ingresaron notas para calcular el promedio
    Si contador > 0 Entonces
        promedio <- suma / contador;
        Escribir "El promedio de las notas es: ", promedio;
    SiNo
        Escribir "No se ingresaron notas.";
    Fin Si
	
FinAlgoritmo
