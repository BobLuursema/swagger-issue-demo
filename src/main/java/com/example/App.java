package com.example;

import io.swagger.v3.core.converter.ModelConverters;

public class App {
    public static void main(String[] args) {
        var schema = ModelConverters.getInstance().read(Event.class).get("Event");
        schema.getProperties().forEach((key, value) -> {
            System.out.println(key);
        });
    }
}
