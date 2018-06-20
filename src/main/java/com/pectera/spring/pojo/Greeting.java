package com.pectera.spring.pojo;

public class Greeting {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Greeting() {

    }

    public Greeting(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
