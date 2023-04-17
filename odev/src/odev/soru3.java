package odev;
import java.util.Scanner;
public class soru3 {

	public static void main(String[] args) {
		int sayi,toplam=0;
		Scanner input=new Scanner(System.in);
		do {
			System.out.print("Devam etemk icin pozitif , Cikmak icin ise negatif sayi giriniz:");
			sayi=input.nextInt();
			if(sayi%2==1) {
				toplam+=sayi;
			}
		}
		while(sayi>0);
		System.out.print("Girdiginiz sayilardan tek olanlarin toplami:"+toplam);
	}

}
