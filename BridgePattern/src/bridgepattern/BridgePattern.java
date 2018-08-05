/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern;

import bridgepattern.color_example.abstraction.Pentagon;
import bridgepattern.color_example.abstraction.Shape;
import bridgepattern.color_example.abstraction.Triangle;
import bridgepattern.color_example.implementor.GreenColor;
import bridgepattern.color_example.implementor.RedColor;
import bridgepattern.vehicle_example.abstraction.Vehicle;
import bridgepattern.vehicle_example.implementor.AssembleImpl;
import bridgepattern.vehicle_example.implementor.ProduceImpl;
import bridgepattern.vehicle_example.refine_abstraction.Bike;
import bridgepattern.vehicle_example.refine_abstraction.Car;
import bridgepattern.weapon_example.enchantment_service.FlyingEnchantmentImpl;
import bridgepattern.weapon_example.enchantment_service.SoulEatingEnchantmentImpl;
import bridgepattern.weapon_example.weapon_service.HammerImpl;
import bridgepattern.weapon_example.weapon_service.SwordImpl;

/**
 *
 * @author Created by Mir00r
 */
public class BridgePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--*--*-*--*--*-*--*--*--*-*- Weapon Example ----*--*--*---*--*--*-*--*--*--*-*--*--*");
        SwordImpl enchantedSword = new SwordImpl(new SoulEatingEnchantmentImpl());
        enchantedSword.wield();
        enchantedSword.swing();
        enchantedSword.unwield();

        System.out.println("----------------------------------------------------------------------");

        HammerImpl hammer = new HammerImpl(new FlyingEnchantmentImpl());
        hammer.wield();
        hammer.swing();

        System.out.println("--*--*-*--*--*-*--*--*--*-*- Vehicle Example ----*--*--*---*--*--*-*--*--*--*-*--*--*");
        Vehicle vehicle1 = new Car(new ProduceImpl(), new AssembleImpl());
        vehicle1.manufacture();
        Vehicle vehicle2 = new Bike(new ProduceImpl(), new AssembleImpl());
        vehicle2.manufacture();

        System.out.println("--*--*-*--*--*-*--*--*--*-*- Color Example ----*--*--*---*--*--*-*--*--*--*-*--*--*");
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();

        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
