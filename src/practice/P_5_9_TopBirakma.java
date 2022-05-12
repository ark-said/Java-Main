package practice;

import java.util.Scanner;

public class P_5_9_TopBirakma {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Topun biraklidigi ilk yuksekligi giriniz: ");
		
		double yukseklik= scan.nextDouble();
		
		double topunToplamYolu=0;
		
		int yerevurmaSayisi=0;
		
		do {
			
			yerevurmaSayisi++;
			topunToplamYolu+=yukseklik;
			yukseklik*=(0.75);
			topunToplamYolu+=yukseklik;
		}
		
		while (yukseklik>=1);
		
		System.out.println("topun vurma sayisi "+yerevurmaSayisi);
			System.out.println("topun aldigi toplam yol:"+topunToplamYolu );
			scan.close();
	
	
}}