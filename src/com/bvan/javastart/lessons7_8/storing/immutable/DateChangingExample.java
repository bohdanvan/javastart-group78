package com.bvan.javastart.lessons7_8.storing.immutable;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class DateChangingExample { // Immutable

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = changeDate(now);
        System.out.println(now);
    }

    public static LocalDate changeDate(LocalDate date) {
        return date.plusYears(100);
    }
}
