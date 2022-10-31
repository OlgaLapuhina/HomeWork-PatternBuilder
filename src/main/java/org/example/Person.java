package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    private final String name;
    private final String surName;
    private int age;
    private String city;


    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public OptionalInt getAge() {
        if (age == 0) {
            return OptionalInt.of(age);
        }
        return OptionalInt.empty();
    }

    public String getCity() {
        return city;
    }


    public void happyBirthday() {
        age += age;
    }

    public boolean hasAge() {
        if (age == 0) {
            return false;
        }
        return true;
    }

    public boolean hasAddress() {
        if (city == null) {
            return false;
        }
        return true;
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder()
                .setSurName(surName)
                .setAge(0)
                .setCity(city);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, city);
    }
}
