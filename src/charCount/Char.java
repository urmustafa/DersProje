package charCount;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner scan = new Scanner(System.in);
	//	System.out.println("Bir metin giriniz");
		String metinString="intellij idea";
		
		HashMap<Character, Integer> tekrarSayilari = new HashMap<>();
		//char [] dizK=metinString.toCharArray();
		
		for(char karakter:metinString.toCharArray()) {
			if(tekrarSayilari.containsKey(karakter)) {
				tekrarSayilari.put(karakter, tekrarSayilari.get(karakter)+1);
				//System.out.println("sonuc: "+tekrarSayilari);
				//System.out.println(tekrarSayilari.get(karakter));
			}
			else {
				
				tekrarSayilari.put(karakter, 1);
				//System.out.println("else içi: "+tekrarSayilari);
				//System.out.println("else içi: "+tekrarSayilari.get(karakter));
			}
		}
		
		//System.out.println("tekrarkyeset: "+tekrarSayilari.keySet());
		
		for(char i:tekrarSayilari.keySet()) {
			if (tekrarSayilari.get(i)>0) {
				System.out.println("tekrarlı sayıar: "+i+" => "+tekrarSayilari.get(i));
			}
		}
		

	}

}
