/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.java;

/**
 *
 * @author HP
 */

//SINGLE INHERITANCE--MAIN PROJECT

public class Dog extends Animal1 {

    public void bark() {
        System.out.println("I can bark");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d = new Dog();
        d.eat();
        d.bark();
    }

}
