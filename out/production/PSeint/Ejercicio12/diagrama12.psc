Algoritmo Ejercicio12
	Definir nota Como Entero
	Escribir "Indique una calificación para indicar su calificación:";
	Leer nota
	
	Si nota >= 19 Y nota <= 20 Entonces
		Escribir "La calificación es A";
	SiNo
		Si nota >= 16 Y nota <= 18 Entonces
			Escribir "La calificación es B";
		SiNo
			Si nota >= 13 Y nota <= 15 Entonces
				Escribir "La calificación es C";
			SiNo
				Si nota >= 10 Y nota <= 12 Entonces
					Escribir "La calificación es D";
				SiNo
					Si nota >= 1 Y nota < 10 Entonces
						Escribir "La calificación es E";
					SiNo
						Escribir "La calificación es ERRÓNEA";
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
FinAlgoritmo
