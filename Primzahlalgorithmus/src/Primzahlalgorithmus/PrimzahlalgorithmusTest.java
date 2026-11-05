package Primzahlalgorithmus;

import java.util.Scanner;

public class PrimzahlalgorithmusTest {
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		  System.out.print("Ihre Zahl: ");
	      long zahl = myScanner.nextLong();
	      Primzahlalgorithmus p= new Primzahlalgorithmus();
	      
	      boolean istPrimzahl= p.isPrim(zahl);
	      
	      if(istPrimzahl==true) {
	    	  System.out.println ("Ihre Zahl ist keine Primzahl");
	      }else if(istPrimzahl==false) {
	    	  System.out.println("Ihre Zahl ist eine Primzahl");
	      }
	      System.out.println("Sekunden: "+p.getSecounds()+" Millisekunden: "+p.getMilsecounds());
	      
	     
	}
}
