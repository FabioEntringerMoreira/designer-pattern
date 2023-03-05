package com.company.filter.enums;

public class Pessoa {

    private String Name;
    private Integer age;
    private String address;

    public Pessoa(String name, Integer age, String address) {
        Name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
