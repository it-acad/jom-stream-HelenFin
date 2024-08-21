package jom.com.softserve.s6.task2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class MyUtils {
    public static String getDateAfterToday(int years, int months, int days) {
        LocalDate localDate = LocalDate.now();
        Period period = Period.of(years, months, days);
        LocalDate newDate = localDate.plus(period);
        return newDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
