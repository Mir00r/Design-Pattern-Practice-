/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.Random;
import strategypattern.mir00r.dao.Aggressive;
import strategypattern.mir00r.dao.Defensive;
import strategypattern.mir00r.model.Fighter;

/**
 *
 * @author Created by Mir00r
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Random random = new Random();

        fighter.setHealth(random.nextInt(100));

        if (fighter.getHealth() <= 50) {
            fighter.changeFighterMode(new Defensive());
        } else if (fighter.getHealth() > 50) {
            fighter.changeFighterMode(new Aggressive());
        }
    }
}
