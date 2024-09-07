/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



import service.IFighter;

/**
 * This class is optional. But if it is present, it acts as single point of
 * contact for client.
 *
 * Multiple uses of Context
 *
 * 1. It can populate data to execute an operation of strategy 
 * 2. It can take independent decision on Strategy creation. 
 * 3. In absence of Context, client should be aware of concrete strategies. 
 * Context acts a wrapper and hides internals 
 * 4. Code re-factoring will become easy
 *
 * @author Created by Mir00r
 */
public class Fighter {

    private int health;
    private IFighter fighter;

    public Fighter() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void changeFighterMode(IFighter iFighter) {
        this.fighter = iFighter;
        fighter.fight();
    }
}
