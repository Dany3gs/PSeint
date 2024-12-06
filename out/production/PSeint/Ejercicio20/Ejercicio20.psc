Algoritmo Ejercicio20
    Escribir "Introduzca un número para ver cuantos años, meses, semanas y días es:";
    Definir numIngresado Como Entero;
    Leer numIngresado;
    
    Definir year, meses, semanas, dias Como Entero;
    
    Si numIngresado > 0 Entonces
        year <- TRUNC (numIngresado / 365); // Con TRUNC convierte el resultado de la división en Entero.
        Definir resultadoDias Como Entero;
        resultadoDias <- numIngresado MOD 365;
        
        meses <- TRUNC (resultadoDias / 30);
        resultadoDias <- resultadoDias MOD 30;
        
        semanas <- TRUNC (resultadoDias / 7);
        dias <- resultadoDias MOD 7;
        
        Escribir numIngresado, " Equivale a: ";
        Escribir year, " años, ", meses, " meses, ", semanas, " semanas, ", dias, " dias.";
    SiNo
        Escribir "Indique un número mayor a 0";
    Fin Si
FinAlgoritmo