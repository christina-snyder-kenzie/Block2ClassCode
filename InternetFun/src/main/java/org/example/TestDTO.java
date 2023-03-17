package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class TestDTO {


    @JsonProperty("age")
    private int age;
    @JsonProperty("name")
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
