package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {
    protected String name;
    protected int age;

    protected abstract void talk ();

    protected abstract void showInfo ();

    protected void showAnimalInfo () {
        System.out.print("\nNombre: " + name + ", edad: " + age);
    }
}
