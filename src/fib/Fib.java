package fib;

import java.util.Iterator;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number=100;
			long fib1=0;
			long fib2=1;
			long toplam=0;
			
			for(int i =1;i<=100;i++) {
				System.out.print(fib1+" ");
				toplam=fib1+fib2;
				fib1=fib2;
				fib2=toplam;
				
			}
			
			
	}

}
