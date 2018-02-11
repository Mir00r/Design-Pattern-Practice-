/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern.mir00r.service;

/**
 * By making this class cloneable you are telling Java that it is ok to copy
 * instances of this class These instance copies have different results when
 * System.identityHashCode(System.identityHashCode(animal)) is called
 *
 * @author Created by Mir00r
 */
public interface Animal extends Cloneable {

    public Animal makeCopy() throws CloneNotSupportedException;
}
