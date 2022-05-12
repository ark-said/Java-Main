package practice;

import java.util.Scanner;

public class P_4_4_Ask_5_Numbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int toplam=0;
		
		for (int i = 1; i<=5; i++) {
			System.out.print("sayi "+i+" giriniz:");
			
			int sayi=scan.nextInt();
			
			if(sayi>5 && sayi<10) {
				
				System.out.println("Girilen sayi 5 ile 10 arasi oldugundan isleme alindmadi.");
				continue;
			}
		toplam+=sayi;	
		}

		System.out.println("Girdiginiz sayilarin toplami :"+toplam);
		scan.close();
	}

}
