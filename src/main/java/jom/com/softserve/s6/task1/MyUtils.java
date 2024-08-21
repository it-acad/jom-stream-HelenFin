package jom.com.softserve.s6.task1;

import java.time.LocalDate;

public class MyUtils {

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
