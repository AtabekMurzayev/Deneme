package odev;
import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n;
		System.out.print(" Girdiginiz sayinin ve o sayiya kadar olan sayilarin tam bolenlerini gormek icin sayinizi giriniz:");
		n=input.nextInt();
		
		int i=1;
		while(i<=n)
		{
			System.out.println(i+":sayisinin tam bolenleri:");
			int j=1;
			while (j<=n) 
			{
				if (i%j==0) {
					System.out.println(""+j);
				}
				j++;
			}
			i++;
		}
		
	}

}
