package org.example;

public class Human {
    private String name;
    private int age;
    private String gender;
    private int height;

    public Human(String name, int age, String gender, int height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public String myName (String name){
        return "my name is " + name;
    }

    public int myAge (int age){
        return age + 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
