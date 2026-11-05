package Primzahlalgorithmus;

import java.util.Scanner;

public class Primzahlalgorithmus {
	long milsecoundsstart;
	long milsecoundsend;
	long milsecounds;
	long secounds;
	long nanosecounds;
	long nanosecoundsStart;
	long nanosecoundsEnd;
	

	public Primzahlalgorithmus() {
	}

	public boolean  isPrim(long zahl) {
		setMilsecoundsstart();
		setNanosecoundsStart();
		boolean istPrimzahl = true;

		for (int i = 2; i <= zahl / 2; i++) {
			if (zahl % i == 0) {
				istPrimzahl = false;
				setMilsecoundsend();
				setNanosecoundsEnd();
				return istPrimzahl;
				
			}
		}
		
		
		setMilsecoundsend();
		setNanosecoundsEnd();
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
		secounds = getMilsecounds() / 1000;
		return secounds;
	}

	private void setNanosecoundsStart() {
		nanosecoundsStart = System.nanoTime();
	}
	
	private void setNanosecoundsEnd() {
		nanosecoundsEnd = System.nanoTime();
	}
	
	public long getNanosecounds() {
		nanosecounds = nanosecoundsEnd - nanosecoundsStart;
		return nanosecounds;
	}

}
