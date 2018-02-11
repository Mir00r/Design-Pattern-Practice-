/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern.mir00r.service;

/**
 *
 * @author Created by Mir00r
 */
public interface Prototype extends Cloneable {

    //Object Clone();
    public Prototype clone() throws CloneNotSupportedException;

}
