/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg2.java;

/**
 *
 * @author HP
 */
//MULTI-LEVEL INHERITANCE
public class Horse extends Animal {

    public void gallop() {
        System.out.println("I can gallop");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Horse h = new Horse();
        h.gallop();
        h.move();
        h.breathe();
        
    }
}
