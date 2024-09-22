package com.game.player;

import com.game.strategy.CombatStrategy;
import com.game.util.Dice;

public class Player {
private int health;
private final int strength;
private final int attack;
private final CombatStrategy strategy;

public Player(int health, int strength, int attack, CombatStrategy strategy) {
    this.health = health;
    this.strength = strength;
    this.attack = attack;
    this.strategy = strategy;
}

public int getHealth() {
    return health;
}

public int getAttack() {
    return attack;
}

public int getStrength() {
    return strength;
}

public boolean isAlive() {
    return health > 0;
}

public int performAttack(Dice dice) {
    return strategy.attack(this, dice);
}

public int defend(Dice dice) {
    return strategy.defend(this, dice);
}

public void takeDamage(int damage) {
    this.health -= damage;
    if (this.health < 0) {
        this.health = 0;
    }
}

@Override
public String toString() {
    return "Player{" +
            "health=" + health +
            ", strength=" + strength +
            ", attack=" + attack +
            '}';
}
}
