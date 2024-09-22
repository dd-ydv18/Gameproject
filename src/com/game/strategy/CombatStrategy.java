package com.game.strategy;

import com.game.player.Player;
import com.game.util.Dice;

public interface CombatStrategy {
	
	
    int attack(Player attacker, Dice dice);
    int defend(Player defender, Dice dice);
}




