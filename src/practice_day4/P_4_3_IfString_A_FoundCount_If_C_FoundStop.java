package practice_day4;

import java.util.Scanner;

public class P_4_3_IfString_A_FoundCount_If_C_FoundStop {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			
			System.out.println("Bir String giriniz: ");
		
			String str=scan.nextLine();
			int aMiktari=0;
			
			for (int i = 0; i < str.length(); i++) {
				
				
				
				if (str.toLowerCase().charAt(i)=='a') {
					
					aMiktari++;
					
					
				}else if(str.toLowerCase().charAt(i)=='c') {
					break;
				}
				
				
			}
			scan.close();
			System.out.println("Girdiginiz string'deki A sayisi: "+ aMiktari);
			
	} 

}
