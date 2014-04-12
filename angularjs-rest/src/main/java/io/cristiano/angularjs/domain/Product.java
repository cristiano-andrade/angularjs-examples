package io.cristiano.angularjs.domain;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Product {

    private String code;
    private String title;
    private String description;
    private Double price;
    private Double discount;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("code='").append(code).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", discount=").append(discount);
        sb.append('}');
        return sb.toString();
    }

    public String toJSONString() {
        StringWriter writer = new StringWriter();
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(writer, this);
        } catch (IOException e) {
            throw new RuntimeException();
        }
        return writer.toString();
    }
}
