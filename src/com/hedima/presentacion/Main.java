package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

//        Metodos de la clase Spring
        String frase = "La casa verde";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("Longitud de la frase: " + frase.length());
        System.out.println(frase.substring(0, 2));
        System.out.println("("+frase.substring(3, 7) + ")");
        System.out.println("posicion de la s: " + frase.indexOf("s"));
        System.out.println("posicion de la a: " + frase.indexOf("a"));
        System.out.println("posicion de la a: " + frase.lastIndexOf("a"));

// Ejercicio
        String frase2 = "Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(frase2.toUpperCase());
        System.out.println(frase2.toLowerCase());
        System.out.println(frase2.substring(0, 5));
        System.out.println(frase2.substring(16, 21));
        System.out.println(frase2.substring(31, 37));
        System.out.println("posicion de la 'N': " + frase2.indexOf('N'));
        System.out.println("Longitud de la frase2: " + frase2.length());

// Resultado
        String texto = "Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println("Todo mayúsculas: " + texto.toUpperCase());
        System.out.println("Todo minusculas: " + texto.toLowerCase());
        System.out.println("Mostrar solo primera palabra: " + texto.substring(0, texto.indexOf(" ")));
        System.out.println("Extraer palabra 'mosca': (" + texto.substring(16, 21) +")");
        System.out.println("Mostrar solo la palabra mosca : (" + texto.substring(texto.indexOf("mosca"), texto.indexOf("mosca")+"mosca".length())+")");
        System.out.println("Extraer palabra 'cabeza': " + texto.substring(31, 37));
        System.out.println("Mostrar la palabra cabeza : (" + texto.substring(texto.indexOf("cabeza"), texto.indexOf("cabeza")+"cabeza".length())+ ")");
        System.out.println("Posición de la primera letra 'm':" + texto.indexOf('m'));
        System.out.println("La longitud de la cadena es: " + texto.length());

//        Fechas

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

    }

}