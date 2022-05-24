package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	public static void main(String[] args) {
		// kullanicidan isteddigi kadar sayi alip
		// bu sayilarin toplayan bir program yapiniz
		// sayi girisini bitirmek icin q'ya basiniz
		
		int sayi=0;
		int toplam=0;
		int count=0;
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		try {
			while (count<10000) {
				System.out.println("Lutfen toplamak icin bir sayi yaziniz \nBitirmek icin sayi disinda bir tusa basiniz");
				sayi=scan.nextInt();
				toplam+=sayi;
				count++;
			}
		} catch (InputMismatchException e) {
			System.out.println("girdiginiz " + count + " adet sayinin toplami : " + toplam);
			
		}
	}

}