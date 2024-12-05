package com.myn;

import java.util.Optional;

public class WorkingWithOptional {
    public static void main(String[] args) {
        Optional.ofNullable("Hello")
                .filter(text -> "Hello".equals(text));

        Optional.ofNullable("Hello")
                .ifPresent(text -> System.out.println("Is Present"));

        Optional.ofNullable("Hello")
                .orElse("Hi");

        Optional.ofNullable("Hello")
                .orElseGet(() -> {
                    String a = "Mayank";
                    return a.toLowerCase();
                });

        Optional.ofNullable("Hello")
                .orElseThrow(IllegalArgumentException::new);

        Optional.ofNullable("mayank.agg@gmail.com")
                .ifPresentOrElse(
                        text -> System.out.println("Email Present"),
                        () -> System.out.println("Email Not Present")
                );

        Optional.ofNullable("Hello")
                .map(text -> text.length())
                .filter(len -> len > 6)
                .ifPresentOrElse(
                        len -> System.out.println("Length is: " + len),
                        () -> System.out.println("Length is invalid")
                );

    }
}
