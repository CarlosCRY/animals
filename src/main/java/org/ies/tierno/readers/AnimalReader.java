package org.ies.tierno.readers;

import lombok.AllArgsConstructor;
import org.ies.tierno.models.Animal;

import java.util.Scanner;

@AllArgsConstructor
public  class AnimalReader {
    private final Scanner scanner;
    private final DogReader dogReader;
    private final CatReader catReader;
    private final PigReader pigReader;

    public Animal read () {
        int option;
        while (true) {
            System.out.println("Tipos de animales:\n");
            System.out.println("1. Perro.\n2. Gato.\n3. Cerdo.");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    return dogReader.read();
                case 2:
                    return catReader.read();
                case 3:
                    return pigReader.read();
                default:
                    System.out.println("\nNo es una opción válida\n");
            }
        }
    }
}
