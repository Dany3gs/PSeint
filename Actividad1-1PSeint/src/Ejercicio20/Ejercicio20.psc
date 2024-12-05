Algoritmo Ejercicio20
	
	Escribir "Introduzca un número para ver cuantos años, meses, semanas y días es:";
	
	Definir numIngresado, calculoAno, calculoMes, calculoSemana, calculoDias Como Real;
	
	Leer numIngresado;
	
	Definir year Como Real;
	year <- 365.0;
	Definir meses Como Real;
	meses <- 30.0;
	Definir semanas Como Real;
	semanas <- 7.0;
	Definir dias Como Real;
	dias <- 1.0;
	
	Si numIngresado > 0 Entonces
		calculoAno <- numIngresado / year;
		calculoMes <- numIngresado / meses;
		calculoSemana <- numIngresado / semanas;
		calculoDias <- numIngresado / dias;
		
		Escribir numIngresado, " días son aproximadamente ", calculoAno, " años.";
		Escribir numIngresado, " días son aproximadamente ", calculoMes, " meses.";
		Escribir numIngresado, " días son aproximadamente ", calculoSemana, " semanas.";
		Escribir numIngresado, " días son aproximadamente ", calculoDias, " días."; 
	SiNo
		Escribir "Indique un número mayor a 0";
	Fin Si
  
FinAlgoritmo
