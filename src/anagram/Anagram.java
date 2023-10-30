package anagram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kelime1="listen";
		String kelime2="silent";
		
		char[] klm1=kelime1.toCharArray();
		char[] klm2=kelime2.toCharArray();
		
		
		
		if (kelime1.length()!=kelime2.length()) {	
			System.out.println("hata");	
			return;
		}
		
		Arrays.sort(klm1);
		Arrays.sort(klm2);
		
		if (Arrays.equals(klm1, klm2)) {
			System.out.println("bu klimler anagramdır");
		}
		else {
			System.out.println("anagram değildir");
		}
		
		
		
		
		
		
		
		
		
	}

}
