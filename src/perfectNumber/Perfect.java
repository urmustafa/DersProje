package perfectNumber;

import java.util.Iterator;
import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long count=2;
		
		for (int i = 0; i < 10;) {
			if (isPNumber(count)) {
				System.out.println(count);
				i++;
			}
			count++;
			if(count==80000) {
			System.out.println(count);
			}
		}
		
		
	}
	
	public static boolean isPNumber(long sayi) {
        long toplam = 0;

        for (long bölen = 1; bölen < sayi; bölen++) {
            if (sayi % bölen == 0) {
                toplam += bölen;
            }
        }
        return toplam == sayi;
    }
	
}
