package practice;

import java.util.Scanner;

public class P_4_8_SesliSessizHarf {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Harf giriniz: ");
		
		String girilenHarfler=scan.next();
		
		String sesliHarfler="aeiuoAEIUO";
		String sessizHarfler="bcdfghjklmnprsztvyxzwq";
		
			
		if (girilenHarfler.length()==1) {
			
			for (int i = 0; i < sessizHarfler.length(); i++) 
			{
		if (girilenHarfler.charAt(0)==sesliHarfler.charAt(i)) {
			
			System.out.println("Girilen harf seslidir.");
			
			break; }
			
			else if (girilenHarfler.charAt(0)==sessizHarfler.charAt(i)) {
System.out.println("Girilen harf sessizdir.");
				
				break;
				
				
			} else {
				System.out.println("Yanlis karakter girdin");
				break; 
			}
		
		
		
			}
		
	
			
		}
		
		
		scan.close();
		
	}

}
