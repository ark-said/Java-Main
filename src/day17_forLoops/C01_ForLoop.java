package day17_forLoops;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		
		
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen yuzden kucuk bir sayi giriniz");
		int num = scan.nextInt();
		
		
		for (int i = 1; i <=num; i++) {
			
			if (i%3==0 && i%5==0) {System.out.println("Java Guzeldir");} 
			
		
			else if (i%3==0) {System.out.println("Java");}
			
			
			else if (i%5==0) {System.out.println("Guzeldir");}
			
			else System.out.println(i);
			
			
		scan.close();
		
		
		
		
		
		}
			
		
	
	
	
	
	
	}

	

}
