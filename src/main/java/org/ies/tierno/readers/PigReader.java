package org.ies.tierno.readers;

import org.ies.tierno.models.Dog;

import java.util.Scanner;

public class PigReader {
    private final Scanner scanner;

    public PigReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public Dog read (){
        System.out.println("\nNombre del cerdo: \n");
        String name = scanner.nextLine();

        System.out.println("\nEdad del cerdo: \n");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nAlimento del cerdo: \n");
        String food = scanner.nextLine();

        return new Dog(name, age, food);
    }
    
}
