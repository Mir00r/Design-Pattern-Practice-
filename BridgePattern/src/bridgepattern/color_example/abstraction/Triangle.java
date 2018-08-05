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
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
