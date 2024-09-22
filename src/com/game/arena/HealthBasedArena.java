package com.game.arena;

import com.game.player.Player;

public class HealthBasedArena extends GameArena {

public HealthBasedArena(Player playerA, Player playerB) {
    super(playerA, playerB);
}

@Override
protected Player decideAttacker() {
    // Decide who attacks first based on health
    return playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
}
}
