package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class ProbarJavaTime {
    public static void main(String[] args) {
//        primera forma de fecha

        LocalDate date = LocalDate.of(2019, 8, 30);
        System.out.println("fecha: " + date);

//        segunda forma de fecha

        LocalDate date2 = LocalDate.of(2019, Month.AUGUST, 30);
        System.out.println("fecha: " + date2);

//        tercera forma de fecha

        LocalDate date3 = LocalDate.parse("1992-08-30");
        System.out.println("fecha -> " + date3);


        System.out.println("fecha -> " + date3);
        System.out.println("fecha: " + date3);
        System.out.println(date.plusDays(2));
        System.out.println(date2.plusMonths(1));
        System.out.println(date3.plusYears(1));
        System.out.println(date3.minusDays(1));
        System.out.println(date3.minusMonths(1));
        System.out.println(date3.minusYears(1));

        LocalDate date4 = LocalDate.of(2019, Month.JULY,7);
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));

        System.out.println(LocalDate.now());

        System.out.println(Period.between(date2, date4).getYears());

//        tiempos


               //        Primera forma de armar tiempos
        LocalTime horaInicio = LocalTime.of(12,0);
        System.out.println("horaInicio -> " + horaInicio);
        LocalTime horaFin = LocalTime.parse("12:00:00.001");
        System.out.println(horaFin);

        System.out.println(horaInicio.plusHours(1));
        System.out.println(horaInicio.minusMinutes(1));
        System.out.println(horaInicio.isBefore(horaFin));

//        revisar


//        Primera forma de armar tiempos
            LocalTime horaInicio2 = LocalTime.of(12,0);
            System.out.println("horaInicio -> " + horaInicio2);
            LocalTime horaFin2 = LocalTime.parse("12:00:00.001");
            System.out.println(horaFin2);

            System.out.println(horaInicio2.plusHours(1));
            System.out.println(horaInicio2.minusMinutes(1));
            System.out.println(horaInicio2.isBefore(horaFin2));



        //Definir una fecha de fabricación y una fecha de expiración
        //Calcular los días, meses, años para que caduque

        LocalDate fecha_fabric = LocalDate.of(2021, 8, 1);
        LocalDate fecha_expira = LocalDate.of(2022, 10, 5);

        System.out.println(Period.between(fecha_fabric, fecha_expira));//Sacar total
        System.out.println("Años: "+Period.between(fecha_fabric, fecha_expira).getYears());//Sólo años
        System.out.println("Meses: "+Period.between(fecha_fabric, fecha_expira).getMonths());//Sólo meses
        System.out.println("Días: "+Period.between(fecha_fabric, fecha_expira).getDays());//Sólo días
        }

}
