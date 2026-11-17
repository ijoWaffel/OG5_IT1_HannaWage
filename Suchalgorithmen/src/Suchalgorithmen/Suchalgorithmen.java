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
	
	public long interpolesuche(int start, int end,long[] Liste,long x){
		if(start<=end) {
			long t = start +((end-start)*((x-Liste[start])/(Liste[end]-Liste[start])));
			int f = (int)t;
			if(x==Liste[f]) {
				return f;
			}else if(x<Liste[f]){
				return interpolesuche(start,f-1,Liste,x);
			}else {
				return interpolesuche(f+1,end,Liste,x);
			}
		}else {
			return -1;
		}
	}
	
	public long quadratischbinaereSuche(int start, int end,long[] Liste,long x){
		double n = end-start+1;
		if(start<=end) {
			long t = start +((end-start)*((x-Liste[start])/(Liste[end]-Liste[start])));
			int f = (int)t;
			if(x==Liste[f]) {
				return f;
			}else if(x<Liste[f]){
				for(int i = f-(int)Math.sqrt(n);x<Liste[i];i=i-(int)Math.sqrt(n)) {
					f=i;
				}
				f=f-(int)Math.sqrt(n);
				return quadratischbinaereSuche(f,f+(int)Math.sqrt(n)-1,Liste,x);
			}else {
				for(int i = f+(int)Math.sqrt(n);x>Liste[i];i=i+(int)Math.sqrt(n)) {
					f=i;
				}
				f=f+(int)Math.sqrt(n);
				return quadratischbinaereSuche(f,f-(int)Math.sqrt(n)+1,Liste,x);
			}
		}else {
			return -1;
		}
	}
	
	
}
