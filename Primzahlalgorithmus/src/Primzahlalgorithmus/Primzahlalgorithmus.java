package Primzahlalgorithmus;

import java.util.Scanner;

public class Primzahlalgorithmus {
	long milsecoundsstart;
	long milsecoundsend;
	long milsecounds;
	long secounds;
	

	public Primzahlalgorithmus() {
	}

	public boolean  isPrim(long zahl) {
		setMilsecoundsstart();
		boolean istPrimzahl = true;

		for (int i = 2; i <= zahl / 2; i++) {
			if (zahl % i == 0) {
				istPrimzahl = false;
				setMilsecoundsend();
				return istPrimzahl;
				
			}
		}
		
		
		setMilsecoundsend();
		return istPrimzahl;
	}
	
	private void setMilsecoundsstart() {
		milsecoundsstart = System.currentTimeMillis();
	}
	
	private void setMilsecoundsend() {
		milsecoundsend = System.currentTimeMillis();
	}
	
	public long getMilsecounds() {
		milsecounds = milsecoundsend - milsecoundsstart;
		return milsecounds;
	}
	
	public long getSecounds() {
		secounds = milsecounds / 1000;
		return secounds;
	}

	

}
