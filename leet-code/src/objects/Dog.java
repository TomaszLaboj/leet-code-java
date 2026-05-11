package objects;

import java.util.Objects;

public class Dog {
    String name;
    int age;
    String breed;
    String colour;

    public Dog (String name, int age, String breed, String colour) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed) && Objects.equals(colour, dog.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, breed, colour);
    }
}
