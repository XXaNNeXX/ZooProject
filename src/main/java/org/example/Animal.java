package org.example;

public record Animal(

        String id,
        String name,
        String type,
        int age,
        Owner owner,
        Species species
) {

    public Animal withID(String id) {
        return new Animal(id, name(), type(), age(), owner(), species());
    }

    public Animal withName(String name) {
        return new Animal(id(), name, type(), age(), owner(), species());
    }

    public Animal withType(String type) {
        return new Animal(id(), name(), type, age(), owner(), species());
    }

    public Animal withAge(int age) {
        return new Animal(id(), name(), type(), age, owner(), species());
    }

    public Animal withOwner(Owner owner) {
        return new Animal(id(), name(), type(), age(), owner, species());
    }

    public Animal withSpecies(Species species) {
        return new Animal(id(), name(), type(), age(), owner(), species);
    }
}
