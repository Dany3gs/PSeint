Algoritmo Ejercicio11
	Definir contador Como Entero
	Definir suma Como Entero
	Definir impares Como Entero
	suma <- 0
	impares <- 0
	Para contador<-0 Hasta 300 Con Paso 1 Hacer
		Si contador MOD 2<>0 Entonces
			impares <- impares+contador
		FinSi
	FinPara
	Escribir 'La suma de los números impares entre el 1 y el 300 es: ', impares
FinAlgoritmo
