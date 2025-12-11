package org.ies.tierno;

import org.ies.tierno.models.Cat;
import org.ies.tierno.models.Dog;
import org.ies.tierno.models.Pig;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("Garfield", 47, "Atigrado");
        Dog dog = new Dog ("Dogbert", 36, "Supremacista");
        Pig pig = new Pig ("Capitalista", 249, "Dinero");

        cat.showInfo();
        cat.talk();

        dog.showInfo();
        dog.talk();

        pig.showInfo();
        pig.talk();
    }
}