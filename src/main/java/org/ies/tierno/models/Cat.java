package org.ies.tierno.models;

public class Cat extends Animal {
    protected String color;

    public Cat (String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    @Override
    public void talk() {
        System.out.println("\n¡Miau, miau!\n");
    }

    @Override
    public void showInfo() {
        showAnimalInfo();
        System.out.print(" Color: " + color);
    }
}
