package practice;

import java.util.Scanner;

public class P_5_4_IndexiTekSayi {

	public static void main(String[] args) {
	
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Bir metin giriniz");
		String str=scan.nextLine();
		
		
		int index=0;
		
		do {
		if (index%2==1) {
			System.out.print(str.charAt(index)+" ");
			
		}
		index++;
		

	} while(index<str.length());
		scan.close();
	} 
}

