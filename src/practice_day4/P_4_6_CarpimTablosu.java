package practice_day4;

import java.util.Scanner;

public class P_4_6_CarpimTablosu {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Carpim tablosunun boyutunu giriniz: ");
		
		int boyut=scan.nextInt();
		
		for (int baba = 1; baba <= boyut; baba++) {
			
			for (int evlat = 1; evlat <= boyut; evlat++) {
			System.out.print(" "+baba*evlat);	
			}
		}
		System.out.println();
		scan.close();

	}

}
