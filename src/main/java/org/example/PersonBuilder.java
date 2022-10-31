package org.example;

public class PersonBuilder {
    private String name;
    private String surName;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurName() {
        return surName;
    }

    public PersonBuilder setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Введен некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public String getCity() {
        return city;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (surName == null) {
            throw new IllegalStateException("Фамилию вводить обязательно");
        }
        if (name == null) {
            throw new IllegalStateException("Имя вводить обязательно");
        }
        Person person = new Person(name, surName);
        person.setAge(age);
        person.setCity(city);
        return person;
    }
}


