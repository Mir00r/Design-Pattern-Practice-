/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern.vehicle_example.abstraction;

import bridgepattern.vehicle_example.implementor.Workshop;

/**
 *
 * @author Created by Mir00r
 */
// abstraction in bridge pattern
public abstract class Vehicle {

    protected Workshop workShop1;
    protected Workshop workShop2;

    public Vehicle(Workshop workShop1, Workshop workShop2) {
        this.workShop1 = workShop1;
        this.workShop2 = workShop2;
    }

    abstract public void manufacture();
}
