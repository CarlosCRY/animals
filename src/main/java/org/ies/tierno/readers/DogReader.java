package org.ies.tierno.readers;

import org.ies.tierno.models.Dog;

import java.util.Scanner;

public class DogReader {
    private final Scanner scanner;

    public DogReader (Scanner scanner) {
        this.scanner = scanner;
    }

    public Dog read (){
        System.out.println("\nNombre del perro: \n");
        String name = scanner.nextLine();

        System.out.println("\nEdad del perro: \n");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nRaza del perro: \n");
        String race = scanner.nextLine();

        return new Dog(name, age, race);
    }
    
}
