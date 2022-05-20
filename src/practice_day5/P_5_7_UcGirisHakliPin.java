package practice_day5;

import java.util.Scanner;

public class P_5_7_UcGirisHakliPin {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
	
		
String systemPin="Javacanlara selam olsun";

int girisHakki=3;

while (true) {
	System.out.println("Pin code giriniz:");
	String userPin=scan.nextLine();
	
	if (userPin.equals(systemPin)) {
		
		System.out.println("Gayet basarili");
	break;
	
	} else {System.out.println("Hatali giris yapildi.");
	
	girisHakki--;
	
	System.out.println("Kalan deneme hakkiniz: "+girisHakki);
	
	if (girisHakki==0) {
		
		System.out.println("Giris hakkiniz kalmadi.");
	}
	
	}
	
}
	scan.close();
} 
	}


