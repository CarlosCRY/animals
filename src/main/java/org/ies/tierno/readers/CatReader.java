package org.ies.tierno.readers;

import org.ies.tierno.models.Dog;

import java.util.Scanner;

public class CatReader {
    private final Scanner scanner;

    public CatReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Dog read (){
        System.out.println("\nNombre del gato: \n");
        String name = scanner.nextLine();

        System.out.println("\nEdad del gato: \n");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nColor del gato: \n");
        String color = scanner.nextLine();

        return new Dog(name, age, color);
    }
    
}
