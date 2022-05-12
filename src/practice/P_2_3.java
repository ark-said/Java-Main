package practice;

import java.util.Scanner;

public class P_2_3 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen boyunuzu CM cinsinden giriniz.");
		int boy=scan.nextInt();
		
		System.out.println("Lutfen kilonuzu KG cinsinden giriniz.");
		int kilo=scan.nextInt();
		
		double bmi=kilo/(boy/100*boy/100);
		
		if (bmi<=20) { System.out.println("Oldukca zayifsiniz.");}   
		else if (bmi<=25){System.out.println("kardo");}
	
		else  {System.out.println("Lutfen gecerli degerler giriniz");};
		
		
	}

}
