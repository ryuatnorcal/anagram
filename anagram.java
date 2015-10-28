package anagram2;

import java.util.Arrays;

/**
 * 
 * Write a function that takes a pair of strings (S1 and S2) and determines 
 * whether they are anagrams of each other, returning True is they are and 
 * False if they aren&#039;t. Capital letters are considered different than 
 * lower-case letters. Assume that this might be used with various string contents, 
 * including variations on Unicode and non-English text.  
 * @author ryutaromatsuda
 *
 */

public class anagram {

	private char[] str1;
	private char[] str2; 
	private char[] str;
	private char[] temp; 
	public boolean isAnagram(String arg1, String arg2){
		
		str1 = arg1.toCharArray();
		str2 = arg2.toCharArray();
		
		str1 = sorting(str1);
		str2 = sorting(str2);
		// or just do 
		// Arrays.sort(str1);
		// Arrays.sort(str2);
		
		if(str1.length != str2.length){
			return false; 
		}
		for(int i = 0; i < str1.length; i++){
			if(str1[i] != str2[i]){				
				return false; 
			}
		}
		return true;
		
	}
	
	private char[] sorting(char[] arg){
		str = arg;
		temp = new char[arg.length];
		msort(0, arg.length-1);
		return str;
	}
	
	private void msort(int start, int end){
		int mid; 
		if(start < end){
			mid = start + (end - start) / 2;
			msort(start,mid);
			msort(mid+1,end);
			swap(start,mid,end);
		}		
	}
	
	private void swap(int start, int mid, int end){
		for(int i = start; i <= end; i++){
			temp[i] = str[i];
		}
		
		int s = start; 
		int k = start; 
		int m = mid + 1;
		
		while(s <= mid && m <= end){
			if(temp[s] <= temp[m]){
				str[k] = temp[s];
				s++;				
			}
			else{
				str[k] = temp[m];
				m++;
			}
			k++;
		}
		
		while(s <= mid){
			str[k] = temp[s];
			k++;
			s++;
		}
	}
	
}
