/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern.mir00r.model;

import prototypepattern.mir00r.service.Animal;

/**
 *
 * @author Created by Mir00r
 */
public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is Made ...... ha ha ha ..... ");
    }

    @Override
    public Animal makeCopy() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    @Override
    public String toString() {
        return "Dad is my hero .... ... .. . ";
    }
    
}
