package practice;

import java.util.Scanner;

public class P_5_8_EnBuyukSayi {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("");
		int enbSayi=0;
		int count=0;
		
		
		while(count<5) {
			
			System.out.println("Sayi giriniz: ");
			int sayi=scan.nextInt();
 if (sayi>enbSayi) {
	 enbSayi=sayi;
	
}count++;
			
		}
	scan.close();	
		System.out.println("en buyukk sayi:"+enbSayi);
	}

}
