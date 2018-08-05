/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern.weapon_example.enchantment_service;

/**
 *
 * @author Created by Mir00r
 */
public interface Enchantment {

    void onActivate();

    void apply();

    void onDeactivate();
}
