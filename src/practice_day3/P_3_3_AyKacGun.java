package practice_day3;

import java.util.Scanner;

public class P_3_3_AyKacGun {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Gununu ogrenmek istediginiz ayin numarasini yaziniz : ");
		int ayNo=scan.nextInt();
		
		switch (ayNo) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:

			System.out.println("Girdiginiz ay 31 Gun");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			

			System.out.println("Girdiginiz ay 30 Gun");
			break;

		case 2:
			
			System.out.println("Yili Giriniz");
			int yil=scan.nextInt();
			
			if(yil%4==0) {System.out.println("Girdiginiz ay 29 Gun"); }
			
			
			else {System.out.println("Girdiginiz ay 28 Gun");}
		break;

		default:
			System.out.println("Hatali bir ay numarasi girdiniz.");
			break;
		}
		
scan.close();		
	}

}
