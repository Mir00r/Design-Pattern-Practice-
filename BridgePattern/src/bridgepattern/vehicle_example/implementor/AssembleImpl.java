/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern.vehicle_example.implementor;

/**
 *
 * @author Created by Mir00r
 */
public class AssembleImpl implements Workshop {

    @Override
    public void work() {
        System.out.print(" And");
        System.out.println(" Assembled.");
    }
}
