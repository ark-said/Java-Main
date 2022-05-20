package practice_day2;

import java.util.Scanner;

public class P_2_4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz");
		int sayi=scan.nextInt();
		
		System.out.println("****** TERNARY COZUM *******");
		
		@SuppressWarnings("unused")
		String result=(sayi>=0)?((sayi<10)?("rakam"):("pozitif sayi")):("Negatif Sayi");
		
		
	}

}
