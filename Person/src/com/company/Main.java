package com.company;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.setAge(15);
        person.setFirst_name("");
        person.setLast_name("Yoko");
        int age = person.getAge();
        String first_name = person.getFirst_name();
        String last_name = person.getLast_name();
        boolean is_teen = person.check_teen();
        System.out.println("age = " + age);
        System.out.println("First name = " + first_name);
        System.out.println("Last name = " + last_name);
        System.out.println(is_teen);
    }
}
