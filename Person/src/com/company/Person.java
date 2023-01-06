package com.company;

public class Person {

    private String first_name;
    private String last_name;
    private int age;

    public void setFirst_name(String first_name) {
        if (first_name.isEmpty()) {
            System.out.println("Empty first name is not allowed");
        } else {
            this.first_name = first_name;
        }

    }

    public void setLast_name(String last_name) {
        if (last_name.isEmpty()) {
            System.out.println("Empty last name is not allowed");
        } else {
            this.last_name = last_name;
        }

    }

    public void setAge(int age) {
        if ((age <= 0) || (age > 100)) {
            System.out.println("Invalid value. Enter value greater than 0 and less or equal to 100");
        } else {
            this.age = age;
        }
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean check_teen() {
        boolean is_teen = false;
        if ((this.age >= 12) && (this.age <= 18)) {
            is_teen = true;
            return is_teen;
        } else {
            return is_teen;
        }
    }


}
