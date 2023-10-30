package amicable;

import java.util.Scanner;

public class Amicable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lütfen 1 sayıyı giriniz: ");
		int sayi1=scan.nextInt();
		System.out.println("lütfen 2. sayiyi giriniz: ");
		int sayi2=scan.nextInt();
		
		int sum1=amicable(sayi1);
		int sum2=amicable(sayi2);
		
		if(sum1==sum2) {
			System.out.println(sayi1+" ve "+sayi2+ " amicable sayıdır");
		}
		else {
			
				System.out.println(sayi1+" ve "+sayi2+" amicable sayı değildir");
			
		}
		
		
	}
	public static int amicable(int sayi) {
		int sum1=0;
		for(int i=1;i<=sayi;i++) {
			if (sayi%i==0) {
				sum1+=i;
			}
		}
		
		return sum1;
		
	}

}
