package chapter5;

import java.util.*;

enum Difficulty {EASY, NORMAL, HARD, VERYHARD}

public class EnumExercise {
	
	public static void interpreter(Difficulty diff) {
		switch(diff) {
		case EASY:
			System.out.println("Easy"); break;
		case NORMAL:
			System.out.println("Normal"); break;
		case HARD:
			System.out.println("Hard"); break;
		case VERYHARD:
			System.out.println("Very hard"); break;
		}
	}
	
	public static void printEnumValue() {
		for(Difficulty d : Difficulty.values()) {
			System.out.println("Value: " + d + "; Order: " + d.ordinal());
		}
	}
	
	public static void main(String[] args) {
		EnumExercise.interpreter(Difficulty.EASY);
		EnumExercise.interpreter(Difficulty.HARD);
		EnumExercise.interpreter(Difficulty.NORMAL);
		EnumExercise.interpreter(Difficulty.VERYHARD);
		EnumExercise.printEnumValue();
	}
	

}
