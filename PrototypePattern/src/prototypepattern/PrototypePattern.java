/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;

import prototypepattern.mir00r.dao.CloneFactory;
import prototypepattern.mir00r.dao.PersonImpl;
import prototypepattern.mir00r.model.Person;
import prototypepattern.mir00r.model.Sheep;

/**
 *
 * @author Created by Mir00r
 */
public class PrototypePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
//        PersonImpl person = new PersonImpl();
//        person.setName("Mick");
//        person.setEmail("mike@yahoo.com");
//        
//        System.out.println("Name -> " +person.getName() +" " + "And Email is -> " +person.getEmail());
//        
//        Person person1 = (Person) person.Clone();
//        
//        person1.setName("Duke");
//        person1.setEmail("duke@yahoo.com");
//        
//        System.out.println("Name -> " +person1.getName() +" " + "And Email is -> " +person1.getEmail());

        try {
            System.out.println("Creating a new object now");
            Person person = new Person("Honda", "honda@gmail.com");
            System.out.println("Object creation done");
            System.out.println("Name -> " + person.getName() + " " + "And Email is -> " + person.getEmail());

            long start = System.currentTimeMillis();
            System.out.println("Creating clone now");

            Person clonedPerson = (Person) person.clone();
            clonedPerson = new Person("Herlay Davidson", "hd@yahoo.com");

            long end = System.currentTimeMillis();
            System.out.println("Time required = " + (end - start));
            System.out.println("Clone created");
            System.out.println("Name -> " + clonedPerson.getName() + " " + "And Email is -> " + clonedPerson.getEmail());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        /* ------------- Another example ------*/
        // Handles routing makeCopy method calls to the 
        // right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance
        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own
        // memory location
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        // These are exact copies of each other
        System.out.println(sally);

        System.out.println(clonedSheep);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));

    }
}
