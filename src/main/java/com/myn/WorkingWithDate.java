package com.myn;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Optional;

public class WorkingWithDate {
    public static void main(String[] args) {
        try {
            LocalDate date = LocalDate.now();
            System.out.println(date);

            LocalDateTime dateTime = LocalDateTime.now();
            System.out.println(dateTime);

            date = LocalDate.parse("2024-10-11");
            System.out.println(date);

            date = LocalDate.parse("2024-10-11", DateTimeFormatter.ISO_LOCAL_DATE);
            System.out.println(date);

//            date = LocalDate.parse("2024-10-11", DateTimeFormatter.ISO_DATE);
//            System.out.println(date);

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM uuuu");
            String formattedDate = date.format(formatter);
            System.out.println(date);
            System.out.println("Formatted Date: " + formattedDate);
            date = LocalDate.parse(formattedDate, formatter);
            System.out.println(date);
        } catch (Exception e) {
            System.out.printf("Exception : %s%n", e.getMessage());
            System.out.println(String.format("Exception : %s", e.getMessage()));
        }
    }
}
