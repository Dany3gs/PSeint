Algoritmo Ejercicio12
	Definir nota Como Entero
	Escribir "Indique una calificaci�n para indicar su calificaci�n:";
	Leer nota
	
	Definir continuar Como Logico;
	continuar <- Verdadero;
	
	Mientras nota >= 19 Y nota <= 20 Y continuar Hacer
		Escribir "La calificaci�n es A";
		continuar <- Falso;
	FinMientras
	
	Mientras nota >= 16 Y nota <= 18 Y continuar Hacer
		Escribir "La calificaci�n es B";
		continuar <- Falso;
	Fin Mientras
	
	Mientras nota >= 13 Y nota <= 15 Y continuar Hacer
		Escribir "La calificaci�n es C";
		continuar <- Falso;
	Fin Mientras
	
	Mientras nota >= 10 Y nota <= 12 Y continuar Hacer
		
		Escribir "La calificaci�n es D";
		continuar <- Falso;
	Fin Mientras
	
	Mientras nota >= 1 Y nota < 10 Y continuar Hacer
		Escribir "La calificaci�n es D";
		continuar <- Falso;
	Fin Mientras
	
		
	Si nota <= 0 O nota > 20 Entonces
		Escribir "La calificaci�n es ERR�NEA";
	Fin Si
			
FinAlgoritmo
