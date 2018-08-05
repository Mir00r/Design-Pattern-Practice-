/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bridgepattern.weapon_example.weapon_service;

import bridgepattern.weapon_example.enchantment_service.Enchantment;

/**
 *
 * @author Created by Mir00r
 */
public interface Weapon {

    void wield();

    void swing();

    void unwield();

    Enchantment getEnchantment();
}
