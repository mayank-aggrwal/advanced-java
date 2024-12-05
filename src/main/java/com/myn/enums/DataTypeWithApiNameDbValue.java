package com.myn.enums;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.EnumSet;

public enum DataTypeWithApiNameDbValue {
    STRING("string", "String"),
    INTEGER("integer", "Integer"),
    DOUBLE("double", "Double"),
    BOOLEAN("bool", "Boolean");

    private final String apiName;
    private final String dbValue;
    private static final ImmutableMap<String, DataTypeWithApiNameDbValue> FROM_API_NAME;

    static {
        final ImmutableMap.Builder<String, DataTypeWithApiNameDbValue> fromApiName = ImmutableMap.builder();//ImmutableMap.<String, DataTypeWithApiNameDbValue>builder();
        Arrays.stream(values()).forEach(enumVal -> fromApiName.put(enumVal.getApiName().toLowerCase(), enumVal));
        for (final DataTypeWithApiNameDbValue dataTypeWithApiNameDbValue : EnumSet.allOf(DataTypeWithApiNameDbValue.class)) {
            System.out.println(dataTypeWithApiNameDbValue.getApiName());
        }
        FROM_API_NAME = fromApiName.build();
    }

    DataTypeWithApiNameDbValue(final String apiName, final String dbValue) {
        this.apiName = apiName;
        this.dbValue = dbValue;
    }

    public String getApiName() {
        return apiName;
    }

    public String getDbValue() {
        return dbValue;
    }

    public static DataTypeWithApiNameDbValue fromApiName(final String apiName) {
        return !StringUtils.isBlank(apiName) ? FROM_API_NAME.get(apiName.toLowerCase()) : null;
    }
}
