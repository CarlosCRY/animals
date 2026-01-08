package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {
    protected String name;
    protected int age;

    public abstract void talk ();

    public abstract void showInfo ();

    protected void showAnimalInfo () {
        System.out.print("\nNombre: " + name + ", edad: " + age);
    }
}
