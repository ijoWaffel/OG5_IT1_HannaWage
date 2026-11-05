package Primzahlalgorithmus;

import java.util.Scanner;

public class Primzahlalgorithmus {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		  System.out.print("Ihre Zahl: ");
	      int zahl = myScanner.nextInt();
	      boolean istPrimzahl=true;
	      int aMin=0;
	      int aif=0;
	      
	      for(int i =2;	i<=zahl/2;i++) {
	    	  aMin++;
	    	  if(zahl%i==0) {
	    		  aif++;
	    		  istPrimzahl = false;
	    		  System.out.print("Ihre Zahl ist keine Primzahl, denn sie ist durch "+i+" teilbar");
	    		  i = zahl;
	    	  }
	      }
	      
	      if(istPrimzahl==true) {
	    	  System.out.print("Ihre Zahl ist eine Primzahl");
	      }
	}

}
