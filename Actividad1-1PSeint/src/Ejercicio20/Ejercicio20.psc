Algoritmo Ejercicio20
	
	Escribir "Introduzca un n�mero para ver cuantos a�os, meses, semanas y d�as es:";
	
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
		
		Escribir numIngresado, " d�as son aproximadamente ", calculoAno, " a�os.";
		Escribir numIngresado, " d�as son aproximadamente ", calculoMes, " meses.";
		Escribir numIngresado, " d�as son aproximadamente ", calculoSemana, " semanas.";
		Escribir numIngresado, " d�as son aproximadamente ", calculoDias, " d�as."; 
	SiNo
		Escribir "Indique un n�mero mayor a 0";
	Fin Si
  
FinAlgoritmo
