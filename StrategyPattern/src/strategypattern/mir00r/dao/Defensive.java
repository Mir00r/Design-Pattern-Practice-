/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.mir00r.dao;

import strategypattern.mir00r.service.IFighter;

/**
 *
 * @author Created by Mir00r
 */
public class Defensive implements IFighter {

    @Override
    public void fight() {
        System.out.println("Fighter is now fight in Defensive mode ...... ha ha h..... !!");
    }
}
