/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern.color_example.implementor;

/**
 *
 * @author Created by Mir00r
 */
public class GreenColor implements Color {

    @Override
    public void applyColor() {
        System.out.println("GREEN.");
    }

}
