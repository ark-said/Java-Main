package practice_day4;

import java.util.Scanner;

public class P_4_7_Matrix {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.print("Matrisin boyutunu giriniz: ");
		int boyut=scan.nextInt();
		
		for (int baba = 1; baba <= boyut; baba++) {
			for (int evlat = 1; evlat <= boyut; evlat++) {
			if (baba==evlat) {
				System.out.print("1 ");
			}else {
					System.out.print("0 ");
				
				}
			
				}
			
			System.out.println();

			}
		
	
scan.close();
	}

}
