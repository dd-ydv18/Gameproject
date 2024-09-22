package com.game.strategy;

import com.game.player.Player;
import com.game.util.Dice;

public class DefaultCombatStrategy implements CombatStrategy {

	 
    public int attack(Player attacker, Dice dice) {
        return attacker.getAttack() * dice.roll();
    }

   

	
	public int defend(Player defender,Dice dice) {
		
		  return defender.getStrength() * dice.roll();
	}
}

