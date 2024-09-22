package com.game.main;

import com.game.arena.GameArena;
import com.game.arena.HealthBasedArena;
import com.game.player.Player;
import com.game.strategy.CombatStrategy;
import com.game.strategy.DefaultCombatStrategy;


public class Main {
public static void main(String[] args) {
  CombatStrategy defaultStrategy = new DefaultCombatStrategy();

  Player playerA = new Player(50, 5, 10, defaultStrategy);
  Player playerB = new Player(100, 10, 5, defaultStrategy);

  GameArena arena = new HealthBasedArena(playerA, playerB);
  arena.startGame();
}
}