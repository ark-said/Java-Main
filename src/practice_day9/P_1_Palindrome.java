package practice_day9;

import java.util.Scanner;

public class P_1_Palindrome {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir metin giriniz");
		String metin=scan.nextLine();
		StringBuilder sB=new StringBuilder(metin);
		
		String tersMetin=sB.reverse().toString();
		
		// methodcoin= method zinciri
		
	 if (tersMetin.equalsIgnoreCase(metin)) {
		 
		System.out.println("Girilen metin polindrome ifadedir :" + tersMetin);
		
		
		
	} else {System.out.println("Girilen metin polindrome ifade deðildir : "+ tersMetin);}
	}

}
