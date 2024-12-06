Algoritmo Ejercicio19
    Escribir "Introduzca un número para ver cuantos años, meses, semanas y días es:";
    Definir numIngresado Como Entero;
    Leer numIngresado;
    
    Definir year, meses, semanas, dias Como Entero;
    year <- 0;
	meses <- 0;
	semanas <- 0;
	dias <- 0;
	
	Mientras numIngresado >= 365 Hacer
		year <- year + 1;
		numIngresado <- numIngresado - 365;
	Fin Mientras
	
	Mientras numIngresado >= 30 Hacer
		meses <- meses + 1;
		numIngresado <- numIngresado - 30;
	Fin Mientras
	
	Mientras numIngresado >= 7 Hacer
		semanas <- semanas + 1;
		numIngresado <- numIngresado - 7;
	Fin Mientras
	
	Mientras numIngresado >= 1 Hacer
		dias <- dias + 1;
		numIngresado <- numIngresado - 1;
	Fin Mientras
	
	Escribir " Equivale a:";
	Escribir year, " años, ", meses, " meses, ", semanas, " semanas, ", dias, " días."; 
    
FinAlgoritmo