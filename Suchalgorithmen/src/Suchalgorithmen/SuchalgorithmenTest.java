package Suchalgorithmen;

import java.util.Scanner;

public class SuchalgorithmenTest {
	public static void main(String arg[]) {
		SortedListGenerator generator= new SortedListGenerator();
		Suchalgorithmen suche= new Suchalgorithmen();
		Scanner myScanner = new Scanner(System.in);
		
		long x= 90000000;
		int listLaenge=15000000;
				
		long[] liste = generator.getSortedList(listLaenge);
		System.out.println("start: "+liste[0]+"end: "+liste[listLaenge-1]);
		
		long qbErgebnis=suche.quadratischbinaereSuche(0, listLaenge-1, liste, x);
		
		long timeStart = System.currentTimeMillis();
		long linErgebnis=suche.lineareSuche(liste, x);
		long timeEnd = System.currentTimeMillis();
		
		System.out.print("zeit: "+(timeEnd-timeStart));
	}
}
