Algoritmo Ejercicio14
	Dimensionar array(3)
	Escribir 'Indique tres n�meros para ordenar de menor a mayor.' // Declarar un array con espacio para 3 n�meros
	// Llenar el array con los n�meros
	Para i<-1 Hasta 3 Hacer
		Escribir 'N�mero ', i, ': '
		Leer array[i]
	FinPara
	// Ordenar el array de menor a mayor usando un m�todo sencillo
	Para i<-1 Hasta 2 Hacer
		Para j<-1 Hasta 3-i Hacer
			Si array[j]>array[j+1] Entonces
				aux <- array[j]
				array[j] <- array[j+1]
				array[j+1]<-aux
			FinSi
		FinPara
	FinPara
	// Imprimir el array ordenado
	Escribir 'El orden es: '
	Para i<-1 Hasta 3 Hacer
		Escribir array[i]
	FinPara
FinAlgoritmo
