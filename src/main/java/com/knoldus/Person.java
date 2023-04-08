package com.knoldus;

public class Person {
    private String name;
    private Integer age;

    public Person() {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isAdult(Integer age){
        if(age>=18)
            return true;
        else
            return false;
    }
}
