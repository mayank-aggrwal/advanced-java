package com.myn;

import com.google.common.collect.*;
import org.apache.commons.lang3.ObjectUtils;

import java.util.List;

public class WorkingWithImmutableGuavaApi {
    public static void main(String[] args) {
        ImmutableMultimap<String, String> eateries = ImmutableSetMultimap.<String, String>builder()
                .putAll("fruits", "mango", "banana", "guava")
                .putAll("vegies", "gourd", "brinjal", "ladyfinger")
                .build();
        System.out.println(eateries); // {fruits=[mango, banana, guava], vegies=[gourd, brinjal, ladyfinger]}
        System.out.println(eateries.get("fruits"));

        ImmutableList<String> fruits = eateries.get("fruits").asList();
        System.out.println(fruits);

        ImmutableMultimap<String, String> eateries2 = ImmutableMultimap.<String, String>builder()
                .putAll("fruits", "mango", "banana", "guava", "guava")
                .putAll("fruits", "guava")
                .build();
        System.out.printf("eateries2: %s\n", eateries2);


        ImmutableSetMultimap<String, String> eateries3 = ImmutableSetMultimap.<String, String>builder()
                .putAll("fruits", "mango", "banana", "guava", "guava", "guava")
                .build();
        System.out.printf("eateries3: %s\n", eateries3);

        ImmutableMultimap<String, String> eateries4 = ObjectUtils.defaultIfNull(null, eateries2);
        System.out.println(eateries4);
    }
}
