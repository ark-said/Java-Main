 package practice_day5;

import java.util.Scanner;

public class P_5_99_Faktoriyel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz : ");
		
		int sayi =scan.nextInt();
		
		int faktoriyel=1;
		
		
		
		while (sayi>0) {
			faktoriyel*=sayi;
			
			sayi--;
			
		}
		System.out.println("Faktoriyel:" +faktoriyel);
		scan.close();
		}
		
		
	}


