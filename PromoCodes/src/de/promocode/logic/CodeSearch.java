package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	/**
	 * Sucht einen Code in der Liste.
	 * 
	 * @param list
	 *            Liste der Codes im Long-Format
	 * @param searchValue
	 *            Gesuchter Code
	 * @return Index des Codes, wenn er vorhanden ist, NOT_FOUND wenn er nicht
	 *         gefunden werden konnte
	 */
	public static int findPromoCode(long[] list, long searchValue) {
		int position = quadratischbinaereSuche(0,list.length-1,list,searchValue);
		if(position >0) {
			return position;
		}else {

		return NOT_FOUND;
		}
	}
	
	//die suche erhält eine Anfangs und end suchposition die liste und x
	private static int quadratischbinaereSuche(int start, int end,long[] liste,long x){
		//definition der sprungweite flas x nicht gefunden wird
		double n = end-start+1;
		//end definition der while sSchleife
		boolean keepGoing=true;
		// schaut ob x größer ist als der größte Wert der Liste
		if(x<=liste[end]) {
			//schaut ob die startposition größer als die end position ist 
			if(start<end) {
				//die wahrscheinlichste position von x relativ vom start und end wert
				long t = start +((end-start)*((x-liste[start])/(liste[end]-liste[start])));
				int f = (int)t;
				//der wert der Liste wird mit x verglichen
				if(x==liste[f]) {
					return f;
			}else if(x<liste[f]){
				// wenn der Wert Größer ist springt der code wurzel aus n positionen bis der wert kleiner als x ist
				while(keepGoing) {
					f=f-(int)Math.sqrt(n);
					if(f>=start) {
					if(x>=liste[f]) {
						keepGoing=false;
						//das neugefundene Intervall wird wieder in die quadratisch binäre Suche gegeben
						return quadratischbinaereSuche(f,f+(int)Math.sqrt(n)-1,liste,x);
					}
					}else {
						return quadratischbinaereSuche(start,f+(int)Math.sqrt(n)-1,liste,x);
					}
				}
				return -1;
			}else {
				//ist der wert größer passiert das Gegenteil
				while(keepGoing) {
					f=f+(int)Math.sqrt(n);
					if(f<=end) {
					if(x<=liste[f]) {
						keepGoing=false;
						//das neugefundene Intervall wird wieder in die quadratisch binäre Suche gegeben
						return quadratischbinaereSuche(f-(int)Math.sqrt(n)+1,f,liste,x);						
					}
					}else {
						return quadratischbinaereSuche(f-(int)Math.sqrt(n)+1,end,liste,x);
					}
				}
					
				return -1;
				
			}
			}else if(start==end) {
			if(x==liste[end]) {
				return end;
			}else {
				return -1;
			}
			}else{
			return -1;
			}
		}else {
			return -1;
		}
	}


}
