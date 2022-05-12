package practice;

import java.util.Scanner;

public class P_3_4_IlkIkiKarakterHaricString {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime ya da harf giriniz. ");
		
		String str=scan.nextLine();
		System.out.println(ilkIkisiz(str));; 
		scan.close();

	}

	public static String ilkIkisiz(String str) {
		String kalanHarfler="";
		
		if (str.startsWith("gh")) {
			kalanHarfler=str;
		} else if (str.startsWith("g")) {
			
			kalanHarfler=str.charAt(0)+str.substring(2);
			
		}
		
		else if (str.charAt(1)=='h') { 
			
			kalanHarfler=str.substring(1);
			
		}
		else {
			kalanHarfler=str.substring(2);
		}
		
	return kalanHarfler;
	} 
	}

