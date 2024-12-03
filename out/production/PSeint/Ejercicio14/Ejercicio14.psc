Algoritmo Ejercicio14
	
	Dimension array[3]; // Declarar un array con espacio para 3 números
	Escribir "Indique tres números para ordenar de menor a mayor.";
	
	// Llenar el array con los números

	Para i <- 1 Hasta 3 Hacer
		Escribir "Número ", i, ": ";
		Leer array[i];
	Fin Para
	
	// Ordenar el array de menor a mayor usando un método sencillo

	
	Para i <- 1 Hasta 2 Hacer
		Para j <- 1 Hasta 3 - i Hacer
			Si array[j] > array[j +1] Entonces
				aux <- array[j];
				array[j] <- array[j + 1];
				array[j + 1] <- aux;
			FinSi
		FinPara
	Fin Para
	
	
	// Imprimir el array ordenado

	Escribir "El orden es: ";
	Para i <- 1 Hasta 3 Hacer
		Escribir array[i];
	FinPara

	
FinAlgoritmo
