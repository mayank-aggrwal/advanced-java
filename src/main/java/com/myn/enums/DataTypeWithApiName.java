package com.myn.enums;

public enum DataTypeWithApiName {
    STRING("string"),
    DATE("date"),
    INTEGER("int"),
    DOUBLE("double"),
    BOOLEAN("bool");

    private final String apiName;

    DataTypeWithApiName(final String apiName) {
        this.apiName = apiName;
    }

    public String getApiName() {
        return this.apiName;
    }
}
