package br.edu.univas.prova;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		float[] notes = new float[25];
		
		for(int i = 0; i < 25; i++) {
		System.out.println("Digite a " + (i + 1) + "° nota: ");
		notes[i] = scanner.nextFloat();
		}
		
		float biggestNote = biggestNote(notes);
				
		float lowestNote = lowestNote(notes);
		
		System.out.println("RESULTADO \nMAIOR NOTA: " + biggestNote + "\nMENOR NOTA: " + lowestNote);
		scanner.close();
	}

	public static float biggestNote(float notes[]) {
		float biggestNote = notes[0];

		for(int i = 1; i < 25; i++) {
			if(notes[i] > biggestNote) {
				biggestNote = notes[i];
			}
		}
		return biggestNote;
	}
	
	public static float lowestNote(float notes[]) {
		float lowestNote = notes[0];
		
		for(int i = 1; i < 25; i++) {
			if(notes[i] < lowestNote) {
				lowestNote = notes[i];
			}
		}
		return lowestNote;
	}
}
