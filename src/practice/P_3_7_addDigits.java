package practice;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class P_3_7_addDigits {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		int num=scan.nextInt();
		
		addDigits(num);
		
		
		scan.close();
		

	}

	private static int addDigits(int num) {
	well("good job");
		for (int i = 0; i < 5; i++) {
			num=sum(num);
		
		
		if (num<10) 
			break;
		
			
		}
		
		return sum(num); } 

	private static void well(String text) {
		System.out.println("See the method is working "+text);
		doneGood("you made it!");
	
	}

	private static void doneGood(String mtext) {
		System.out.println("It worked.. Again: "+mtext);
		
	}

	
	private static int sum(int num) {
	String str=String.valueOf(num);
	int toplam=0;
	int rakam=0;
	
	
while (num>0) { rakam=num%10;
toplam+=rakam;
num/=10;
	
}
	
	System.out.println("Girdiginiz sayinin rakamlar toplami:" +toplam);
	
	
	
	
	
		return toplam;
	}
		
	}


