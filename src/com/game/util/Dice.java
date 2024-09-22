package com.game.util;



import java.util.Random;

public class Dice {
	  private final int sides;
	  private final Random random;

	  // Constructor, allowing different-sided dice (e.g., 6-sided, 20-sided, etc.)
	  public Dice(int sides) {
	      this.sides = sides;
	      this.random = new Random();
	  }

	  // Default constructor for a standard 6-sided dice
	  public Dice() {
	      this(6);
	  }

	  // Method to roll the dice and return a random number between 1 and the number of sides
	  public int roll() {
	      return random.nextInt(sides) + 1; // Generates a random number between 1 and sides
	  }

	  // Optionally: You can add a toString() method for better logging or debugging
	  @Override
	  public String toString() {
	      return "Dice{" +
	              "sides=" + sides +
	              '}';
	  }
	}

