package com.knoldus;

public class Person {
    private String name;
    // Fixing typo
    private Integer personAge;

    public Person() {
        this.name=name;
        this.personAge=personAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return personAge;
    }

    public void setAge(Integer age) {
        this.personAge = age;
    }

    public boolean isAdult(Integer age){
        if(age>=18)
            return true;
        else
            return false;
    }
}
