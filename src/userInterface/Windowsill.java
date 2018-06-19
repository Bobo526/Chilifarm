package userInterface;

import java.util.*;
import utility.List;

public class Windowsill {
	
	boolean end;
	
	Scanner scannersill = new Scanner(System.in);
	
	public Windowsill() {
		
	}
	
	public void getWindowsillInstance() {
		
		end = false;
		int input;
		
		List list1 = new List();
		
		if (list1.getElementNumber() == 0) {
			
			System.out.println("Die Fensterbank ist leer.");
		}
		
		else if (list1.getElementNumber() == 1) {
			
			System.out.println("Auf der Fensterbank steht eine Pflanze:" + list1.getListContent() + ".");
		}
		
		else {
			
			System.out.println("Auf der Fensterbank stehen die folgenden Pflanzen:" + list1.getListContent() + ".");
		}
		
		while (end == false) {
			
			System.out.println("Was möchtest du tun?");
			
			System.out.println("[1] Pflanzen gießen");
			System.out.println("[2] Chilis pflücken");
			System.out.println("[3] Die Fensterbank verlassen und zum Schreibtisch zurückkehren");
			
			input = scannersill.nextInt();
			
			if (input == 1) {
				
			}
			
			else if (input == 2) {
				
			}
			
			else if (input == 3) {
				
				System.out.println("Bist du dir sicher?");
				System.out.println("[1] Ja");
				System.out.println("[2] Nein");
				
				int yesno = scannersill.nextInt();
				
				if (yesno == 1) {
					
					System.out.println("Du kehrst zurück zu deinem Schreibtisch.");
					
					end = true;
					
				}
				
				else if (yesno == 2) {
					
					System.out.println("Du bleibst bei deiner Fensterbank.");
				}
			}
			
			else {
				
				System.out.println("Bitte gebe eine Zahl von eins bis vier ein.");
			}
		}
	}
}