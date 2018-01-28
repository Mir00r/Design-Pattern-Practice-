/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.mir00r.model;

import strategypattern.mir00r.service.IFighter;

/**
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
