package odev;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi;
		System.out.print("Bir sayi giriniz:");
		sayi=input.nextInt();
		for(int i=1;i<=sayi;i++) {
			if(i%3==0)
				System.out.println(i);
		}
		
	}

}
