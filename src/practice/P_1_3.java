package practice;

import java.util.Scanner;

public class P_1_3 {

	public static void main(String[] args) {
		
		
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Adinizi giriniz : ");
	
	String name=scan.next();
	
	System.out.print("Soyadinizi giriniz : ");
		
	String Surname=scan.next();
	
	System.out.print("Yasinizi giriniz : ");
	
	int age=scan.nextInt();
	
	System.out.print("Boyunuzu giriniz : ");
	
	int boy=scan.nextInt();
	
	System.out.print("Kilonuzu giriniz : ");
	
	int kilo=scan.nextInt();
	
	System.out.println("Benim Adým: "+name+"\n" +"Soyadim: "+Surname+"\n"+"Yasim: "+age+"\n" +"Boyum: "
			+ ""+boy+"cm"+"\n"+"Kilom: "+kilo+"kg");
	
	}

}
