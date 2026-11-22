package Suchalgorithmen;

public class Suchalgorithmen {
	long lindurchlauf;
	long qbdurchlauf;
	
	//übergeben wird eine Liste und der gesuchte Wert x
	public long lineareSuche(long[] liste,long x){
		//in dieser Schleife wird jedes Element der Liste durchlaufen bis der gesuchte Wert gefunden ist oder es keinen Wert gibt und -1 ausgegeben wird
		for(int i=0; i<liste.length;i++) {
			lindurchlauf++;
			if(liste[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public long binaereSuche(int start, int end,long[] liste,long x){
		if(start<=end) {	
			int i =(end-start)/2;
			
			if(liste[i]==x) {
				return i;
			}else if (liste[i]<x) {
				return binaereSuche(i+1,end,liste,x);
			}else {
				return binaereSuche(start,i-1,liste,x);
			}
		}else {
			return -1;
		}
		
	}
	
	public long interpolesuche(int start, int end,long[] liste,long x){
		if(x<=liste[end]) {
		if(start<end) {
			long t = start +((end-start)*((x-liste[start])/(liste[end]-liste[start])));
			int f = (int)t;
			if(x==liste[f]) {
				return f;
			}else if(x<liste[f]){
				return interpolesuche(start,f-1,liste,x);
			}else {
				return interpolesuche(f+1,end,liste,x);
			}
		}else if(start==end) {
			if(x==liste[end]) {
				return (long)end;
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
	//die suche erhält eine Anfangs und end suchposition die liste und x
	public long quadratischbinaereSuche(int start, int end,long[] liste,long x){
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
					return (long)f;
			}else if(x<liste[f]){
				// wenn der Wert Größer ist springt der code wurzel aus n positionen bis der wert kleiner als x ist
				while(keepGoing) {
					qbdurchlauf++;
					f=f-(int)Math.sqrt(n);
					if(x>=liste[f]) {
						keepGoing=false;
						//das neugefundene Intervall wird wieder in die quadratisch binäre Suche gegeben
						return quadratischbinaereSuche(f,f+(int)Math.sqrt(n)-1,liste,x);
					}
				}
				return -1;
			}else {
				//ist der wert größer passiert das Gegenteil
				while(keepGoing) {
					qbdurchlauf++;
					f=f+(int)Math.sqrt(n);
					if(x<=liste[f]) {
						keepGoing=false;
						//das neugefundene Intervall wird wieder in die quadratisch binäre Suche gegeben
						return quadratischbinaereSuche(f-(int)Math.sqrt(n)+1,f,liste,x);						
					}
				}
				return -1;
				
			}
			}else if(start==end) {
			if(x==liste[end]) {
				return (long)end;
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

	public long getLindurchlauf() {
		return lindurchlauf;
	}

	public void setLindurchlauf(long lindurchlauf) {
		this.lindurchlauf = lindurchlauf;
	}

	public long getQbdurchlauf() {
		return qbdurchlauf;
	}

	public void setQbdurchlauf(long qbdurchlauf) {
		this.qbdurchlauf = qbdurchlauf;
	}
	
}
