package day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		//kullanicidan 100 den küçük bir tam sayý isteyn
		// 1 den baþlayarak 	girilen sayýya kadar (sayý dahil) 3'un katý olan sayýlarý yazdýrýn.
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yuzden kucuk bir sayi giriniz");
		
		double num= scan.nextInt();
		int sayi= (int) num;
		
		
		if (num<0) { System.out.println("negatif bir sayi giremezsiniz");
		}
		else if(sayi!=num) {System.out.println("Lutfen tam sayi giriniz");}
		else if (sayi>100) {System.out.println("Lutfen 100'den kucuk sayi girin");}
		
		else {for (int i = 1; i <=num; i++) {
			if(i%3==0){System.out.print(i+ " ");}
		
		
}} 
		
	
	scan.close();
	
	}}
