package practice_day1;

import java.util.Scanner;

public class P_1_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen 1. sayiyi giriniz.");
		
		int sayi1=scan.nextInt();
		
		System.out.println("Lutfen 2. sayiyi giriniz.");
		
		int sayi2=scan.nextInt();
		
	System.out.println("Girilen sayilarin toplami : " + (sayi1+sayi2));
	System.out.println("Girilen sayilarin farki : " + (sayi1-sayi2));
	System.out.println("Girilen sayilarin carpimi : " + (sayi1*sayi2));
	System.out.println("Girilen sayilarin bolumu : " + (sayi1/sayi2));
	}

}
