package day16_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// kullanicidan yuzden kucuk bir + tamsayi iste
		// 1'den baþlayarak girilen sayýya kadar 3'un veya 5'in katý olan sayýlarý yazdýrýn.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yuzden kucuk bir sayi giriniz");
		int num = scan.nextInt();
		
		for (int i = 1; i <=num; i++) {
			
			if (i%3==0|| i%5==0) {System.out.print(i+ " ");}
			
		
		}
		
	
	scan.close();
	}

}
