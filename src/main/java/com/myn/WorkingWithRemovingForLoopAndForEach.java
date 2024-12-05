package com.myn;

import java.util.Arrays;

public class WorkingWithRemovingForLoopAndForEach {
    public static void main(String[] args) {
        final String [] FORBIDDEN_WORDS = {"shit", "black", "racist"};
        System.out.println(FORBIDDEN_WORDS);
        String username = "mayank.aggarwalblack";

        // DON'T USE THIS
        for (String forbiddenWord : FORBIDDEN_WORDS) {
            if (username.contains(forbiddenWord)) {
                System.out.println("Contains Forbidden word");
                break;
            }
        }


        // USE THIS
        boolean isPresent = Arrays.stream(FORBIDDEN_WORDS)
                .anyMatch(fw -> fw.contains(username));
        System.out.println(isPresent);
    }
}
