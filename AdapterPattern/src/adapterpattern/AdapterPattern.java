/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

import adapterpattern.mir00r.adapter.PrintableListAdapter;
import adapterpattern.mir00r.target.PrintableList;
import java.util.ArrayList;

/**
 * collaborates with objects conforming to target interface.
 *
 * @author Created by Mir00r
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        PrintableList pl = new PrintableListAdapter();
        pl.printList(list);
    }

}
