package com.myn.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static LocalDate toLocalDate(final String dateString, final DateTimeFormatter formatter) {
        return LocalDate.parse(dateString, formatter);
    }

    public static String toDateString(final LocalDate date, final DateTimeFormatter formatter) {
        return date.format(formatter);
    }
}
