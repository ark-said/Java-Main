package practice;

import java.util.Scanner;

public class P_3_6_BirimCevirme {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
		
		System.out.println("********\nCevrilebilecek birimler su sekildedir : \n********\n mil>km saat>saniye kg>gram");
		System.out.println("\nCevirilecek birimi giriniz : ");
		String birim=scan.next();
		
		System.out.println("Cevirilecek birimin deðerini giriniz : ");
		Double miktar=scan.nextDouble();
		
		cevir(birim,miktar);
		scan.close();

	}

	private static void cevir(String brm, double mktr) {
		
		switch (brm) {
		case "saat":
			System.out.println("Girilen saatin saniye deðeri : "+mktr*60*60+ "saniye");
			break;
			
		case "mil":
			
			System.out.println("Girilen milin kilometre degeri : "+mktr*1.6+"km");
			
			break;
			
		case "kg":
	
			System.out.println("Girilen kg'nin gram degeri : " + mktr*1000+"gram");
	break;

		default:
			
			System.out.println("Hatali veri girdiniz.");
			break;
		}
		
		
	} 

}
