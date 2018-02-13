/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern.mir00r.adapter;

import adapterpattern.mir00r.adaptee.PrintString;
import adapterpattern.mir00r.target.PrintableList;
import java.util.ArrayList;

/**
 * adapts the interface of adaptee to target interface.
 *
 * @author Created by Mir00r
 */
public class PrintableListAdapter implements PrintableList {

    @Override
    public void printList(ArrayList<String> list) {
        //Converting ArrayList<String> to String so that we can pass String to
        // adaptee class
        String listString = "";

        for (String s : list) {
            listString += s + "\t";
        }

        // instantiating adaptee class
        PrintString printString = new PrintString();
        printString.printText(listString);
    }

}
