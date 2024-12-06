Algoritmo Ejercicio20
    Escribir "Introduzca un n�mero para ver cuantos a�os, meses, semanas y d�as es:";
    Definir numIngresado Como Entero;
    Leer numIngresado;
    
    Definir year, meses, semanas, dias Como Entero;
    
    Si numIngresado > 0 Entonces
        year <- TRUNC (numIngresado / 365); // Con TRUNC convierte el resultado de la divisi�n en Entero.
        Definir resultadoDias Como Entero;
        resultadoDias <- numIngresado MOD 365;
        
        meses <- TRUNC (resultadoDias / 30);
        resultadoDias <- resultadoDias MOD 30;
        
        semanas <- TRUNC (resultadoDias / 7);
        dias <- resultadoDias MOD 7;
        
        Escribir numIngresado, " Equivale a: ";
        Escribir year, " a�os, ", meses, " meses, ", semanas, " semanas, ", dias, " dias.";
    SiNo
        Escribir "Indique un n�mero mayor a 0";
    Fin Si
FinAlgoritmo