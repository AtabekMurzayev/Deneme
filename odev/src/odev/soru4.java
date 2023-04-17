package odev;
import java.util.Scanner;
import java.util.ArrayList;

public class soru4 {

	public static void main(String[] args) {
		ArrayList<String> band= new ArrayList<String>();
		
		band.add("john");
		band.add("pete");
		band.add("paul");
		band.add("david");
		
		System.out.println(band);
		
		int location=band.indexOf("pete");
		band.remove(location);
		
		System.out.println(band);
		System.out.println("1. indekste: "+band.get(1));
		band.add(2,"ringo");
		
		System.out.println("band size:"+band.size());
		int index=0;
		while (index<band.size()) {
			System.out.println(band.get(index));
			index++;
		}
		
	}
}
