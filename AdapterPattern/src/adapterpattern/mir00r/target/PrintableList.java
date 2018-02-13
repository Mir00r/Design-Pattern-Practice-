/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern.mir00r.target;

import java.util.ArrayList;

/**
 * defines domains-specific interface client uses.
 *
 * @author Created by Mir00r
 */
public interface PrintableList {

    public void printList(ArrayList<String> list);
}
