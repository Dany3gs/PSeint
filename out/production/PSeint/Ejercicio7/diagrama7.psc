Algoritmo Ejercicio7
	
	// 7. Desarrolla un diagrama de flujo que lea cuatro números diferentes 
	//	  y a continuación imprima el mayor de los cuatro números introducidos y también el menor de ellos.
	Escribir "Indique cuatro números para ver cuál es el mayor y el menor:"
	
	Definir num1 Como Real;
	Escribir "Escriba el número 1:"
	Leer num1;
	
	Definir num2 Como Real;
	Escribir "Escriba el número 2:"
	Leer num2;
	
	Definir num3 Como Real;
	Escribir "Escriba el número 3:"
	Leer num3;
	
	Definir num4 Como Real;
	Escribir "Escriba el número 4:"
	Leer num4;
	
	Si num1 > num2 Y num1 > num3 Y num1 > num4 Entonces
		Escribir "El número 1 con valor ", num1,  " es el mayor"
	SiNo
		Si num2 > num1 Y num2 > num3 Y num2 > num4 Entonces
			Escribir "El número 2 con valor ", num2,  " es el mayor"
		SiNo
			Si num3 > num1 Y num3 > num2 Y num3 > num4  Entonces
				Escribir "El número 3 con valor ", num3,  " es el mayor"
			SiNo
				Escribir "El número 4 con valor ", num4,  " es el mayor"
			Fin Si
		Fin Si
	Fin Si
	
	Si num1 < num2 Y num1 < num3 Y num1 < num4 Entonces
		Escribir "Y el número 1 con valor ", num1,  " es el menor"
	SiNo
		Si num2 < num1 Y num2 < num3 Y num2 < num4 Entonces
			Escribir "Y el número 2 con valor ", num2,  " es el menor"
		SiNo
			Si num3 < num1 Y num3 < num2 Y num3 < num4  Entonces
				Escribir "Y el número 3 con valor ", num3,  " es el menor"
			SiNo
				Escribir "Y el número 4 con valor ", num4,  " es el menor"
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo
