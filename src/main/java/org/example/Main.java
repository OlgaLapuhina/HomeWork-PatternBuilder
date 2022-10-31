package org.example;

public class Main {
    public static void main(String[] args) {

        PersonBuilder personBuilder = new PersonBuilder();

        Person mom = personBuilder
                .setName("Olya")
                .setSurName("Skvortsova")
                .setAge(40)
                .build();
        Person daughter = mom.newChildBuilder()
                .setName("Kira")
                .build();

        System.out.println(mom + "\n" + daughter);
    }
}