/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.pkg2.java;

/**
 *
 * @author HP
 */
//MULTI-LEVEL INHERITANCE
public class LivingThing {
    public void breathe(){
        System.out.print("I can breathe");
    }
}

class Animal extends LivingThing{
    public void move(){
        System.out.println("I can move");
    }
}
