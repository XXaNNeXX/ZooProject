package org.example;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal("C123", "Kitty", "Hauskatze", 3, null, null);
        Animal dog = new Animal("D456", "Bello", "Labrador", 5, null, null);
        Animal guineaPig = new Animal("GP789", "Lilly", "Guinea Pig", 2, null, null);

        System.out.println(cat.name());
        System.out.println(dog.id());
        System.out.println(dog.equals(guineaPig));
        System.out.println(guineaPig);

        Owner owner1 = new Owner("Paul", 33, "Hauptstraße 1");
        Owner owner2 = new Owner("Lea", 56, "Wiesenweg 3");
        Owner owner3 = new Owner("Tim", 5, "Vogelsang 88");

        Animal cat2 = new Animal(cat.id(), cat.name(), cat.type(), cat.age(), owner1, null
        );
        Animal dog2 = new Animal(dog.id(), dog.name(), dog.type(), dog.age(), owner2, null
        );
        Animal guineaPig2 = new Animal(guineaPig.id(), guineaPig.name(), guineaPig.type(), guineaPig.age(), owner3, null
        );

        System.out.println(cat2);
        System.out.println(dog2);
        System.out.println(guineaPig2);

        Species species1 = new Species("Vierbeiner", 500);
        Species species2 = new Species("Nager", 40);

        Animal cat3 = new Animal(cat.id(), cat.name(), cat.type(), cat.age(), owner1, species1);
        Animal cat4 = new Animal(cat.id(), cat.name(), cat.type(), cat.age(), owner1, species1);
        Animal dog3 = new Animal(dog.id(), dog.name(), dog.type(), dog.age(), owner2, species1);
        Animal guineaPig3 = new Animal(guineaPig.id(), guineaPig.name(), guineaPig.type(), guineaPig.age(), owner3, species2);

        System.out.println(cat3);
        System.out.println(dog3);
        System.out.println(guineaPig3);
        System.out.println(cat3.equals(cat4));
        System.out.println(cat3.withID("987"));
        System.out.println(guineaPig3.withSpecies(species1));
    }
}