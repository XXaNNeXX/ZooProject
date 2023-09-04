package org.example;

public record Animal(

        String id,
        String name,
        String type,
        int age,
        Owner owner,
        Species species
) {
}
