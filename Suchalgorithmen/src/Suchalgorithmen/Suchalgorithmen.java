package Suchalgorithmen;

public class Suchalgorithmen {
	
	public long lineareSuche(long[] Liste,long x){
		for(int i=0; i<Liste.length-1;i++) {
			if(Liste[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	public long binaereSuche(int start, int end,long[] Liste,long x){
		if(start<=end) {	
			int i =(end-start)/2;
			
			if(Liste[i]==x) {
				return i;
			}else if (Liste[i]<x) {
				return binaereSuche(i+1,end,Liste,x);
			}else {
				return binaereSuche(start,i-1,Liste,x);
			}
		}else {
			return -1;
		}
		
	}
}
