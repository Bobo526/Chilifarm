package userInterface;

import java.util.*;

public class Main {
	
	static Scanner scannermain = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean end = false;
		int input;
		
		Windowsill windowsill = new Windowsill();
		Market market = new Market();
		Lexica lexica = new Lexica();
		Lab Lab = new Lab();
		
		// System.out.println("Heute im Informatikunterricht hat dir deine Lehrerin etwas besonderes geschenkt:");
		// System.out.println("Eine Chilipflanze.");
		// System.out.println("Sobald du zuhause bist, stellst du sie auf deine Fensterbank...");
		
		// System.out.println("Das ist die Fensterbank");
		
		while (end == false) {
			
			System.out.println("Was möchtest du tun?");
			System.out.println("[1] Die Fensterbank besuchen");
			System.out.println("[2] Den Markt besuchen");
			System.out.println("[3] Das Chililexicon aufschlagen");
			System.out.println("[4] Das Labor besuchen");
			System.out.println("[5] Das Spiel verlassen");
			
			input = scannermain.nextInt();
			
			if (input == 1) {
				
				windowsill.getWindowsillInstance();
			}
			
			else if (input == 2) {
				
				market.getMarketInstance();
			}
			
			else if (input == 3) {
				
				lexica.getLexicaInstance();
			}
			
			else if (input == 4) {
				
				Lab.getLabInstance();
			}
			
			else if (input == 5) {
				
				System.out.println("Bist du dir sicher?");
				System.out.println("[1] Ja");
				System.out.println("[2] Nein");
				
				int yesno = scannermain.nextInt();
				
				if (yesno == 1) {
					
					System.out.println("Vielen Dank fürs Spielen. Das Spiel schließt sich jetzt.");
					
					end = true;
				}
				
				else if (yesno == 2) {
					
					System.out.println("Du kehrst zurück zu deinem Schreibtisch.");
				}
			}
			
			else {
				
				System.out.println("Bitte gebe eine Zahl von eins bis vier ein.");
			}	
		}
	}
}