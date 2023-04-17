package odev;

import java.util.Iterator;
import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		int number, lastDigit, reverse=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("pozitif bir tam sayi girin:");
		number=scan.nextInt();
		do {
			lastDigit=number%10;
			reverse=(reverse*10)+lastDigit;
			number=number/10;
		} while (number>0);
		System.out.print("girilen sayinin tersi:"+reverse);
		
		
		/*int value=6;
		for (int num = 1; num <=value; num++) {
			for (int i = 0; i <=(value-num); i++) {
				System.out.print("");
				for (int j = 0; j <((2*num)-1); j++) {
					System.out.print("*");
					System.out.println();
				}
				
			}*/
			
		}
		
		
		
		
	}

}
