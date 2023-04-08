package com.knoldus;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person person=new Person();
        person.setName("Anshika");
        person.setAge(22);
        System.out.println("Name: "+person.getName()+ " Age: "+person.getAge()+" Adult: "+person.isAdult(person.getAge()));
    }
}
