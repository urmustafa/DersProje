import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner scan = new Scanner(System.in);
	       int basamak_sayisi = 0, rakam;
	       int toplam = 0;
	       
	       System.out.print("Bir sayi giriniz: ");
	        int sayi = scan.nextInt();
	        int gecici=sayi;
	        int index=0;
	        
	        int[] basamaklar = new int[String.valueOf(sayi).length()];
	        
	        while (sayi > 0) {
	            int basamak = sayi % 10;
	            basamaklar[index] = basamak; // Basamağı diziye ekleyin
	            sayi /= 10;
	            index++;
	        }
	       // System.out.println(basamaklar[1]);
	      //  System.out.println(basamaklar.length);
	        
	        for (int i : basamaklar) {
	        	//System.out.println("basamaklar: "+i);
	        	toplam+=(Math.pow(i, basamaklar.length));
	        }
				 
	        if(toplam==gecici) {
	        	System.out.println("Bu bir Armstrog sayıdır: " + gecici+" = "+ toplam);
	        	
	        }
	        else {
				System.out.println("Bu bir Armstrog sayı değildir: "+gecici+" != "+toplam);
			}
	        
	        
	        
	        

	}

}
