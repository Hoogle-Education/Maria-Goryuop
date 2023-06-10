package org.example;

import org.example.models.Animal;
import org.example.models.Cat;
import org.example.models.Dog;
import org.example.models.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Joazinho da silva", 20);
        Cat myCat = new Cat("garfield", "orange");
        Dog myDog = new Dog("Thor", "white");

        // (nao funciona mais)
        // Animal myAnimal = new Animal("thomas");

        // upcasting - mencionar um classe filha por sua mae
        Animal a = myCat;

        a.makeNoise();

        // downcasting - mencionar uma classe mae numa classe filha
        Cat myCat2 = (Cat)a;

        Animal[] myAnimals = new Animal[2];
        myAnimals[0] = myCat;
        myAnimals[1] = myDog;

        for (int i = 0; i < 2; i++) {
            System.out.println(myAnimals[i]);
        }
    }
}