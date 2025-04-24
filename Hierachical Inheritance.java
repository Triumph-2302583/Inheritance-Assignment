/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg3;

/**
 *
 * @author HP
 */
//HIERACHICAL INHERITANCE

public class Ass extends Animal{
    public void meow() {
        System.out.println("meow!");
    }
     public void moo() {
        System.out.println("moo!");

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ass cat = new Ass();
        cat.eat();
        cat.meow();
        
        Ass cow = new Ass();
        cow.eat();
        cow.moo();
      
         
    }  
        
    }

