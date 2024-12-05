package com.myn;

import com.myn.enums.DataType;

public class WorkingWithEnum {
    public static void main(String[] args) {
        DataType type = DataType.STRING;
        System.out.println(type.name());
        System.out.println(type.ordinal());

        type = DataType.INTEGER;
        System.out.println(type.name());
        System.out.println(type.toString());
        System.out.println(type.ordinal());

        DataType[] values = DataType.values();
        for (DataType dataType : values) {
            System.out.println(dataType.name());
        }

        try {
            System.out.println(DataType.valueOf("double"));
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.toString() + ", " + e.getMessage());
        }

        System.out.println(DataType.valueOf("DOUBLE"));

        System.out.println("LIST_OF_STRING".toLowerCase());
    }
}
