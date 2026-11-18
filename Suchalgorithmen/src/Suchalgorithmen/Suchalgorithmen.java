package Suchalgorithmen;

public class Suchalgorithmen {
	
	public long lineareSuche(long[] liste,long x){
		for(int i=0; i<liste.length-1;i++) {
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
	
	public long quadratischbinaereSuche(int start, int end,long[] liste,long x){
		double n = end-start+1;
		boolean keepGoing=true;
		if(x<=liste[end]) {
			if(start<end) {
			long t = start +((end-start)*((x-liste[start])/(liste[end]-liste[start])));
			int f = (int)t;
			if(x==liste[f]) {
				return (long)f;
			}else if(x<liste[f]){
				while(keepGoing) {
					f=f-(int)Math.sqrt(n);
					if(x>=liste[f]) {
						keepGoing=false;
						return quadratischbinaereSuche(f,f+(int)Math.sqrt(n)-1,liste,x);
					}
				}
				return -1;
			}else {
				while(keepGoing) {
					f=f+(int)Math.sqrt(n);
					if(x<=liste[f]) {
						keepGoing=false;
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
}
