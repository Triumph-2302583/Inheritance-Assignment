/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg3;

/**
 *
 * @author HP
 */
//HIERACHICAL INHERITANCE

public class Animal {

    public void eat() {
        System.out.println("I can eat");
    }
}

class Cow extends Animal {

    public void moo() {
        System.out.println("moo!");

    }
}

class Cat extends Animal {

    public void meow() {
        System.out.println("meow!");
    }
}
