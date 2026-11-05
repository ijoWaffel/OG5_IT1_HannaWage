package Primzahlalgorithmus;

import java.util.Scanner;

public class Primzahlalgorithmus {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		  System.out.print("Ihre Zahl: ");
	      int zahl = myScanner.nextInt();
	      
	      long milsecoundsstart = System.currentTimeMillis();
	      
	      boolean istPrimzahl=true;
	      
	      for(int i =2;	i<=zahl/2;i++) {
	    	  if(zahl%i==0) {
	    		  istPrimzahl = false;
	    		  System.out.println ("Ihre Zahl ist keine Primzahl, denn sie ist durch "+i+" teilbar");
	    		  i = zahl;
	    	  }
	      }
	      
	      if(istPrimzahl==true) {
	    	  System.out.println("Ihre Zahl ist eine Primzahl");
	      }
	      
	      long milsecoundsend = System.currentTimeMillis();
	      long milsecounds= milsecoundsend-milsecoundsstart;
	      long secounds = milsecounds /1000;
	      System.out.println(milsecounds+" "+ secounds);
	}
	

}
