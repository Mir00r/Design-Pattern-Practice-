/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern.color_example.abstraction;

import bridgepattern.color_example.implementor.Color;

/**
 *
 * @author Created by Mir00r
 */
public abstract class Shape {

    //Composition - implementor
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();
}
