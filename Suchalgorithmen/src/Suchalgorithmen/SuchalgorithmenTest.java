package Suchalgorithmen;

import java.util.Scanner;

public class SuchalgorithmenTest {
	public static void main(String arg[]) {
		SortedListGenerator generator= new SortedListGenerator();
		Suchalgorithmen suche= new Suchalgorithmen();
		Scanner myScanner = new Scanner(System.in);
		
		long x;
		int listLaenge=20000000;
				
		long[] liste = generator.getSortedList(listLaenge);
		x=11;
		System.out.println("x: "+x);
		
		System.out.println(liste[0]+" "+liste[1]+" "+liste[2]+" "+liste[3]+" "+liste[4]+" ");
		System.out.println(liste[listLaenge-1]+" "+liste[listLaenge-2]+" "+liste[listLaenge-3]+" "+liste[listLaenge-4]+" "+liste[listLaenge-5]+" "+liste[listLaenge-6]+" "+liste[listLaenge-7]+" ");
		suche.setLindurchlauf(0);
		suche.setQbdurchlauf(0);
		
		
		long timeStartln = System.currentTimeMillis();
		long linErgebnis=suche.lineareSuche(liste, x);
		long timeEndln = System.currentTimeMillis();
		
		System.out.println("Zeit Lineare Suche: "+(timeEndln-timeStartln));
		System.out.println("Durchläufe Lineare Suche: "+suche.getLindurchlauf() );
		
		long timeStartqb = System.currentTimeMillis();
		long qbErgebnis=suche.quadratischbinaereSuche(0, listLaenge-1, liste, x);
		long timeEndqb = System.currentTimeMillis();
		
		System.out.println("Zeit Quadratische Binärsuche: "+(timeEndqb-timeStartqb));
		System.out.println("Durchläufe Quadratische Binärsuche: "+suche.getQbdurchlauf() );
		
		System.out.println("ihre zahl x: "+x+" an der stelle laut lin " +linErgebnis+ " laut Quabin "+ qbErgebnis);
		System.out.println("ergebnis lin "+ liste[(int)linErgebnis]+ " ergebniss Qb "+liste[(int)qbErgebnis]);
	}
}
