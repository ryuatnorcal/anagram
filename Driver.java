package anagram2;

public class Driver {

	public static void main(String[] args){
		anagram a = new anagram();
		String[] s1 = {"awesome", "domain","newton", "africa", "discounter"};
		String[] s2 = {"newasd", "Indoma","newton", "asd","reductions"};
		boolean result; 
		for(int i = 0; i < 5; i++){
			result = a.isAnagram(s1[i], s2[i]);			
			if(result){
				System.out.println(s1[i]+ " and "+ s2[i] + " are Anagram! ");
			}
			else{
				System.out.println(s1[i]+ " and "+ s2[i] + " are NOT Anagram");
			}
		}
	
	}
}
