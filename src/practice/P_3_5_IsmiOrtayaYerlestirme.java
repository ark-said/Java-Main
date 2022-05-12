package practice;

import java.util.Scanner;

public class P_3_5_IsmiOrtayaYerlestirme {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ilk ismi giriniz : ");
		String name1=scan.next();
		
		System.out.println("Ikinci ismi giriniz : ");
		String name2=scan.next();
		
		ortasinaEkle(name1,name2);
		scan.close();
	}

	private static void ortasinaEkle(String n1, String n2) {
	
		if (n1.length()%2==0) {
			
		System.out.println(n1.substring(0, n1.length()/2)+n2+n1.substring(n1.length()/2));	
			
		} else {
System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
		}
		
		
	}

		
	}


