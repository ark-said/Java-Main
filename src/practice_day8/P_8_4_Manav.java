package practice_day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_8_4_Manav {
	static List <String> urunListesi = new ArrayList<>();
	static List <Double> urunFiyatlari = new ArrayList<>();
	static double toplanOdenecekTutar; 



	public static void main(String[] args) {
		
		urunListesi.add("Domates - urun kodu : 1");
		urunListesi.add("Elma - urun kodu : 2");
		urunListesi.add("Muz - urun kodu : 3");
		urunListesi.add("Biber - urun kodu : 4");
		urunListesi.add("Patlýcan - urun kodu : 5");

		urunFiyatlari.add(5.0);
		urunFiyatlari.add(7.5);
		urunFiyatlari.add(11.3);
		urunFiyatlari.add(8.7);
		urunFiyatlari.add(9.2); 



System.out.println(urunListesi);

musterSecim();
		
	}

	@SuppressWarnings("resource")
	private static void musterSecim() {
		Scanner scan = new Scanner(System.in);
		
		int secim=scan.nextInt();
		
		System.out.println("Sectiginiz urunden kac kilo alacaksiniz:  ");
		
		double kilo=scan.nextDouble();
		double urunTutari=urunFiyatlari.get(secim-1);
		double urunToplamTutar=kilo*urunTutari;
		toplanOdenecekTutar+=urunToplamTutar;
		System.out.println("Devam edeceksenize 1, kasa icin 2 seciniz...");
		
		int karar=scan.nextInt();
		
		if (karar==1) {
			musterSecim();
			
		} else {kasa();}
			
			
			
		}

	private static void kasa() {
	System.out.println("Alisverisiniz toplam tutari: "+ toplanOdenecekTutar);
		
	}
		
	

}
