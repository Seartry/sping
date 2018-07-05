package com.pectera.common.pojo;

import java.util.Date;

public class Student {
    private Long id;
    private String name;
    private Date birthday;
    private char sex;
    private Long c_id;

    public Student() {
    }

    public Student(Long id, String name, Date birthday, char sex, Long c_id) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.c_id = c_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                ", c_id=" + c_id +
                '}';
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Long getC_id() {
        return c_id;
    }

    public void setC_id(Long c_id) {
        this.c_id = c_id;
    }
}
