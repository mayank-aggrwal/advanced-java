package com.myn;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myn.model.UserCredential;
import com.myn.model.UserCredentialWithDiffSerDes;
import com.myn.model.UserCredentialWithDiffSerDesSansFinal;

public class WorkingWithJsonCreatJsonProp {
    public static void main(String[] args) {
        final ObjectMapper objectMapper = new ObjectMapper();
        String userCredJson = "";
        UserCredential userCredObject;
        UserCredentialWithDiffSerDes userCredObjectDiffSerDes;
        UserCredentialWithDiffSerDesSansFinal userCredObjectDiffSerDesSansFinal;

        try {
            userCredObject = new UserCredential("mayank.aggarwal", "123456");
            userCredJson = objectMapper.writeValueAsString(userCredObject);
            System.out.println("JSON representation: " + userCredJson);

            userCredJson = "{\"user_name\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObject = objectMapper.readValue(userCredJson, UserCredential.class);
            System.out.println("Object representation from String: " + userCredObject);

            userCredJson = "{\"username\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObject = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredential.class);
            System.out.println("Object representation from String: " + userCredObject);

            userCredJson = "{\"username\": \"naman.agg\", \"passwordd\": \"123456\"}";
            userCredObject = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredential.class);
            System.out.println("Object representation from String: " + userCredObject);

            System.out.println("-----------------------------------------------------------------------------------");

            userCredObjectDiffSerDes = new UserCredentialWithDiffSerDes("mayank.aggarwal", "123456");
            userCredJson = objectMapper.writeValueAsString(userCredObjectDiffSerDes);
            System.out.println("JSON representation (Diff Ser Des): " + userCredJson);

            userCredJson = "{\"userName\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDes = objectMapper.readValue(userCredJson, UserCredentialWithDiffSerDes.class);
            System.out.println("Object representation from String (Diff Ser Des): " + userCredObjectDiffSerDes);

            userCredJson = "{\"user-Name\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDes = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDes.class);
            System.out.println("Object representation from String (Diff Ser Des): " + userCredObjectDiffSerDes);

            userCredJson = "{\"user_Name\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDes = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDes.class);
            System.out.println("Object representation from String (Diff Ser Des): " + userCredObjectDiffSerDes);

            userCredJson = "{\"user_name\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDes = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDes.class);
            System.out.println("Object representation from String (Diff Ser Des): " + userCredObjectDiffSerDes);

            System.out.println("-----------------------------------------------------------------------------------");

            userCredObjectDiffSerDesSansFinal = new UserCredentialWithDiffSerDesSansFinal("mayank.aggarwal", "123456");
            userCredJson = objectMapper.writeValueAsString(userCredObjectDiffSerDesSansFinal);
            System.out.println("JSON representation (Diff Ser Des Sans Final): " + userCredJson);

            userCredJson = "{\"userName\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDesSansFinal = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDesSansFinal.class);
            System.out.println("Object representation from String (Diff Ser Des Sans Final): " + userCredObjectDiffSerDesSansFinal);

            userCredJson = "{\"user-name\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDesSansFinal = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDesSansFinal.class);
            System.out.println("Object representation from String (Diff Ser Des Sans Final): " + userCredObjectDiffSerDesSansFinal);

            userCredJson = "{\"user_Name\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDesSansFinal = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDesSansFinal.class);
            System.out.println("Object representation from String (Diff Ser Des Sans Final): " + userCredObjectDiffSerDesSansFinal);

            userCredJson = "{\"user_name\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDesSansFinal = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDesSansFinal.class);
            System.out.println("Object representation from String (Diff Ser Des Sans Final): " + userCredObjectDiffSerDesSansFinal);

            userCredJson = "{\"username\": \"naman.agg\", \"password\": \"123456\"}";
            userCredObjectDiffSerDesSansFinal = new ObjectMapper()
                    .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                    .readValue(userCredJson, UserCredentialWithDiffSerDesSansFinal.class);
            System.out.println("Object representation from String (Diff Ser Des Sans Final): " + userCredObjectDiffSerDesSansFinal);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
