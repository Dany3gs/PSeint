Algoritmo Ejercicio12
	Definir nota Como Entero
	Escribir "Indique una calificaci�n para indicar su calificaci�n:";
	Leer nota
	
	Si nota >= 19 Y nota <= 20 Entonces
		Escribir "La calificaci�n es A";
	SiNo
		Si nota >= 16 Y nota <= 18 Entonces
			Escribir "La calificaci�n es B";
		SiNo
			Si nota >= 13 Y nota <= 15 Entonces
				Escribir "La calificaci�n es C";
			SiNo
				Si nota >= 10 Y nota <= 12 Entonces
					Escribir "La calificaci�n es D";
				SiNo
					Si nota >= 1 Y nota < 10 Entonces
						Escribir "La calificaci�n es E";
					SiNo
						Escribir "La calificaci�n es ERR�NEA";
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
