package com.pectera.spring.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    private Long id;
    private Value value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Quote() {
    }

    public Quote(Long id, Value value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
