package org.ies.tierno;

import org.ies.tierno.models.Animal;
import org.ies.tierno.readers.AnimalReader;
import org.ies.tierno.readers.DogReader;
import org.ies.tierno.readers.CatReader;
import org.ies.tierno.readers.PigReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogReader dogReader = new DogReader(scanner);
        CatReader catReader = new CatReader(scanner);
        PigReader pigReader = new PigReader(scanner);
        AnimalReader animalReader = new AnimalReader(scanner, dogReader, catReader, pigReader);

        Animal animal = animalReader.read();

        animal.showInfo();
        animal.talk();


    }
}