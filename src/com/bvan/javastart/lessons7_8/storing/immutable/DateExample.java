package com.bvan.javastart.lessons7_8.storing.immutable;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class DateExample { // Immutable

    public static void main(String[] args) {
        // Java 8 (2013)

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("------------");

        LocalDate date = LocalDate.now();
        LocalDate dateYearAgo = date.minusYears(1);
        System.out.println("date = " + date);
        System.out.println("dateYearAgo = " + dateYearAgo);

        System.out.println("-------------");

        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 8);
        DayOfWeek dayOfWeek = elvisBirthDate.getDayOfWeek();
        System.out.println(dayOfWeek.plus(10));

        LocalDate beginning = LocalDate.of(0, 1, 1);
        System.out.println(beginning.getDayOfWeek());
    }
}
