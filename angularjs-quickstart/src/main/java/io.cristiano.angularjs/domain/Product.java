package io.cristiano.angularjs.domain;


import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Product {
    private String code;
    private String description;
    private String title;
    private Double price;
    private Double discount;

    public String toJsonString(){
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(writer,this);
        } catch (IOException e) {
            throw new RuntimeException("Error when generate JSON " + e.getMessage());
        }
        return writer.toString();
    }
}
