package practice_day5;

import java.util.Scanner;

public class P_5_6_IntegerPin {

	public static void main(String[] args) {
	
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Pin code giriniz:");
		int userPin=scan.nextInt();
		
		int systemPin=1453;
		
		while(userPin!=systemPin) {
		System.out.println("***** hatali giris yapildi ***** ");
		System.out.println("***** tekrar deneyiniz. ***** ");
		userPin=scan.nextInt();
		
		
		}
		scan.close();
		System.out.println("gayet basarili...");
	}

}
