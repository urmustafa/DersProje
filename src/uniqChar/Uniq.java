package uniqChar;

import java.util.Arrays;
import java.util.Iterator;

public class Uniq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/**	String kelimeString="seelin";
		boolean snc=true;
		
		char [] chars=kelimeString.toCharArray();
		
		Arrays.sort(chars);
		//System.out.println(chars);
		
		for(int i=1;i<chars.length;i++) {
			//System.out.println("for içi");
			if(chars[i]==chars[i-1]) {
				snc=false;
				//System.out.println("if içi");
				
			}
			
			
			
		}
		if(snc) {
			System.out.println("bu kelime uniq karkterler içeriyor");
		}
		else {
			System.out.println("bu kelime uniq karakterler içermiyor");
		}
		
		
*/
		
		
		
	        String kelimeString = "seeelin";

	        if (isuniq(kelimeString)) {
	            System.out.println("Bu kelime uniq karakterler içeriyor");
	        } else {
	            System.out.println("Bu kelime uniq karakterler içermiyor");
	        }
	    }
	
	    public static boolean isuniq(String kelimeString) {

	        for (int i = 0; i < kelimeString.length() - 1; i++) {
	            char karakter = kelimeString.charAt(i);
	            for (int j = i + 1; j < kelimeString.length(); j++) {
	                if (karakter == kelimeString.charAt(j)) {
	                    return false;
	                }
	            }
	        }
	        return (true);
	    
	
		
		
		
		
		
		
		
	}
	
	

		
		
}
