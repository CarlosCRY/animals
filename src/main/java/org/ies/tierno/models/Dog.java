package org.ies.tierno.models;

public class Dog extends Animal {
    protected String race;

    public Dog(String name, int age, String race){
        super(name, age);
        this.race = race;
    }

    @Override
    public void talk() {
        System.out.println("\n¡Guau, guau!\n");
    }

    @Override
    public void showInfo() {
        showAnimalInfo();
        System.out.print(" Raza: " + race);
    }
}
