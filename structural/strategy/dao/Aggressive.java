/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import service.IFighter;

/**
 *
 * @author Created by Mir00r
 */
public class Aggressive implements IFighter {

    @Override
    public void fight() {
        System.out.println("Fighter is now fight in Aggressive mode ...... ha ha h..... !!");
    }

}
