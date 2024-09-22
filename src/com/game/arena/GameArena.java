package com.game.arena;

import com.game.player.Player;
import com.game.util.Dice;

public abstract class GameArena {

protected final Player playerA;
protected final Player playerB;
protected final Dice dice;

public GameArena(Player playerA, Player playerB) {
    this.playerA = playerA;
    this.playerB = playerB;
    this.dice = new Dice();
}

// Template method
public final void startGame() {
    System.out.println("Battle Start!");
    while (playerA.isAlive() && playerB.isAlive()) {
        Player attacker = decideAttacker();
        Player defender = (attacker == playerA) ? playerB : playerA;
        playRound(attacker, defender);
    }
    announceWinner();
}

protected abstract Player decideAttacker();

private void playRound(Player attacker, Player defender) {
    System.out.println(attacker + " is attacking " + defender);
    int attackDamage = attacker.performAttack(dice);
    int defenseStrength = defender.defend(dice);
    int damageDealt = Math.max(0, attackDamage - defenseStrength);
    defender.takeDamage(damageDealt);
    System.out.println("Attack Damage: " + attackDamage + ", Defense: " + defenseStrength + ", Damage Dealt: " + damageDealt);
    System.out.println(defender + " now has " + defender.getHealth() + " health.");
}

private void announceWinner() {
    if (!playerA.isAlive()) {
        System.out.println("Player B wins!");
    } else if (!playerB.isAlive()) {
        System.out.println("Player A wins!");
    }
}
}
