package day17_forLoops;

import java.util.Scanner;

public class C02_ForLoop {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi girin");
		String str = scan.nextLine();
		
for (int i = str.length()-1; i >=0 ;i--) {
	
	System.out.print(str.substring(i,i+1));
}		
		
		
scan.close();
	}

}
