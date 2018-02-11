/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern.mir00r.dao;

import prototypepattern.mir00r.service.Animal;

/**
 *
 * @author Created by Mir00r
 */
public class CloneFactory {

    /**
     * Receives any Animal, or Animal subclass and makes a copy of it and stores
     * it in its own location in memory CloneFactory has no idea what these
     * objects are except that they are subclasses of Animal
     *
     * @param animalSample
     * @return
     */
    public Animal getClone(Animal animalSample) throws CloneNotSupportedException {
        // Because of Polymorphism the Sheeps makeCopy()
        // is called here instead of Animals
        return animalSample.makeCopy();
    }
}
