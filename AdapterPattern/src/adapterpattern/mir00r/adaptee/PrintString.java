/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern.mir00r.adaptee;

/**
 * defines existing interface that needs adapting
 *
 * @author Created by Mir00r
 */
public class PrintString {

    public void printText(String str) {
        System.out.println("Print String from Adaptee class -> " + str);
    }
}
