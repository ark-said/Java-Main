package practice;

import java.util.Scanner;

public class P_2_1 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Vize sinavi sonucunuzu giriniz");
		double vize=scan.nextDouble();
		
		System.out.println("Vize final yuzdesini s giriniz");
		double vizeyuzde=scan.nextDouble();
		
		System.out.println("Final sinavi sonucuzunu giriniz");
		double finalnot=scan.nextDouble();
		
		System.out.println("Final sinavi yuzdenizi giriniz");
		double finalyuzde=scan.nextDouble();
		
		double ortalama=0;
		
		
		
		ortalama= finalnot+vize;
		System.out.println(ortalama);
	
		
		
	}

}
