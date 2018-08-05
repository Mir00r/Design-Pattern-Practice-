/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern.vehicle_example.refine_abstraction;

import bridgepattern.vehicle_example.abstraction.Vehicle;
import bridgepattern.vehicle_example.implementor.Workshop;

/**
 *
 * @author Created by Mir00r
 */
// Refine abstraction 2 in bridge pattern
public class Bike extends Vehicle {

    public Bike(Workshop workShop1, Workshop workShop2) {
        super(workShop1, workShop2);
    }

    @Override
    public void manufacture() {
        System.out.print("Bike ");
        workShop1.work();
        workShop2.work();
    }

}
