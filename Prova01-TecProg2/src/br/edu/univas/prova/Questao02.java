package br.edu.univas.prova;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] nameOfGuests = new String[50];
		
		
		for(int i = 0; i < 50; i++) {
			System.out.println("Digite o nome do " + (i + 1) + "° convidado: ");
			nameOfGuests[i] = scanner.nextLine();
			
			if(guestListCheck(nameOfGuests, i) == false) {
				i--;
			}
		}
		scanner.close();
	}

	public static boolean guestListCheck(String nameOfGuests[], int i) {
		for(int j = 0; j < i; j++) {
			if(nameOfGuests[i].equals(nameOfGuests[j])) {
				System.out.println("\nO NOME DO CONVIDADO JÁ ESTÁ NA LISTA!\n");
				return false;
			}
		}
		return true;
	}
}
	
